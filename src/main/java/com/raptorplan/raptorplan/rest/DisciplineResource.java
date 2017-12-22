package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.customObject.DisciplineCustom;
import com.raptorplan.raptorplan.model.request.DisciplineRequest;
import com.raptorplan.raptorplan.model.response.DisciplineResponse;
import com.raptorplan.raptorplan.service.DisciplineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.DISCIPLINE_PATH)
public class DisciplineResource {
    private DisciplineService service;

    @Autowired
    public DisciplineResource(DisciplineService service){
        this.service = service;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<DisciplineCustom>> getAll(){
        return new ResponseEntity<List<DisciplineCustom>>(this.service.getAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DisciplineResponse> create(@RequestBody DisciplineRequest requestObj){
        System.out.println("Discipline create");
        return new ResponseEntity<DisciplineResponse>(new DisciplineResponse(), HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{code}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<DisciplineResponse> getByCode(@PathVariable String code){
        return new ResponseEntity<DisciplineResponse>(service.getByCode(code), HttpStatus.OK);
    }
}
