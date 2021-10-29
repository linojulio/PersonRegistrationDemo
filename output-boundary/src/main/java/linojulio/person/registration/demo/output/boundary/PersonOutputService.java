package linojulio.person.registration.demo.output.boundary;

import linojulio.person.registration.demo.output.boundary.model.request.PersonRequestOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPersonResponseOutput;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface PersonOutputService {
    public RegisteredPersonResponseOutput savePerson(PersonRequestOutput personRequestOutput);
    public List<RegisteredPersonResponseOutput> getAllRegisteredPeople();
    public HttpStatus deletePerson();
}
