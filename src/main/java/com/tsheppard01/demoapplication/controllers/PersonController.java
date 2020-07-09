package com.tsheppard01.demoapplication.controllers;

import com.tsheppard01.demoapplication.dto.PersonDto;
import com.tsheppard01.demoapplication.services.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@Controller
public class PersonController {

  @Autowired
  private PersonService personService;

  @RequestMapping("/persons")
  public ModelAndView index() {

    List<PersonDto> persons = personService.getAllPersons();

    ModelAndView modelAndView = new ModelAndView();
    modelAndView.addObject("persons", persons);
    return modelAndView;
  }
}
