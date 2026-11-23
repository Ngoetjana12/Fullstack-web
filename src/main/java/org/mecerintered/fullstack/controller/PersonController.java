package org.mecerintered.fullstack.controller;

import org.mecerintered.fullstack.entity.Person;
import org.mecerintered.fullstack.service.PersonService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public Person createPerson(){
        return service.createPerson();
    }
}
