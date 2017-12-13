package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.AttributeRequest;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import com.raptorplan.raptorplan.service.AttributeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.ATTRIBUTE_PATH)
public class AttributeResource {

    AttributeService service;

    @Autowired
    public AttributeResource( AttributeService service){
        this.service = service;
    }


    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AttributeResponse> addAttribute(@RequestBody AttributeRequest attribute){
        AttributeResponse response = service.create(attribute);
        return new ResponseEntity<AttributeResponse>(response, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{attributeId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AttributeResponse> getAttribute(@PathVariable Long attributeId) {
        AttributeResponse response = service.get(attributeId);
        return new ResponseEntity<AttributeResponse>(response, HttpStatus.OK);
    }


}
