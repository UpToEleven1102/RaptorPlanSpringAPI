package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.McTemplateRequest;
import com.raptorplan.raptorplan.model.response.McTemplateResponse;
import com.raptorplan.raptorplan.service.McTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.MC_TEMPLATE_PATH)
public class McTemplateResource {
    private ConversionService conversionService;
    private McTemplateService mcTemplateService;

    @Autowired
    public McTemplateResource(ConversionService conversionService, McTemplateService mcTemplateService){
        this.conversionService = conversionService;
        this.mcTemplateService = mcTemplateService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<McTemplateResponse>> getAll(){
        return new ResponseEntity<List<McTemplateResponse>>(mcTemplateService.getAll(),HttpStatus.OK);
    }

    @RequestMapping(path = "/{major}")
    public ResponseEntity<McTemplateResponse> get(@PathVariable String major){
        return new ResponseEntity<McTemplateResponse>(mcTemplateService.getByMajor(major), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<McTemplateResponse> create(@RequestBody McTemplateRequest mcTemplateRequest){
        McTemplateResponse response = mcTemplateService.create(mcTemplateRequest);
        return new ResponseEntity<McTemplateResponse>(response, HttpStatus.CREATED);
    }
}
