package com.restFull_services.resFull_demo;

import com.fasterxml.jackson.annotation.JsonFilter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//@JsonIgnoreProperties(value={"passwrd"})            // --- for static
@JsonFilter("Dynamic_filterExample")                  // --- for dyanamic
public class filter_example {

    private String name;

    private int id ;

    private int Passwrd;

    public filter_example(String name, int id, int passwrd) {
        super();
        this.name = name;
        this.id = id;
       this. Passwrd = passwrd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPasswrd() {
        return Passwrd;
    }

    public void setPasswrd(int passwrd) {
        Passwrd = passwrd;
    }
}
