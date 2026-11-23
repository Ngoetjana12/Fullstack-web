package org.mecerintered.fullstack.service;

import org.mecerintered.fullstack.entity.Person;
import org.mecerintered.fullstack.repo.PersonRepository;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    private final PersonRepository repository;

    public PersonService(PersonRepository repository) {
        this.repository = repository;
    }

    public Person createPerson(){
        Person person = new Person();
        return repository.save(person);
    }
}
