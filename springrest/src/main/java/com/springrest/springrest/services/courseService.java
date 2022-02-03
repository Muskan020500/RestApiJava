package com.springrest.springrest.services;

import com.springrest.springrest.entities.course;

import java.util.List;

public interface courseService {
    public  List<course> getCourse();
    public course getSingleCourse(long courseId);
    public course addCourse(course c);
    public course updateCourse(course c);
    public course deleteCourse(course c);
}
