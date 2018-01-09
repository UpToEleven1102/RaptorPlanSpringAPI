package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.data.entity.AttributeEntity;
import com.raptorplan.raptorplan.data.entity.DisciplineEntity;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.request.CourseRequest;
import com.raptorplan.raptorplan.model.response.CourseResponse;
import com.raptorplan.raptorplan.model.response.DisciplineResponse;
import com.raptorplan.raptorplan.service.CourseService;
import com.raptorplan.raptorplan.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
    private DisciplineService disciplineService;

    @Autowired
    public CourseResource(CourseService courseService, ConversionService conversionService,
                          DisciplineService disciplineService){
        this.courseService = courseService;
        this.conversionService = conversionService;
        this.disciplineService = disciplineService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Page<CourseResponse>> getCourses(Pageable page){
        return new ResponseEntity<Page<CourseResponse>>(this.courseService.getCourses(page),HttpStatus.OK);
    }

    @RequestMapping(path = "/attribute/{attr}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<CourseResponse>> getByAttributeCode(@PathVariable String attr){
        List<CourseResponse> response = courseService.getCoursesByAttribute(attr);
        return new ResponseEntity<>(response,HttpStatus.OK);
    }

    @RequestMapping(path = "/discipline/{discipline}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Page<CourseResponse>> getByDisciplineCode(@PathVariable String discipline, Pageable pageable){
        Page<CourseResponse> response = courseService.getCoursesByDisciplineCode(discipline, pageable);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
        consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> createCourse(@RequestBody CourseRequest courseRequest){
        CourseResponse response = this.courseService.createCourse(courseRequest);
        return new ResponseEntity<CourseResponse>(response,HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{courseCode}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<CourseResponse> getByCode(@PathVariable(name = "courseCode") String code){
        CourseResponse response = courseService.getCourseByCode(code);
        return new ResponseEntity<CourseResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "/{courseId}", method = RequestMethod.DELETE)
    public void deleteCourse(@PathVariable Long courseId){
        this.courseService.deleteCourse(courseId);
    }
}
