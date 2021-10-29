package linojulio.person.registration.demo.usecase.mapper;

import linojulio.person.registration.demo.input.boundary.model.response.PhoneResponseInput;
import linojulio.person.registration.demo.input.boundary.model.response.RegisteredPersonResponseInput;
import linojulio.person.registration.demo.output.boundary.model.response.PhoneResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPersonResponseOutput;

import java.util.List;
import java.util.stream.Collectors;

public class MapToInput {
    private MapToInput() {
        super();
    }

    public static List<RegisteredPersonResponseInput> toInput(
            List<RegisteredPersonResponseOutput> registeredPeopleResponseOutput
    ) {
        return registeredPeopleResponseOutput.stream()
                .map(
                        MapToInput::toInput
                )
                .collect(
                        Collectors.toList()
                );
    }

    public static RegisteredPersonResponseInput toInput(
            RegisteredPersonResponseOutput registeredPersonResponseOutput
    ) {
        return RegisteredPersonResponseInput
                .builder()
                .id(registeredPersonResponseOutput.getId())
                .firstName(registeredPersonResponseOutput.getFirstName())
                .lastName(registeredPersonResponseOutput.getLastName())
                .cpf(registeredPersonResponseOutput.getCpf())
                .birthDate(registeredPersonResponseOutput.getBirthDate())
                .phones(
                        registeredPersonResponseOutput
                                .getPhones()
                                .stream()
                                .map(
                                        MapToInput::toInput
                                )
                                .collect(
                                        Collectors.toList()
                                )
                )
                .build();
    }

    private static PhoneResponseInput toInput(PhoneResponseOutput phoneResponseOutput) {
        return PhoneResponseInput
                .builder()
                .number(phoneResponseOutput.getNumber())
                .phoneType(phoneResponseOutput.getPhoneType())
                .build();
    }
}
