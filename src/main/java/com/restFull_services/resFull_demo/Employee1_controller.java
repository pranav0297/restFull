package com.restFull_services.resFull_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Employee1_controller {


 // All-list of Employeee----------------------------------------
    @GetMapping("/Employee-find")
    public List<Employee1> employeeList1(){
        return Employe_dao.findAll();
    }


  //by using path get One Employee-------and Exception Handling--------------------------------
    @GetMapping("/Employee-one/{id}")
    public void employeeList2(@PathVariable int id){
         Employee1 e= Employe_dao.findOne(id);
         if(e== null){
             throw new UserNotFoundException("id-"+id);
         }

    }


    // create user by POST-------------------and validation -----------------------
    @PostMapping("/create-employee")
    public void create(@Validated @RequestBody Employee1 employee){
        Employee1 savedData = Employe_dao.save(employee);
    }

// delete-by DELETE---------Exception Handling------------------------------------

    @DeleteMapping("/Employee-delete/{id}")
    public void employeeList3(@PathVariable int id){
        Employee1 e= Employe_dao.deleteById(id);
        if(e== null){
            throw new UserNotFoundException("id-"+id);
        }

    }


    @PutMapping ("/create-employee")
    public void update( @RequestBody Employee1 employee1){
        Employee1 savedData = Employe_dao.save(employee1);
    }


}
