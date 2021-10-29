package linojulio.person.registration.demo.repository.mapper;

import linojulio.person.registration.demo.output.boundary.model.request.PersonRequestOutput;
import linojulio.person.registration.demo.output.boundary.model.request.PhoneOutput;
import linojulio.person.registration.demo.output.boundary.model.response.PhoneResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPersonResponseOutput;

import java.util.stream.Collectors;

public class MapToOutput {
    private MapToOutput() {
        super();
    }

    public static RegisteredPersonResponseOutput toOutput(
            PersonRequestOutput personRequestOutput
    ) {
        return RegisteredPersonResponseOutput
                .builder()
                .firstName(personRequestOutput.getFirstName())
                .lastName(personRequestOutput.getLastName())
                .cpf(personRequestOutput.getCpf())
                .birthDate(personRequestOutput.getBirthDate())
                .phones(
                        personRequestOutput
                                .getPhones()
                                .stream()
                                .map(
                                        MapToOutput::toOutput
                                )
                                .collect(
                                        Collectors.toList()
                                )
                )
                .build();
    }

    private static PhoneResponseOutput toOutput(PhoneOutput phoneResponseOutput) {
        return PhoneResponseOutput
                .builder()
                .number(phoneResponseOutput.getNumber())
                .phoneType(phoneResponseOutput.getPhoneType())
                .build();
    }
}
