package org.mecerintered.fullstack.repo;

import org.mecerintered.fullstack.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
