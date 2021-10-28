package linojulio.person.registration.demo.usecase;

import linojulio.person.registration.demo.input.boundary.PersonInputService;
import linojulio.person.registration.demo.input.boundary.model.RegisteredPeopleResponseInput;
import linojulio.person.registration.demo.input.boundary.model.RegisteredPersonResponseInput;
import linojulio.person.registration.demo.output.boundary.PersonOutputService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonUsecase implements PersonInputService {

    @Autowired
    private final PersonOutputService personOutputService;

    @Override
    public RegisteredPersonResponseInput addPerson() {
        return null;
    }

    @Override
    public RegisteredPeopleResponseInput getRegisteredPeople() {
        return null;
    }

    @Override
    public HttpStatus deletePerson() {
        return null;
    }
}
