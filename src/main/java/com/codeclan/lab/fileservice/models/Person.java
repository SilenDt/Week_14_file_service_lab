package com.codeclan.lab.fileservice.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "people")
public class Person {

    //INSTANCE VARIABLES:
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    //ONE TO MANY: one person has many folders
    @OneToMany(mappedBy = "person")
    @JsonIgnoreProperties({"person"})
    private List<Folder> folders;


    //CONSTRUCTOR:
    public Person(String name) {
        this.name = name;
    }
    //BLANK CONSTRUCTOR:
    public Person() {};

    //GETTERS AND SETTERS:
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public ArrayList<Folder> getFolders() {
//        return folders;
//    }
//
//    public void setFolders(ArrayList<Folder> folders) {
//        this.folders = folders;
//    }
}
