package com.restFull_services.resFull_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class filltering_controller1 {
    @GetMapping("/filltering-static ")
    public filter_example getfilter1(){
        return new filter_example("ABC",200,1234);
    }
}
