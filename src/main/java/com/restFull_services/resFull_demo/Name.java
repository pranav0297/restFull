package com.restFull_services.resFull_demo;

public class Name {
    private String First_Name ;
    private String Last_Name;

    public Name(){
        super();
    }

    public Name(String first_Name, String last_Name) {
        First_Name = first_Name;
        Last_Name = last_Name;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }
}
