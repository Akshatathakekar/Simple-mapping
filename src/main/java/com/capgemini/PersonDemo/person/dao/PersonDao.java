package com.capgemini.PersonDemo.person.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.capgemini.PersonDemo.entity.Person;

@Repository
public interface PersonDao extends JpaRepository<Person, Integer> {

	
}
