package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.TransferTemplateRequest;
import com.raptorplan.raptorplan.model.response.TransferTemplateResponse;
import com.raptorplan.raptorplan.service.McTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.TRAN_TEMPLATE_PATH)
public class TransferTemplateResource {
    McTemplateService serviceTransferTemplate;
    @Autowired
    public TransferTemplateResource(McTemplateService serviceTransferTemplate) {
        this.serviceTransferTemplate = serviceTransferTemplate;
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TransferTemplateResponse> create(@RequestBody TransferTemplateRequest requestBody) {
        TransferTemplateResponse response = this.serviceTransferTemplate.create(requestBody);
        return new ResponseEntity<TransferTemplateResponse>(response, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TransferTemplateResponse> getById(@PathVariable Long id) {
        TransferTemplateResponse response = this.serviceTransferTemplate.get(id);;
        return new ResponseEntity<TransferTemplateResponse>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TransferTemplateResponse> get(@RequestParam(name = "school") String schoolCode, @RequestParam(name = "major") String majorCode) {
        TransferTemplateResponse response = this.serviceTransferTemplate.getBySchoolAndMajor(schoolCode,majorCode);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @RequestMapping(path = "/all", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<TransferTemplateResponse>> getAll(){
        List<TransferTemplateResponse> response = this.serviceTransferTemplate.getAll();
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
