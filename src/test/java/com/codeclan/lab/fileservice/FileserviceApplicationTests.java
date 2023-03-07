package com.codeclan.lab.fileservice;

import com.codeclan.lab.fileservice.models.Person;
import com.codeclan.lab.fileservice.repositories.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FileserviceApplicationTests {

	//DEPENDENCY INJECTION:
	@Autowired
	PersonRepository personRepository;

	@Test
	void contextLoads() {
	}

//	@Test
//	Person eilidh = new Person("Eilidh");
//	personRepository.save(person);

	@Test
	public void createPerson() {
		Person eilidh = new Person("Eilidh");
		personRepository.save(eilidh);
	}

}
