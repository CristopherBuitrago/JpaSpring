package com.jpaspring.jpa_app.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jpaspring.jpa_app.entities.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{
    List<Person> findByProgrammingLanguage
}
