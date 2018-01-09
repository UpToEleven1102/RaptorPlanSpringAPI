package com.raptorplan.raptorplan.rest;

import com.raptorplan.raptorplan.model.request.TransferTemplateRequest;
import com.raptorplan.raptorplan.model.response.TransferTemplateResponse;
import com.raptorplan.raptorplan.service.TransferTemplateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.TRAN_TEMPLATE_PATH)
public class TransferTemplateResource {
    TransferTemplateService serviceTransferTemplate;
    @Autowired
    public TransferTemplateResource(TransferTemplateService serviceTransferTemplate) {
        this.serviceTransferTemplate = serviceTransferTemplate;
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TransferTemplateResponse> create(@RequestBody TransferTemplateRequest requestBody) {
        TransferTemplateResponse response = this.serviceTransferTemplate.create(requestBody);
        return new ResponseEntity<TransferTemplateResponse>(response, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<TransferTemplateResponse> get(@PathVariable Long id) {
        TransferTemplateResponse response = this.serviceTransferTemplate.get(id);;
        return new ResponseEntity<TransferTemplateResponse>(response, HttpStatus.OK);
    }
}
