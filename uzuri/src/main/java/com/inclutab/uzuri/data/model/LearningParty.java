package com.inclutab.uzuri.data.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LearningParty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(unique = true, nullable=false)
    private String emailAddress;
    @Column(nullable = false)
    private String password;
    @Transient
    private Boolean enabled;
    @CreationTimestamp
    private LocalDateTime dateCreated;
    @OneToMany
    private List<Authority> authorities;

    public LearningParty(String emailAddress, String password, Authority authority) {
        this.emailAddress = emailAddress;
        this.password = password;
        addAuthority(authority);
        this.enabled = false;
    }

    private void addAuthority(Authority authority) {
        if (authorities == null){
            this.authorities = new ArrayList<>();
        }
        authorities.add(authority);
    };
}
