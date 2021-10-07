package com.restFull_services.resFull_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Hello_world_controller {
    @RequestMapping(method = RequestMethod.GET,path = "/hello_world")
//    @GetMapping(path = "/hello_world")

    public String Hello(){
        return "Hello World"; 
    }
}
