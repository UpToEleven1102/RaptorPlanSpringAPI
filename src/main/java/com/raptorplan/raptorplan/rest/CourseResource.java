package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.Attribute;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.COURSE_PATH)
public class CourseResource {
    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> getCourses(){
        return new ResponseEntity<CourseResponse>(new CourseResponse(),HttpStatus.OK);
    }

    @RequestMapping(path = "/{courseId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> getCourseById(@PathVariable Long courseId){
        CourseResponse response = new CourseResponse();
        response.setId(1234);
        response.setSubject("MATH");
        response.setCode("MATH284");
        response.setCredit(4);
        response.setTitle("Linear Algebra");
        Links link = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.COURSE_PATH+"/"+response.getId());
        link.setSelf(self);
        response.setLinks(link);

        List<Attribute> attributes = new ArrayList<>();
        attributes.add(new Attribute("art_distribution"));
        attributes.add(new Attribute("natural_science_lab_distribution"));

//        response.setAttribute(attributes);
        return new ResponseEntity<CourseResponse>(response, HttpStatus.OK);
    }
}
