package org.launchcode.techjobs.persistent.models;

import jakarta.persistence.Entity;

@Entity
public class Skill extends AbstractEntity {

    public void setDescription(String description) {
        this.description = description;
    }

    private String description;
    public String getDescription() {
        return description;
    }

    public Skill (){}
}
