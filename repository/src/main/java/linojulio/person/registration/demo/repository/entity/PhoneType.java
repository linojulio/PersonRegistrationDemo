package linojulio.person.registration.demo.repository.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum PhoneType {
    MOBILE("Mobile"),
    HOME("Home"),
    COMMERCIAL("Commercial");

    private final String description;
}
