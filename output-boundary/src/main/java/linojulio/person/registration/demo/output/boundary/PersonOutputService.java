package linojulio.person.registration.demo.output.boundary;

import linojulio.person.registration.demo.output.boundary.model.RegisteredPeopleResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.RegisteredPersonResponseOutput;
import org.springframework.http.HttpStatus;

public interface PersonOutputService {
    public RegisteredPersonResponseOutput savePerson();
    public RegisteredPeopleResponseOutput getAllRegisteredPeople();
    public HttpStatus deletePerson();
}
