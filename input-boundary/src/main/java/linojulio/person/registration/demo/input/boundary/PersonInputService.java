package linojulio.person.registration.demo.input.boundary;

import linojulio.person.registration.demo.input.boundary.model.request.PersonRequestInput;
import linojulio.person.registration.demo.input.boundary.model.response.RegisteredPeopleResponseInput;
import linojulio.person.registration.demo.input.boundary.model.response.RegisteredPersonResponseInput;
import org.springframework.http.HttpStatus;

public interface PersonInputService {
    public RegisteredPersonResponseInput addPerson(PersonRequestInput personRequestInput);
    public RegisteredPeopleResponseInput getRegisteredPeople();
    public HttpStatus deletePerson();
}
