package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.Attribute;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.request.CourseRequest;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import com.raptorplan.raptorplan.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    public CourseResource(CourseService courseService){
        this.courseService = courseService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> getCourses(){
        return new ResponseEntity<>(new CourseResponse(),HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> addCourse(@RequestBody CourseRequest courseRequest){
        CourseResponse response = courseService.createCourse(courseRequest);
        return new ResponseEntity<CourseResponse>(response,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{courseCode}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> getByCode(@PathVariable(name = "courseCode") String code){
        System.out.println("Get course by code");
        CourseResponse response = courseService.getCourseByCode(code);
        return new ResponseEntity<CourseResponse>(response, HttpStatus.OK);
    }

//    @RequestMapping(path = "/{courseId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
//    public ResponseEntity<CourseResponse> getCourseById(@PathVariable Long courseId){
//        System.out.println("Get course by id");
//        CourseResponse response = new CourseResponse();
//        response.setId(1234);
//        response.setSubject("MATH");
//        response.setCode("MATH284");
//        response.setCredit(4);
//        response.setTitle("Linear Algebra");
//        Links link = new Links();
//        Self self = new Self();
//        self.setRef(ResourceConstant.COURSE_PATH+"/"+response.getId());
//        link.setSelf(self);
//        response.setLinks(link);
//
//        List<Attribute> attributes = new ArrayList<>();
//        attributes.add(new Attribute("art_distribution"));
//        attributes.add(new Attribute("natural_science_lab_distribution"));
//
////        response.setAttribute(attributes);
//        return new ResponseEntity<CourseResponse>(response, HttpStatus.OK);
//    }
}
