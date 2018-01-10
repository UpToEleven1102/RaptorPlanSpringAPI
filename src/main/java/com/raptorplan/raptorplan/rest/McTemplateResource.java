package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.McTemplateRequest;
import com.raptorplan.raptorplan.model.response.McTemplateResponse;
import com.raptorplan.raptorplan.service.McTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.MC_TEMPLATE_PATH)
public class McTemplateResource {
    McTemplateService serviceTransferTemplate;
    @Autowired
    public McTemplateResource(McTemplateService serviceTransferTemplate) {
        this.serviceTransferTemplate = serviceTransferTemplate;
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<McTemplateResponse> create(@RequestBody McTemplateRequest requestBody) {
        McTemplateResponse response = this.serviceTransferTemplate.create(requestBody);
        return new ResponseEntity<McTemplateResponse>(response, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<McTemplateResponse> getById(@PathVariable Long id) {
        McTemplateResponse response = this.serviceTransferTemplate.get(id);;
        return new ResponseEntity<McTemplateResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<McTemplateResponse> get(@RequestParam(name = "school") String schoolCode, @RequestParam(name = "major") String majorCode) {
        McTemplateResponse response = this.serviceTransferTemplate.getBySchoolAndMajor(schoolCode,majorCode);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<McTemplateResponse>> getAll(){
        List<McTemplateResponse> response = this.serviceTransferTemplate.getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
