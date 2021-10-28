package linojulio.person.registration.demo.web.mapper;

import linojulio.person.registration.demo.input.boundary.model.RegisteredPeopleResponseInput;
import linojulio.person.registration.demo.web.dto.response.RegisteredPeopleDTO;

public class MapToDTO {

    private MapToDTO() {
        super();
    }

    public static RegisteredPeopleDTO toDTO(RegisteredPeopleResponseInput registeredPeopleResponseInput){
        return new RegisteredPeopleDTO(
                registeredPeopleResponseInput.getName()
        );
    }
}