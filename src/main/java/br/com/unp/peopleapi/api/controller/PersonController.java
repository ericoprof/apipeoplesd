package br.com.unp.peopleapi.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.unp.peopleapi.api.model.PersonInputDTO;
import br.com.unp.peopleapi.api.model.PersonOutDTO;
import br.com.unp.peopleapi.assembler.PersonAssembler;
import br.com.unp.peopleapi.domain.service.PersonService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
@RequestMapping("/people")
public class PersonController {

    private PersonAssembler personAssembler;
    private PersonService personService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public PersonOutDTO getMethodName(@RequestBody final @Valid PersonInputDTO personInputDTO) {
        return personAssembler.toDto(personService.register(personAssembler.toPerson(personInputDTO)));
    }
}
