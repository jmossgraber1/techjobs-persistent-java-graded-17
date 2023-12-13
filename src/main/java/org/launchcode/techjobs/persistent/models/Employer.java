package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
@Entity
public class Employer extends AbstractEntity {


    public void setLocation(String location) {
        this.location = location;
    }

    @NotBlank(message = "Employer is required")
    @Size(min = 3, max = 200)
    private String location;
    public String getLocation() {
        return location;}
    public Employer(){}

    //1. add string for location
    //2. limit location to one instance ***HOW TO?
    //3. att @ Entity anno and Hibernate constructor
    //4. do something similar w/ Skill class
}
