package com.restFull_services.resFull_demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

import java.util.Locale;

@RestController
public class Hello_world_controller {

@Autowired
    private MessageSource messageSource;


    @GetMapping(path = "/hello_world")
    public String Hello() {
        return "Hello World";
    }

    @GetMapping(path = "/helloWorld_Internationalized")
    public String HelloWorld_Internationalized(@RequestHeader(value = "Accept-Language", required = false) Locale locale) {
        return messageSource.getMessage("good.morning.message",null,locale) ;
    }



}
