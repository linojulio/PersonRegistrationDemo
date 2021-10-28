package linojulio.person.registration.demo.web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;
import org.springframework.lang.Nullable;

import javax.validation.Valid;
import javax.validation.constraints.*;
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

    @Nullable
    private String birthDate;

    @NotEmpty @NotNull @Valid
    private List<PhoneDTO> phones;
}

@Data
@AllArgsConstructor
@Builder
class PhoneDTO {
    @NotEmpty @NotNull @Size(min = 8, max = 14) @Pattern(regexp = "[\\d]")
    private String number;

    @NotEmpty @NotNull
    private PhoneType phoneType;
}

@AllArgsConstructor
enum PhoneType {
    MOBILE("Mobile"),
    HOME("Home"),
    COMMERCIAL("Commercial");

    private final String description;
}