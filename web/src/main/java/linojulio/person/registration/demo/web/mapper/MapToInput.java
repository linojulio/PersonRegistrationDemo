package linojulio.person.registration.demo.web.mapper;

import linojulio.person.registration.demo.input.boundary.model.request.PersonRequestInput;
import linojulio.person.registration.demo.input.boundary.model.request.PhoneInput;
import linojulio.person.registration.demo.web.dto.request.NewPersonDTO;
import linojulio.person.registration.demo.web.dto.request.PhoneDTO;

import java.util.stream.Collectors;

public class MapToInput {
    private MapToInput() {
        super();
    }

    public static PersonRequestInput toInput(
            NewPersonDTO newPersonDTO
    ) {
        return PersonRequestInput
                .builder()
                .firstName(newPersonDTO.getFirstName())
                .lastName(newPersonDTO.getLastName())
                .cpf(newPersonDTO.getCpf())
                .birthDate(newPersonDTO.getBirthDate()) // todo change this to LocalDate
                .phones(
                        newPersonDTO
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

    private static PhoneInput toInput(PhoneDTO phoneDTO) {
        return PhoneInput
                .builder()
                .number(phoneDTO.getNumber())
                .phoneType(phoneDTO.getPhoneType().name())
                .build();
    }

    //todo
    /*
            var datePattern = "dd-MM-yyyy";

    * .birthDate(
                        GenericValidator.isDate(
                                personRequestOutput.getBirthDate(),
                                datePattern,
                                false
                        ) ? LocalDate
                                .parse(
                                        personRequestOutput.getBirthDate(),
                                        DateTimeFormatter.ofPattern(datePattern)
                                )
                                : LocalDate.MIN
                )
    * */
}
