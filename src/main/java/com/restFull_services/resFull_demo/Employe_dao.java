package com.restFull_services.resFull_demo;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employe_dao {
    static List<Employee1> l = new ArrayList<>();
 static {
     l.add(new Employee1(1, "A", 25));
     l.add(new Employee1(2, "B", 22));
     l.add(new Employee1(3, "C", 23));
 }
private static  int count=3;
 public static List<Employee1> findAll(){
     return l;
 }
 public static Employee1 save(Employee1 employee){
     if (employee.getId()==0)
     employee.setId(++count);
     l.add(employee);
     return employee;
 }


    public  static Employee1 findOne(int id){
       for(Employee1 e: l){
           if(e.getId()==id) {
               return e;
           }
       }
       return null;
    }

// delete------------------------------------------------------


    public  static Employee1 deleteById(int id){
        Iterator<Employee1> iterator = l.iterator();
        while(iterator.hasNext()){
            Employee1 employee1 = iterator.next();
            if(employee1.getId()==id) {
                iterator.remove();
                return employee1;
            }
        }
        return null;
    }

}
