package com.inclutab.uzuri.data.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Data
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
}
