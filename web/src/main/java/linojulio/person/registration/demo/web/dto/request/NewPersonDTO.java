package linojulio.person.registration.demo.web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.hibernate.validator.constraints.br.CPF;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class NewPersonDTO {
    @NotEmpty @NotNull @Size(min = 2, max = 200)
    private String firstName;

    @NotEmpty @NotNull @Size(min = 2, max = 200)
    private String lastName;

    @NotEmpty @NotNull @CPF
    private String cpf;

    @NotNull
    private String birthDate;

    @NotEmpty @NotNull
    private List<PhoneDTO> phones;
}

