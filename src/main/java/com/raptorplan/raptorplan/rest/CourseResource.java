package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.request.CourseRequest;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import com.raptorplan.raptorplan.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.print.attribute.standard.Media;
import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.COURSE_PATH)
public class CourseResource {
    private CourseService courseService;
    private ConversionService conversionService;

    @Autowired
    public CourseResource(CourseService courseService, ConversionService conversionService){
        this.courseService = courseService;
        this.conversionService = conversionService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<CourseResponse>> getCourses(){
        return new ResponseEntity<List<CourseResponse>>(this.courseService.getCourses(),HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> createCourse(@RequestBody CourseRequest courseRequest){
        CourseResponse response = this.courseService.createCourse(courseRequest);
        return new ResponseEntity<CourseResponse>(response,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{courseCode}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> getByCode(@PathVariable(name = "courseCode") String code){
        System.out.println("Get course by code");
        CourseResponse response = courseService.getCourseByCode(code);
        return new ResponseEntity<CourseResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable Long courseId){
        this.courseService.deleteCourse(courseId);
    }
}
