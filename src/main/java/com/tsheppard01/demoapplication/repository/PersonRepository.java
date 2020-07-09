package com.tsheppard01.demoapplication.repository;

import com.tsheppard01.demoapplication.entities.Person;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface PersonRepository extends CrudRepository<Person, Long> {

}
