package br.com.unp.peopleapi.api.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.unp.peopleapi.api.model.PersonInputDTO;
import br.com.unp.peopleapi.api.model.PersonOutDTO;
import jakarta.validation.Valid;


@RestController
@RequestMapping("/people")
public class PersonController {

    @PostMapping("/create")
    public PersonOutDTO getMethodName(@RequestBody final @Valid PersonInputDTO personInputDTO) {
        return null;
    }
}
