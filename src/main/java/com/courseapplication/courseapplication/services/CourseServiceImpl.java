package com.courseapplication.courseapplication.services;

import com.courseapplication.courseapplication.dao.CourseDao;
import com.courseapplication.courseapplication.entities.Course;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {

    @Autowired
    private CourseDao courseDao;

    @Override
    public List<Course> getCourses() {
        return courseDao.findAll();
    }

    @Override
    public Course getCourse(long courseId) {
        return courseDao.findById(courseId).get();
    }

    @Override
    public Course addCourse(Course course) {
        courseDao.save(course);
        return course;
    }

    @Override
    public Course updateCourse(Course course) {
        courseDao.save(course);
        return course;
    }


    @Override
    public void deleteCourse(long courseId) {
        Course entity = courseDao.findById(courseId).get();
        courseDao.delete(entity);
    }
}
