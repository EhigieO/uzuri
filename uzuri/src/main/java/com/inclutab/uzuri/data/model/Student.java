package com.inclutab.uzuri.data.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    private LocalDate dob;
    @Transient
    private Integer age;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    @OneToOne
    private LearningParty learningParty;
    @ManyToMany
    @JoinTable
    private List<Course> courses;
}
