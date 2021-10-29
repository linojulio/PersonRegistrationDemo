package linojulio.person.registration.demo.web.controller;

import linojulio.person.registration.demo.input.boundary.PersonInputService;
import linojulio.person.registration.demo.web.dto.request.NewPersonDTO;
import linojulio.person.registration.demo.web.dto.response.RegisteredPeopleDTO;
import linojulio.person.registration.demo.web.dto.response.RegisteredPersonDTO;
import linojulio.person.registration.demo.web.mapper.MapToDTO;
import linojulio.person.registration.demo.web.mapper.MapToInput;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/v1/person")
@AllArgsConstructor
public class PersonController {

    @Autowired
    private PersonInputService personInputService;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping
    public RegisteredPersonDTO addPerson(
            @RequestBody NewPersonDTO newPerson
    ) {

        logger.info("Add new Person V1...");

        return MapToDTO.toDTO(
                personInputService.addPerson(
                        MapToInput.toInput(newPerson)
                )
        );
    }

    @GetMapping
    public RegisteredPeopleDTO getRegisteredPeople() {
        return MapToDTO.toDTO(
                personInputService.getRegisteredPeople()
        );
    }

    @DeleteMapping("/{id}")
    public void deletePerson(
            @RequestParam(value = "id") String personId
    ) {

    }
}
