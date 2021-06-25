package com.adam.driver.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.adam.driver.models.Person;
import com.adam.driver.repositories.PersonRepository;

@Service
public class PersonService {
	private final PersonRepository personRepository;

	public PersonService(PersonRepository personRepository) {
		this.personRepository = personRepository;
	}
	
	public List<Person> allPersons(){
		return personRepository.findAll();
	}
	
	public Person createPerson(Person person) {
		return personRepository.save(person);
	}
	public List<Person> unlicensed(){
		return personRepository.findByLicenseIdIsNull();
	}
	public Person findPerson(Long id) {
		Optional <Person> optionalPerson = personRepository.findById(id);
		if (optionalPerson.isPresent()) {
			return optionalPerson.get();
		}
		else {
			return null;
		}
	}
}
