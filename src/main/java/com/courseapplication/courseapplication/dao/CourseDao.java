package com.courseapplication.courseapplication.dao;

import com.courseapplication.courseapplication.entities.Course;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course, Long>{
    
}
