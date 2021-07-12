package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
public class Employer extends AbstractEntity {

    @NotBlank(message = "Location required.")
    @Size(min = 2, max = 255, message = "Location must between 2 and 255 characters.")
    private String location;

    public Employer(){}

    public String getLocation() {
        return location;
    }

    public void  setLocation(String location){
        this.location = location;
    }


}
