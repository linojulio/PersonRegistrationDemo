package linojulio.person.registration.demo.output.boundary;

import linojulio.person.registration.demo.output.boundary.model.request.PersonRequestOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPeopleResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPersonResponseOutput;
import org.springframework.http.HttpStatus;

public interface PersonOutputService {
    public RegisteredPersonResponseOutput savePerson(PersonRequestOutput personRequestOutput);
    public RegisteredPeopleResponseOutput getAllRegisteredPeople();
    public HttpStatus deletePerson();
}
