package com.restFull_services.resFull_demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class versioning_controller  {


    //uri===============================================
    @GetMapping("v1person")
    public versioning_person1 versioningPerson1(){
        return new versioning_person1("A");
    }
    @GetMapping("v2person")
    public versioning_person2 versioningPerson2(){
        return new versioning_person2(new Name("A","xyz"));
    }

    //param-------------------


    @GetMapping(value = "v1person/param",params = "version=1")
    public versioning_person1 versioningPerson1_param(){
        return new versioning_person1("A");
    }
    @GetMapping(value="v2person/params",params = "version=2")
    public versioning_person2 versioningPerson2_param(){
        return new versioning_person2(new Name("A","xyz"));
    }


    //header-----------------------------------


    @GetMapping(value = "v1person/header",headers = "X-API-VERSION=1")
    public versioning_person1 versioningPerson1_header(){
        return new versioning_person1("A");
    }
    @GetMapping(value= "v2person/header",headers = "X-API-VERSION=2")
    public versioning_person2 versioningPerson2_header(){
        return new versioning_person2(new Name("A","xyz"));
    }


}
