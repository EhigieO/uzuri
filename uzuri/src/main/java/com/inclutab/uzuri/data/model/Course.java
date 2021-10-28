package com.inclutab.uzuri.data.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Data
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;
    @CreationTimestamp
    private LocalDate dateCreated;
    private LocalDate datePublished;
    private boolean isPublished;
    @ElementCollection
    private List<String> imageUrls;
    @UpdateTimestamp
    private LocalDate dateUpdated;
    @Column(length = 1000)
    private String description;
    private String language;
    private String duration;
    @ElementCollection
    private List<String> images;
    @ManyToOne
    private Instructor instructor;
    @ManyToMany
    private List<Student> students;

}
