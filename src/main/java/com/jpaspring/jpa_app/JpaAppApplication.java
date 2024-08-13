package com.jpaspring.jpa_app;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.jpaspring.jpa_app.entities.Person;
import com.jpaspring.jpa_app.repositories.PersonRepository;

import jakarta.transaction.Transactional;

@SpringBootApplication
public class JpaAppApplication implements CommandLineRunner{

	@Autowired
	PersonRepository personRepository;

	public static void main(String[] args) {
		SpringApplication.run(JpaAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception{
		create();
	}

	@Transactional
	public void create(){
		Scanner scanner = new Scanner(System.in);

		System.out.println("Ingrese el nombre: ");
		String name = scanner.next();

		System.out.println("ingrese el apellido: ");
		String lastname = scanner.next();

		System.out.println("Ingrese el lenguaje de programacion: ");
		String programmingLanguage = scanner.next();
		scanner.close();

		Person person = new Person(null, name, lastname, programmingLanguage);

		Person newPerson = personRepository.save(person);

		System.out.println(newPerson);
	}

}
