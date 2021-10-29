package linojulio.person.registration.demo.input.boundary.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Getter
public class PersonRequestInput {
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneInput> phones;
}

