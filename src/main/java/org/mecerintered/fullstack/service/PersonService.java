package org.mecerintered.fullstack.service;

import org.mecerintered.fullstack.dto.PersonRequestDTO;
import org.mecerintered.fullstack.dto.PersonResponseDTO;
import org.mecerintered.fullstack.entity.Person;
import org.mecerintered.fullstack.repo.PersonRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public PersonResponseDTO createPerson(PersonRequestDTO requestObject){

        Person person = new Person();
        person.setName(requestObject.name());
        person.setEmail(requestObject.email());

        Person savedP = repository.save(person);
        PersonResponseDTO response = new PersonResponseDTO(savedP.getId(), savedP.getName(), savedP.getEmail());
        //response.toResponse(person);

        return response;
    }

    public List<PersonResponseDTO> getAllPeople(){

        List<PersonResponseDTO> allPeople = new ArrayList<>();

        for(Person person: repository.findAll()){

            PersonResponseDTO responseDTO = new PersonResponseDTO(
                    person.getId(),
                    person.getName(),
                    person.getEmail()
            );

            allPeople.add(responseDTO);
        }
        return allPeople;
    }

    public PersonResponseDTO getPersonByName(String name){

        Person person = repository.findByName(name);

        PersonResponseDTO response = new PersonResponseDTO(person.getId(), person.getName(), person.getEmail());

        return response;
    }
}
