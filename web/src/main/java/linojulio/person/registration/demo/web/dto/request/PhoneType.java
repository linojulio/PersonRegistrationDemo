package linojulio.person.registration.demo.web.dto.request;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public enum PhoneType {
    MOBILE("Mobile"),
    HOME("Home"),
    COMMERCIAL("Commercial");

    private final String description;
}
