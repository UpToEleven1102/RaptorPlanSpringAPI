package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.customObject.MajorCustom;
import com.raptorplan.raptorplan.model.request.MajorRequest;
import com.raptorplan.raptorplan.model.response.MajorResponse;
import com.raptorplan.raptorplan.service.MajorService;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ResourceConstant.MAJOR_PATH)
public class MajorResource {
    private MajorService service;

    public MajorResource(MajorService service){
        this.service = service;
    }

    @RequestMapping(path = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MajorResponse> create(@RequestBody MajorRequest majorRequest){
        MajorResponse response = this.service.create(majorRequest);
        return new ResponseEntity<MajorResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<MajorCustom>> getAll(){
        return new ResponseEntity<List<MajorCustom>>(service.getAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "/{id}",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<MajorResponse> get(@PathVariable Long id){
        return new ResponseEntity<MajorResponse>(service.getMajor(id), HttpStatus.OK);
    }
}
