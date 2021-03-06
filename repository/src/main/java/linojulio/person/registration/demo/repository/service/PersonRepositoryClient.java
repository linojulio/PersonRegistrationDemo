package linojulio.person.registration.demo.repository.service;

import linojulio.person.registration.demo.commons.exceptions.PersonNotFoundException;
import linojulio.person.registration.demo.output.boundary.PersonOutputService;
import linojulio.person.registration.demo.output.boundary.model.request.PersonRequestOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPersonResponseOutput;
import linojulio.person.registration.demo.repository.PersonRepository;
import linojulio.person.registration.demo.repository.entity.Person;
import linojulio.person.registration.demo.repository.mapper.MapToModel;
import linojulio.person.registration.demo.repository.mapper.MapToOutput;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PersonRepositoryClient implements PersonOutputService {

    @Autowired
    private PersonRepository personRepository;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public RegisteredPersonResponseOutput savePerson(
            PersonRequestOutput personRequestOutput
    ) {
        logger.info("Saving person...");

        var savedPerson = MapToModel.toModel(
                personRequestOutput
        );

        personRepository.save(
                savedPerson
        );

        logger.info("Save successful!");

        return MapToOutput.toOutput(
                savedPerson
        );
    }

    @Override
    public List<RegisteredPersonResponseOutput> getAllRegisteredPeople() {
        return MapToOutput.toOutput(personRepository.findAll());
    }

    @Override
    public RegisteredPersonResponseOutput getPersonByDocument(String document) {
        return MapToOutput.toOutput(
                validatePersonExistence(document)
        );
    }

    @Override
    public HttpStatus deletePersonById(Long personId) {
        try {
            personRepository.deleteById(personId);

            logger.info("Person deleted successfully : id=" + personId);

            return HttpStatus.ACCEPTED;
        } catch (Exception ex) {
            logger.error("Fail to delete person : id=" + personId + "\nmessage=" + ex.getMessage());

            return HttpStatus.BAD_REQUEST;
        }
    }

    @Override
    public RegisteredPersonResponseOutput updatePersonByDocument(PersonRequestOutput personRequestOutput) {

        try {
            var personId = validatePersonExistence(personRequestOutput.getCpf()).getId();

            var updatedPerson = MapToModel.toModel(personRequestOutput);
            updatedPerson.setId(personId);

            return MapToOutput.toOutput(
                    personRepository.save(
                            updatedPerson
                    )
            );
        } catch (Exception ex) {
            logger.error("Fail to update person : person=" + personRequestOutput + "\nmessage=" + ex.getMessage());
        }

        return RegisteredPersonResponseOutput.builder().build();
    }

    private Person validatePersonExistence(String document) {
        return personRepository.findPersonByDocument(document)
                .orElseThrow(
                        () -> new PersonNotFoundException(document)
                );
    }

    private Person validatePersonExistence(Long id) {
        return personRepository.findById(id)
                .orElseThrow(
                        () -> new PersonNotFoundException(id)
                );
    }
}
