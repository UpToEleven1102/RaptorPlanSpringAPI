package com.raptorplan.raptorplan.auth.rest;

import com.raptorplan.raptorplan.auth.model.request.RoleRequest;
import com.raptorplan.raptorplan.auth.model.response.RoleResponse;
import com.raptorplan.raptorplan.auth.service.RoleService;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.ROLE_PATH)
public class RoleController {
    private RoleService roleService;

    @Autowired
    public RoleController(RoleService roleService){
        this.roleService = roleService;
    }

    @RequestMapping(path = "", method = RequestMethod.POST, produces = MediaType.APPLICATION_JSON_UTF8_VALUE,
    consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RoleResponse> create(@RequestBody RoleRequest requestBody) {
        return new ResponseEntity<RoleResponse>(roleService.create(requestBody), HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{id}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<RoleResponse> find(@PathVariable Long id) {
        return new ResponseEntity<RoleResponse>(roleService.getById(id),HttpStatus.OK);
    }

}
