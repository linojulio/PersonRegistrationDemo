package linojulio.person.registration.demo.usecase.mapper;


import linojulio.person.registration.demo.input.boundary.model.request.PersonRequestInput;
import linojulio.person.registration.demo.input.boundary.model.request.PhoneInput;
import linojulio.person.registration.demo.output.boundary.model.request.PersonRequestOutput;
import linojulio.person.registration.demo.output.boundary.model.request.PhoneOutput;

import java.util.stream.Collectors;

public class MapToOutput {

    private MapToOutput() {
        super();
    }

    public static PersonRequestOutput toOutput(
            PersonRequestInput personRequestInput
    ) {
        return PersonRequestOutput
                .builder()
                .firstName(personRequestInput.getFirstName())
                .lastName(personRequestInput.getLastName())
                .cpf(personRequestInput.getCpf())
                .birthDate(personRequestInput.getBirthDate())
                .phones(
                        personRequestInput
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

    private static PhoneOutput toOutput(PhoneInput phoneInput) {
        return PhoneOutput
                .builder()
                .number(phoneInput.getNumber())
                .phoneType(phoneInput.getPhoneType())
                .build();
    }
}
