package com.courseapplication.courseapplication.controller;

import com.courseapplication.courseapplication.entities.Course;
import com.courseapplication.courseapplication.services.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;

    /**
     * Get all the courses
     * @return
     */
    @GetMapping("/courses")
    public List<Course> getCourses() {
        return this.courseService.getCourses();
    }

    /**
     * get single course
     * @param courseId
     * @return
     */
    @GetMapping("/courses/{courseId}")
    public Course getCourse(@PathVariable String courseId){
            return this.courseService.getCourse(Long.parseLong(courseId));
    }

    /**
     * Add courses
     */
    @PostMapping("/courses")
    public Course addCourse(@RequestBody Course course){
        return this.courseService.addCourse(course);
    }

    /**
     * update existing course
     * @param courses
     * @return
     */
    @PutMapping("/courses")
    public Course updateCourses(@RequestBody Course courses){
        return this.courseService.updateCourse(courses);
    }

    @DeleteMapping("/courses/{courseId}")
    public ResponseEntity<HttpStatus> deleteCourse(@PathVariable String courseId){
        try {
            this.courseService.deleteCourse(Long.parseLong(courseId));
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>((HttpStatus.INTERNAL_SERVER_ERROR));
        }
    }
}
