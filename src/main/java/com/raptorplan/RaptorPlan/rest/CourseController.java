package com.raptorplan.RaptorPlan.rest;

import com.raptorplan.RaptorPlan.model.response.CourseResponse;
import com.raptorplan.RaptorPlan.service.ControllerConstant;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(ControllerConstant.COURSE_RESOURCE_PATH)
public class CourseController {
    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> getAllCourses() {
        return new ResponseEntity<CourseResponse>(new CourseResponse(), HttpStatus.OK);
    }

}
