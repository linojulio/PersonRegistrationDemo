package linojulio.person.registration.demo.web.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;

@Data
@AllArgsConstructor
@Builder
@Getter
public class PhoneResponseDTO {
    private String number;
    private String phoneType;
}
