package com.raptorplan.raptorplan.auth.rest;

import com.raptorplan.raptorplan.auth.model.request.UserRequest;
import com.raptorplan.raptorplan.auth.model.response.UserResponse;
import com.raptorplan.raptorplan.auth.service.SecurityService;
import com.raptorplan.raptorplan.auth.service.UserService;
import com.raptorplan.raptorplan.auth.validator.UserValidator;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodType;
@CrossOrigin
@RestController
@RequestMapping(path = ResourceConstant.USER_PATH)
public class UserController {
    private UserService userService;
    private SecurityService securityService;
    private UserValidator userValidator;

    @Autowired
    public UserController(UserService userService,SecurityService securityService, UserValidator userValidator){
        this.userService = userService;
        this.securityService = securityService;
        this.userValidator = userValidator;
    }

    @RequestMapping(path = "/registration",method = RequestMethod.POST,produces = MediaType.APPLICATION_JSON_UTF8_VALUE, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<?> registration(@RequestBody UserRequest requestBody, BindingResult bindingResult){
        userValidator.validate(requestBody,bindingResult);

        if(bindingResult.hasErrors()){
            return new ResponseEntity<Object>(bindingResult.getAllErrors(), HttpStatus.BAD_REQUEST);
        }
        UserResponse response = userService.save(requestBody);
        securityService.autoLogin(requestBody.getEmail(),requestBody.getPasswordConfirm());
        return new ResponseEntity<Object>(response,HttpStatus.OK);
    }
}
