package linojulio.person.registration.demo.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
@Getter
public class RegisteredPersonDTO {
    private String firstName;
    private String lastName;
    private String cpf;
    private String birthDate;
    private List<PhoneResponseDTO> phones;
}

