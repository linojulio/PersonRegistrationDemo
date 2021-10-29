package linojulio.person.registration.demo.input.boundary.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Getter
public class RegisteredPersonResponseInput {
    private Long id;
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneResponseInput> phones;
}

