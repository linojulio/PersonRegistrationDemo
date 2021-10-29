package linojulio.person.registration.demo.repository.mapper;

import linojulio.person.registration.demo.output.boundary.model.request.PersonRequestOutput;
import linojulio.person.registration.demo.output.boundary.model.request.PhoneOutput;
import linojulio.person.registration.demo.repository.entity.Person;
import linojulio.person.registration.demo.repository.entity.Phone;

import java.time.LocalDate;
import java.util.stream.Collectors;

public class MapToModel {
    private MapToModel() {
        super();
    }

    public static Person toModel(
            PersonRequestOutput personRequestOutput
    ) {

        return Person.builder()
                .firstName(personRequestOutput.getFirstName())
                .lastName(personRequestOutput.getLastName())
                .document(personRequestOutput.getCpf())
                .birthDate(
                        personRequestOutput.getBirthDate()
                )
                .phones(
                        personRequestOutput
                                .getPhones()
                                .stream()
                                .map(
                                        MapToModel::toModel
                                )
                                .collect(
                                        Collectors.toList()
                                )
                )
                .build();
    }

    private static Phone toModel(PhoneOutput phoneOutput) {
        return Phone
                .builder()
                .phoneNumber(phoneOutput.getNumber())
                .phoneType(phoneOutput.getPhoneType())
                .build();
    }

    private static boolean isDateValid(String str) {
        try {
            LocalDate.parse(str);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }
}
