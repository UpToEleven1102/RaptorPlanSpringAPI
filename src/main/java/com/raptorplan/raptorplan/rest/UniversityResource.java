package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.UniversityRequest;
import com.raptorplan.raptorplan.model.response.UniversityResponse;
import com.raptorplan.raptorplan.service.UniversityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.UNIVERSITY_PATH)
public class UniversityResource {
    @Autowired
    UniversityService service;

    @RequestMapping(path = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                    produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UniversityResponse> create(@RequestBody UniversityRequest requestBody){
        return new ResponseEntity<UniversityResponse>(this.service.create(requestBody), HttpStatus.CREATED);
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<UniversityResponse>> getAll(){
        return new ResponseEntity<List<UniversityResponse>>(this.service.getAll(),HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UniversityResponse> get(Long id){
        return new ResponseEntity<UniversityResponse>(this.service.get(id),HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
    public void delete(@PathVariable Long id){
        service.delete(id);
    }

}
