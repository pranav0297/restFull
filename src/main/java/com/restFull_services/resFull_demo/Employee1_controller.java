package com.restFull_services.resFull_demo;

import io.swagger.annotations.ApiOperation;
import org.apache.catalina.util.ResourceSet;
import org.apache.tomcat.util.file.ConfigurationSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.linkTo;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.methodOn;

@RestController
public class Employee1_controller {


   @ApiOperation(value = "All the Employee detail in list dorm ",response = Employee1.class)
    @GetMapping("/Employee-find")
    public List<Employee1> employeeList1(){
        return Employe_dao.findAll();
    }


    @ApiOperation(value = "Find one employee by passing id",response = Employee1.class)
    @GetMapping("/Employee-one/{id}")
    public EntityModel<Employee1>employeeList2(@PathVariable int id){
         Employee1 e= Employe_dao.findOne(id);
         if(e== null)
             throw new UserNotFoundException("id-"+id);

        EntityModel<Employee1> resourse = EntityModel.of(e);
        WebMvcLinkBuilder linkTo =linkTo(methodOn(this.getClass()).employeeList2(id));

         resourse.add(linkTo.withRel("all-user"));
          return resourse;
    }


    @ApiOperation(value = "Create employee by POST Api",response = Employee1.class)
    @PostMapping("/create-employee")
    public void create( @RequestBody Employee1 employee){
        Employee1 savedData = Employe_dao.save(employee);
    }

    @ApiOperation(value = "Delelte an employee by id",response = Employee1.class)

    @DeleteMapping("/Employee-delete/{id}")
    public void employeeList3(@PathVariable int id){
        Employee1 e= Employe_dao.deleteById(id);
        if(e== null){
            throw new UserNotFoundException("id-"+id);
        }

    }

}
