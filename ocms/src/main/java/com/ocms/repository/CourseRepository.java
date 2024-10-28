package com.ocms.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ocms.entity.Course;

public interface CourseRepository extends JpaRepository<Course, Long>{

}
