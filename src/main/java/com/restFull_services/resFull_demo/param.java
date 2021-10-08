package com.restFull_services.resFull_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class param {

    @GetMapping("/user-param")
    public String getUser(@RequestParam (name= "userName")String Name){
        return "Hello "+Name;
    }

}
