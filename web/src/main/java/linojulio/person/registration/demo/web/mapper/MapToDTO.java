package linojulio.person.registration.demo.web.mapper;

import linojulio.person.registration.demo.input.boundary.model.response.PhoneResponseInput;
import linojulio.person.registration.demo.input.boundary.model.response.RegisteredPersonResponseInput;
import linojulio.person.registration.demo.web.dto.response.PhoneResponseDTO;
import linojulio.person.registration.demo.web.dto.response.RegisteredPersonDTO;

import java.util.List;
import java.util.stream.Collectors;

public class MapToDTO {

    private MapToDTO() {
        super();
    }

    public static List<RegisteredPersonDTO> toDTO(
            List<RegisteredPersonResponseInput> registeredPersonResponseInput
    ) {
        return registeredPersonResponseInput.stream().map(
                MapToDTO::toDTO
        )
                .collect(
                        Collectors.toList()
                );
    }

    public static RegisteredPersonDTO toDTO(
            RegisteredPersonResponseInput registeredPersonResponseInput
    ) {
        return RegisteredPersonDTO
                .builder()
                .firstName(registeredPersonResponseInput.getFirstName())
                .lastName(registeredPersonResponseInput.getLastName())
                .cpf(registeredPersonResponseInput.getCpf())
                .birthDate(registeredPersonResponseInput.getBirthDate())
                .phones(
                        registeredPersonResponseInput
                                .getPhones()
                                .stream()
                                .map(
                                        MapToDTO::toDTO
                                )
                                .collect(
                                        Collectors.toList()
                                )
                )
                .build();
    }

    private static PhoneResponseDTO toDTO(PhoneResponseInput phoneResponseInput) {
        return PhoneResponseDTO
                .builder()
                .number(phoneResponseInput.getNumber())
                .phoneType(phoneResponseInput.getPhoneType())
                .build();
    }
}