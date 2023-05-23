package com.learn.controller;

import com.learn.dto.CourseDTO;
import com.learn.dto.ResponseWrapper;
import com.learn.service.CourseService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/courses/api/v3")
public class CourseController_ResponseWrapper {

    private final CourseService courseService;


    public CourseController_ResponseWrapper(CourseService courseService) {
        this.courseService = courseService;

    }

    @GetMapping
    public ResponseEntity<ResponseWrapper> getCourse(){

        return ResponseEntity
                .status(HttpStatus.ACCEPTED)
                .header("Version", "Learn.V3")
                .body(new ResponseWrapper("courses successfully retrieved", courseService.getCourses()));
    }

    @GetMapping("{id}")
    public ResponseEntity<ResponseWrapper> getCourseById(@PathVariable ("id") long id){
        return ResponseEntity.ok(new ResponseWrapper("course: " + id + " retrieved", courseService.getCourseById(id)));
    }
}
