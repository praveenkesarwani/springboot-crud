package com.courseapplication.courseapplication.services;

import com.courseapplication.courseapplication.entities.Course;

import java.util.List;

public interface CourseService {
    public List<Course> getCourses();

    public Course getCourse(long courseId);

    public Course addCourse(Course course);

    public Course updateCourse(Course courses);

    public void deleteCourse(long courseId);
}
