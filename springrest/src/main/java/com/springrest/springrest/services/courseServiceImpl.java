package com.springrest.springrest.services;

import com.springrest.springrest.entities.course;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class courseServiceImpl implements courseService{

    List<course> list_of_courses;

    public courseServiceImpl() {
        list_of_courses = new ArrayList<>();
        list_of_courses.add(new course(157,"Java Course","this course is for learning java8"));
        list_of_courses.add(new course(1998,"Spring Boot Course","Creating rest api using spring"));

    }

    @Override
    public List<course> getCourse() {
        return list_of_courses;
    }

    @Override
    public course getSingleCourse(long courseId) {
        course c = null;
        for (course c1:list_of_courses){
            if (c1.getId() == courseId){
                c = c1;
                break;
            }
        }

        return c;
    }

    @Override
    public course addCourse(course c) {
        list_of_courses.add(c);
        return c;
    }
}
