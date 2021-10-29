package linojulio.person.registration.demo.input.boundary.model.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RegisteredPeopleResponseInput {
    private String name;
}