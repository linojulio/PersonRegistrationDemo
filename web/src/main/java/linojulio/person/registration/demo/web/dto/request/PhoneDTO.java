package linojulio.person.registration.demo.web.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Data
@AllArgsConstructor
@Builder
public class PhoneDTO {
    @NotEmpty
    @NotNull
    @Size(min = 8, max = 14)
//    @Pattern(regexp = "[0-9]{8}")
    private String number;

    @Enumerated(EnumType.STRING)
    private PhoneType phoneType;
}
