package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.McAdvisingTemplateRequest;
import com.raptorplan.raptorplan.model.response.McAdvisingTemplateResponse;
import com.raptorplan.raptorplan.service.McAdvisingTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.ConversionService;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.ADVISING_TEMPLATE_PATH)
public class McAdvisingTemplateResource {
    private ConversionService conversionService;
    private McAdvisingTemplateService mcAdvisingTemplateService;

    @Autowired
    public McAdvisingTemplateResource(ConversionService conversionService, McAdvisingTemplateService mcAdvisingTemplateService){
        this.conversionService = conversionService;
        this.mcAdvisingTemplateService = mcAdvisingTemplateService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<McAdvisingTemplateResponse>> getAll(){
        return new ResponseEntity<List<McAdvisingTemplateResponse>>(mcAdvisingTemplateService.getAll(),HttpStatus.OK);
    }

    @RequestMapping(path = "/{major}")
    public ResponseEntity<McAdvisingTemplateResponse> get(@PathVariable String major){
        return new ResponseEntity<McAdvisingTemplateResponse>(mcAdvisingTemplateService.getByMajor(major), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<McAdvisingTemplateResponse> create(@RequestBody McAdvisingTemplateRequest mcAdvisingTemplateRequest){
        McAdvisingTemplateResponse response = mcAdvisingTemplateService.create(mcAdvisingTemplateRequest);
        return new ResponseEntity<McAdvisingTemplateResponse>(response, HttpStatus.CREATED);
    }
}
