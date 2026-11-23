package org.mecerintered.fullstack.controller;

import org.mecerintered.fullstack.dto.PersonRequestDTO;
import org.mecerintered.fullstack.dto.PersonResponseDTO;
import org.mecerintered.fullstack.entity.Person;
import org.mecerintered.fullstack.service.PersonService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @PostMapping
    public PersonResponseDTO createPerson(@RequestBody PersonRequestDTO requestObject){
        return service.createPerson(requestObject);
    }

    @GetMapping
    public List<PersonResponseDTO> getAllPeople(){
        return service.getAllPeople();
    }

    @GetMapping("/{name}")
    public PersonResponseDTO getPersonByName(@PathVariable String name){
        return service.getPersonByName(name);
    }
}
