package com.inclutab.uzuri.data.repository;

import com.inclutab.uzuri.data.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, Long> {
}
