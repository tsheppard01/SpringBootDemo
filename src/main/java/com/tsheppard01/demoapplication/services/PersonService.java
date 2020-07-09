package com.tsheppard01.demoapplication.services;

import com.tsheppard01.demoapplication.dto.PersonDto;
import com.tsheppard01.demoapplication.entities.Person;
import com.tsheppard01.demoapplication.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class PersonService {

  @Autowired
  private PersonRepository personRepository;

  public List<PersonDto> getAllPersons() {
    List<Person> person = new ArrayList<>();
    personRepository
        .findAll()
        .iterator()
        .forEachRemaining(person::add);

    return person.stream()
        .map(p -> new PersonDto(p.getForename()+ " " + p.getSurname(), p.getDob()))
        .collect(Collectors.toList());
  }
}
