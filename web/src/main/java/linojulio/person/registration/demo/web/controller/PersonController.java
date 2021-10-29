package linojulio.person.registration.demo.web.controller;

import linojulio.person.registration.demo.input.boundary.PersonInputService;
import linojulio.person.registration.demo.web.dto.request.NewPersonDTO;
import linojulio.person.registration.demo.web.dto.response.RegisteredPersonDTO;
import linojulio.person.registration.demo.web.mapper.MapToDTO;
import linojulio.person.registration.demo.web.mapper.MapToInput;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/v1/person")
@AllArgsConstructor
public class PersonController {

    @Autowired
    private PersonInputService personInputService;

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @PostMapping
    public RegisteredPersonDTO addPerson(
            @RequestBody @Valid NewPersonDTO newPerson
    ) {

        logger.info("Add new Person V1...");

        return MapToDTO.toDTO(
                personInputService.addPerson(
                        MapToInput.toInput(newPerson)
                )
        );
    }

    @GetMapping
    public List<RegisteredPersonDTO> getRegisteredPeople() {

        logger.info("Find all registered people...");

        return MapToDTO.toDTO(
                personInputService.getRegisteredPeople()
        );
    }

    @GetMapping("/{document}")
    public RegisteredPersonDTO getPersonByDocument(
            @PathVariable String document
    ) {
        logger.info("Find registered  person by document...");

        return MapToDTO.toDTO(
                personInputService.getPersonByDocument(document)
        );
    }

    @DeleteMapping("/{personId}")
    public HttpStatus deletePerson(
            @PathVariable Long personId
    ) {
        logger.info("Delete Person by ID ...");

        return personInputService.deletePersonById(personId);
    }
}
