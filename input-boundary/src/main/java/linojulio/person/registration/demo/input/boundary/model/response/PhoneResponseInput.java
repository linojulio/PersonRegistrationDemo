package linojulio.person.registration.demo.input.boundary.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Builder
@Getter
public class PhoneResponseInput {
    private String number;
    private String phoneType;
}
