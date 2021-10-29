package linojulio.person.registration.demo.output.boundary.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Builder
@Getter
public class PhoneResponseOutput {
    private String number;
    private String phoneType;
}
