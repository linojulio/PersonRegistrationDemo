package linojulio.person.registration.demo.input.boundary;

import linojulio.person.registration.demo.input.boundary.model.RegisteredPeopleResponseInput;
import linojulio.person.registration.demo.input.boundary.model.RegisteredPersonResponseInput;
import org.springframework.http.HttpStatus;

public interface PersonInputService {
    public RegisteredPersonResponseInput addPerson();
    public RegisteredPeopleResponseInput getRegisteredPeople();
    public HttpStatus deletePerson();
}
