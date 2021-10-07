package com.restFull_services.resFull_demo;
import javax.validation.constraints.Size;

public class Employee1 {
    private int id ;
    @Size(min=2,message="name should atleast 2 character")
    private String name;

    private int age ;

    protected Employee1(){

    }

    public Employee1(int id, String name, int age) {
        super();
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
