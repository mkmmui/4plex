package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Description extends AbstractEntity {

    @NotBlank(message = "Description required.")
    @Size(min = 2, max = 255, message = "Description must between 2 and 255 characters.")
    private String description;

    @OneToMany
    @JoinColumn
    private List<Job> jobs = new ArrayList<>();

    public Description(){}

    public String getDescription() {
        return description;
    }

    public void  setDescription(String description){
        this.description = description;
    }

    public List<Job> getJobs() {
        return jobs;
    }

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;
    }

}
