package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.McTemplateRequest;
import com.raptorplan.raptorplan.model.response.McTemplateResponse;
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
@RequestMapping(path = ResourceConstant.MC_TEMPLATE_PATH)
public class McTemplateResource {
    private ConversionService conversionService;
    private McAdvisingTemplateService mcAdvisingTemplateService;

    @Autowired
    public McTemplateResource(ConversionService conversionService, McAdvisingTemplateService mcAdvisingTemplateService){
        this.conversionService = conversionService;
        this.mcAdvisingTemplateService = mcAdvisingTemplateService;
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<McTemplateResponse>> getAll(){
        return new ResponseEntity<List<McTemplateResponse>>(mcAdvisingTemplateService.getAll(),HttpStatus.OK);
    }

    @RequestMapping(path = "/{major}")
    public ResponseEntity<McTemplateResponse> get(@PathVariable String major){
        return new ResponseEntity<McTemplateResponse>(mcAdvisingTemplateService.getByMajor(major), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<McTemplateResponse> create(@RequestBody McTemplateRequest mcTemplateRequest){
        McTemplateResponse response = mcAdvisingTemplateService.create(mcTemplateRequest);
        return new ResponseEntity<McTemplateResponse>(response, HttpStatus.CREATED);
    }
}
