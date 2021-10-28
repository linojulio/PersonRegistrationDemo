package linojulio.person.registration.demo.usecase;

import linojulio.person.registration.demo.input.boundary.PersonInputService;
import linojulio.person.registration.demo.input.boundary.model.RegisteredPeopleResponseInput;
import linojulio.person.registration.demo.input.boundary.model.RegisteredPersonResponseInput;
import linojulio.person.registration.demo.input.boundary.model.UpdatedPersonResponseInput;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
public class PersonUsecase implements PersonInputService {
    @Override
    public RegisteredPersonResponseInput addPerson() {
        return null;
    }

    @Override
    public RegisteredPeopleResponseInput getRegisteredPeople() {
        return null;
    }

    @Override
    public UpdatedPersonResponseInput updatePerson() {
        return null;
    }

    @Override
    public HttpStatus deletePerson() {
        return null;
    }
}
