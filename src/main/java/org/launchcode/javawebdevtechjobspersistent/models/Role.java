package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Id;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role{

    @Id
    @Column (name = "roles_id")
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String name;

    public Role (){}

    public Role(String name) {
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name ;
    }

}