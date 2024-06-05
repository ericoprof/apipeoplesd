package br.com.unp.peopleapi.domain.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.com.unp.peopleapi.domain.model.Person;
import br.com.unp.peopleapi.domain.repository.PersonRepository;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class PersonService {

    private PersonRepository personRepository;

    @Transactional
    public Person register(final Person person) {
        return personRepository.save(person);
    }

}
