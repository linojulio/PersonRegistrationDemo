package linojulio.person.registration.demo.web.controller;

import linojulio.person.registration.demo.input.boundary.PersonInputService;
import linojulio.person.registration.demo.web.dto.request.NewPersonDTO;
import linojulio.person.registration.demo.web.dto.response.RegisteredPeopleDTO;
import linojulio.person.registration.demo.web.mapper.MapToDTO;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/person")
@AllArgsConstructor
public class PersonController {

    @Autowired
    private final PersonInputService personInputService;

    @PostMapping
    public void addPerson(
            @RequestBody @Valid NewPersonDTO newPerson
    ) {
        System.out.println(newPerson);
    }

    @GetMapping
    public RegisteredPeopleDTO getRegisteredPeople() {
        return MapToDTO.toDTO(
                personInputService.getRegisteredPeople()
        );
    }

    @DeleteMapping("/{id}")
    public void deletePerson(
            @RequestParam(value = "id")
            String personId
    ) {

    }
}
