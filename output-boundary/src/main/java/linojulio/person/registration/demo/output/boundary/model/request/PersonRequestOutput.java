package linojulio.person.registration.demo.output.boundary.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Getter
public class PersonRequestOutput {
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneOutput> phones;
}

