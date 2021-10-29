package linojulio.person.registration.demo.repository.service;

import linojulio.person.registration.demo.output.boundary.PersonOutputService;
import linojulio.person.registration.demo.output.boundary.model.request.PersonRequestOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPeopleResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPersonResponseOutput;
import linojulio.person.registration.demo.repository.PersonRepository;
import linojulio.person.registration.demo.repository.mapper.MapToModel;
import linojulio.person.registration.demo.repository.mapper.MapToOutput;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

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
        personRepository.save(
                MapToModel.toModel(
                        personRequestOutput
                )
        );
        logger.info("Save successful!");

        return MapToOutput.toOutput(
                personRequestOutput
        );
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
