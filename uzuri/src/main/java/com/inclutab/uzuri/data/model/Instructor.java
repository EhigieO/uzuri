package com.inclutab.uzuri.data.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;


@Entity
@Data
public class Instructor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String firstName;
    private String lastName;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String specialisation;
    @Column(length= 1000)
    private String bio;
    @OneToOne
    private LearningParty learningParty;
    @OneToMany
    private List<Course> courses;
}
