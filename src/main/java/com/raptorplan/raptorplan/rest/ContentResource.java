package com.raptorplan.raptorplan.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(path = "")
public class ContentResource {

    @RequestMapping(path = "")
    public String administratingTools(){
        return "whatever";
    }
}
