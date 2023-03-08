package com.codeclan.lab.fileservice.contollers;

import com.codeclan.lab.fileservice.models.Person;
import com.codeclan.lab.fileservice.repositories.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PersonController {

    @Autowired
    PersonRepository personRepository;

    @GetMapping(value = "/people")
    public ResponseEntity<List<Person>> getAllPeople() {
        return new ResponseEntity<>(personRepository.findAll(), HttpStatus.OK);
    }



}
