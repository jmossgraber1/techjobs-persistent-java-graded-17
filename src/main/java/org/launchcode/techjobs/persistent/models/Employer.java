package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Employer extends AbstractEntity {
    public Employer(){}



    @OneToMany(mappedBy = "employer")
    @JoinColumn()
    private final List<Job> jobs = new ArrayList<>();
    public List<Job> getJobs() {
        return jobs;
    }

// TODO: OneToMany needs a name parameter - what should it be?

    @NotBlank(message = "Employer is required")
    @Size(min = 3, max = 200)
    private String location;
    public String getLocation() {return location;}
    public void setLocation(String location) {this.location = location;}


    //TODO: add public accessor methods to Employer.

}
