package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.data.entity.TemplateEntity;
import com.raptorplan.raptorplan.model.request.TemplateRequest;
import com.raptorplan.raptorplan.model.response.TemplateResponse;
import com.raptorplan.raptorplan.service.TemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ResourceConstant.TEMPLATE_PATH)
public class TemplateResource {
    private ConversionService conversionService;
    private TemplateService templateService;

    @Autowired
    public TemplateResource(ConversionService conversionService, TemplateService templateService){
        this.conversionService = conversionService;
        this.templateService = templateService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<TemplateResponse>> getAll(){
        return new ResponseEntity<List<TemplateResponse>>(templateService.getAll(),HttpStatus.OK);
    }

    @RequestMapping(path = "/{major}")
    public ResponseEntity<String> get(@PathVariable String major){
        return new ResponseEntity<String>(templateService.getByMajor(major).getJsonObject().toString(), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<String> create(@RequestBody TemplateRequest templateRequest){
        TemplateResponse response = templateService.create(templateRequest);
        return new ResponseEntity<String>(response.getJsonObject().toString(), HttpStatus.CREATED);
    }
}
