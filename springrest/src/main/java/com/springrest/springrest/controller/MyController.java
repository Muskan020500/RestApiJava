package com.springrest.springrest.controller;

import com.springrest.springrest.entities.course;
import com.springrest.springrest.services.courseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
@Autowired
    private courseService service;
    @GetMapping("/home")
    public String home(){
        return "changing the text of home";
    }

    //get the courses
    @GetMapping("/courses")
    public List<course> getCourse(){
       return this.service.getCourse();
    }
    @GetMapping("/courses/{courseId}")
    public  course getSingleCourse(@PathVariable String courseId){
        return this.service.getSingleCourse(Long.parseLong(courseId));
    }
    @PostMapping("/courses")
    public course addCourse(@RequestBody course c){
        return this.service.addCourse(c);
    }
    @PutMapping("/courses")
    public course updateCourse(@RequestBody course c){
        return this.service.updateCourse(c);
    }
    @DeleteMapping("/courses")
    public course deleteCourse(@RequestBody course c){
        return this.service.deleteCourse(c);
    }
    @DeleteMapping("/courses/{id}")
    public ResponseEntity<HttpStatus> deletecourse(@PathVariable String id){
        try {
            this.service.deletecourse(Long.parseLong(id));
            return new ResponseEntity<>(HttpStatus.OK);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
