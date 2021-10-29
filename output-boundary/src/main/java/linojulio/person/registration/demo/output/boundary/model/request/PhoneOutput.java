package linojulio.person.registration.demo.output.boundary.model.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class PhoneOutput {
    private String number;
    private String phoneType;
}
