package br.com.unp.peopleapi.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.unp.peopleapi.domain.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
