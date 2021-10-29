package linojulio.person.registration.demo.usecase;

import linojulio.person.registration.demo.input.boundary.PersonInputService;
import linojulio.person.registration.demo.input.boundary.model.request.PersonRequestInput;
import linojulio.person.registration.demo.input.boundary.model.response.RegisteredPeopleResponseInput;
import linojulio.person.registration.demo.input.boundary.model.response.RegisteredPersonResponseInput;
import linojulio.person.registration.demo.output.boundary.PersonOutputService;
import linojulio.person.registration.demo.usecase.mapper.MapToInput;
import linojulio.person.registration.demo.usecase.mapper.MapToOutput;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class PersonUsecase implements PersonInputService {

    @Autowired
    private PersonOutputService personOutputService;

    @Override
    public RegisteredPersonResponseInput addPerson(
            PersonRequestInput personRequestInput
    ) {
        return MapToInput.toInput(
                personOutputService.savePerson(
                        MapToOutput.toOutput(personRequestInput)
                )
        );
    }

    @Override
    public RegisteredPeopleResponseInput getRegisteredPeople() {
        return null;
    }

    @Override
    public HttpStatus deletePerson() {
        return null;
    }
}
