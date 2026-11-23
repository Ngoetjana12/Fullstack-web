package org.mecerintered.fullstack.dto;

import org.mecerintered.fullstack.entity.Person;

public record PersonRequestDTO(

        String name,
        String email
) {

    public Person toEntity(){

        Person person = new Person();
        person.setName(name);
        person.setEmail(email);

        return person;
    }
}
