package linojulio.person.registration.demo.input.boundary.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Builder
@Getter
public class PhoneInput {
    private String number;
    private String phoneType;
}
