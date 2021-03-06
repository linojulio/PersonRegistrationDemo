package linojulio.person.registration.demo.input.boundary;

import linojulio.person.registration.demo.input.boundary.model.request.PersonRequestInput;
import linojulio.person.registration.demo.input.boundary.model.response.RegisteredPersonResponseInput;
import org.springframework.http.HttpStatus;

import java.util.List;

public interface PersonInputService {
    public RegisteredPersonResponseInput addPerson(PersonRequestInput personRequestInput);
    public List<RegisteredPersonResponseInput> getRegisteredPeople();
    public RegisteredPersonResponseInput getPersonByDocument(String document);
    public HttpStatus deletePersonById(Long personId);
    public RegisteredPersonResponseInput updatePerson(PersonRequestInput personRequestInput);
}
