package com.capgemini.PersonDemo.person.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.PersonDemo.entity.Person;
import com.capgemini.PersonDemo.person.dao.PersonDao;
import com.capgemini.PersonDemo.person.service.PersonService;

@Service
public class PersonServiceImpl implements PersonService {
	
	@Autowired
	private PersonDao dao;
	
	public Person addPersonDetails()
	{
		Person person=new Person(101,"Akshata");
		dao.save(person);
		return person;
	}
	
	public Person getPersonDetails()
	{
		Person person=dao.findById(101).get();
		return person;
	}
	
	
}
