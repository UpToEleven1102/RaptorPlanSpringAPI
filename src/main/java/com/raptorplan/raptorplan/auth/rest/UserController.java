package com.raptorplan.raptorplan.auth.rest;

import com.raptorplan.raptorplan.auth.model.request.UserRequest;
import com.raptorplan.raptorplan.auth.model.response.UserResponse;
import com.raptorplan.raptorplan.auth.config.SecurityService;
import com.raptorplan.raptorplan.auth.service.UserService;
import com.raptorplan.raptorplan.auth.validator.UserValidator;
import com.raptorplan.raptorplan.rest.ResourceConstant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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

    @RequestMapping(path = "", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<UserResponse>> getAll(){
        return new ResponseEntity<List<UserResponse>>(userService.getAll(), HttpStatus.OK);
    }

    @RequestMapping(path = "", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
                produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UserResponse> create(@RequestBody UserRequest requestBody) {
        UserResponse response = userService.save(requestBody);
        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    @RequestMapping(path = "/{userId}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<UserResponse> get(@PathVariable Long userId) {
        UserResponse response = userService.findById(userId);
        return new ResponseEntity<UserResponse>(response, HttpStatus.OK);
    }

}
