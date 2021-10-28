package linojulio.person.registration.demo.repository.service;

import linojulio.person.registration.demo.output.boundary.PersonOutputService;
import linojulio.person.registration.demo.output.boundary.model.RegisteredPeopleResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.RegisteredPersonResponseOutput;
import linojulio.person.registration.demo.repository.PersonRepository;
import linojulio.person.registration.demo.repository.entity.Person;
import linojulio.person.registration.demo.repository.entity.Phone;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class PersonRepositoryClient implements PersonOutputService {

    private PersonRepository personRepository;

    @Autowired
    public PersonRepositoryClient(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public RegisteredPersonResponseOutput savePerson() {
        personRepository.save(
                Person.builder()
                        .firstName("Primeiro Nome")
                        .lastName("Ultimo Nome")
                        .cpf("123123123")
                        .birthDate(LocalDate.now())
                        .phones(
                                List.of(
                                        Phone.builder()
                                                .phoneNumber("5555555555")
                                                .phoneType("PHONE TYPE")
                                                .build()
                                )
                        )
                .build()
        ); // todo
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
