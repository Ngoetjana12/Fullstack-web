package org.mecerintered.fullstack.dto;

import org.mecerintered.fullstack.entity.Person;

public record PersonResponseDTO(
        Long id,
        String name,
        String email
) {

    public PersonResponseDTO toResponse(Person person){

        return new PersonResponseDTO(
                person.getId(),
                person.getName(),
                person.getEmail()
        );
    }
}
