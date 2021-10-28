package linojulio.person.registration.demo.repository.service;

import linojulio.person.registration.demo.output.boundary.PersonOutputService;
import linojulio.person.registration.demo.output.boundary.model.RegisteredPeopleResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.RegisteredPersonResponseOutput;
import linojulio.person.registration.demo.repository.PersonRepo;
import linojulio.person.registration.demo.repository.entity.Person;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class PersonRepositoryClient implements PersonOutputService {

    @Autowired
    private final PersonRepo personRepo;
    private final Logger logger;

    @Override
    public RegisteredPersonResponseOutput savePerson() {
        personRepo.save(new Person()); // todo
        logger.info("Save successful!");
        return null;
    }

    @Override
    public RegisteredPeopleResponseOutput getAllRegisteredPeople() {
        return null;
    }

    @Override
    public HttpStatus deletePerson() {
        return null;
    }
}
