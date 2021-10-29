package linojulio.person.registration.demo.repository.mapper;

import linojulio.person.registration.demo.output.boundary.model.response.PhoneResponseOutput;
import linojulio.person.registration.demo.output.boundary.model.response.RegisteredPersonResponseOutput;
import linojulio.person.registration.demo.repository.entity.Person;
import linojulio.person.registration.demo.repository.entity.Phone;

import java.util.List;
import java.util.stream.Collectors;

public class MapToOutput {
    private MapToOutput() {
        super();
    }

    public static List<RegisteredPersonResponseOutput> toOutput(
            List<Person> people
    ) {
        return people.stream()
                .map(
                        MapToOutput::toOutput
                )
                .collect(
                        Collectors.toList()
                );
    }

    public static RegisteredPersonResponseOutput toOutput(
            Person person
    ) {
        return RegisteredPersonResponseOutput
                .builder()
                .id(person.getId())
                .firstName(person.getFirstName())
                .lastName(person.getLastName())
                .cpf(person.getDocument())
                .birthDate(person.getBirthDate())
                .phones(
                        person
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

    private static PhoneResponseOutput toOutput(Phone phone) {
        return PhoneResponseOutput
                .builder()
                .number(phone.getPhoneNumber())
                .phoneType(phone.getPhoneType())
                .build();
    }
}
