package linojulio.person.registration.demo.repository;

import linojulio.person.registration.demo.repository.entity.Person;
import linojulio.person.registration.demo.repository.entity.Phone;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDate;
import java.util.List;

public class PersonRepositoryTest {

    @Autowired
    private PersonRepository personRepository;

    @Test
    public void savePersonTest() {
        personRepository.save(
                Person.builder()
                        .firstName("Primeiro Nome")
                        .lastName("Ultimo Nome")
                        .document("123123123")
                        .birthDate(LocalDate.now().toString())
                        .phones(
                                List.of(
                                        Phone.builder()
                                                .phoneNumber("5555555555")
                                                .phoneType("PHONE TYPE")
                                                .build()
                                )
                        )
                        .build()
        ); // todo
    }
}
