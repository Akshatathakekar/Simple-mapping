package com.capgemini.PersonDemo.personcontroller;

import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonDemo.entity.Person;
import com.capgemini.PersonDemo.person.service.PersonService;

@RestController
public class PersonController {

	private Logger logger = Logger.getLogger(PersonController.class);
	
	@Autowired
	private PersonService service;

	@RequestMapping("/")
	public Person addPerson() {
		Person person = service.addPersonDetails();
		logger.info(person);
		return person;
	}

	@RequestMapping("/get")
	public Person getPerson() {

		Person person = service.getPersonDetails();
		return person;
	}

}
