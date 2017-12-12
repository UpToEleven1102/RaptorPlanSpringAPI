package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.Attribute;
import com.raptorplan.raptorplan.model.Links;
import com.raptorplan.raptorplan.model.Self;
import com.raptorplan.raptorplan.model.request.AttributeRequest;
import com.raptorplan.raptorplan.model.response.AttributeResponse;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = ResourceConstant.ATTRIBUTE_PATH)
public class AttributeResource {

    @RequestMapping(path = "")
    public ResponseEntity<AttributeResponse> getAttribute() {
        AttributeResponse response = new AttributeResponse();
        return new ResponseEntity<AttributeResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<AttributeResponse> addAttribute(@RequestBody AttributeRequest attribute){
        AttributeResponse response = new AttributeResponse();
        response.setName(attribute.getName());
        Links links = new Links();
        Self self = new Self();
        self.setRef(ResourceConstant.ATTRIBUTE_PATH + "/whateverthefuckidis");
        links.setSelf(self);
        response.setLinks(links);
        return new ResponseEntity<AttributeResponse>(response, HttpStatus.CREATED);
    }
}
