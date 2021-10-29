package linojulio.person.registration.demo.commons.exceptions;

public class PersonNotFoundException extends RuntimeException {
    public PersonNotFoundException(Long id) {
        super("Person not found : id=" + id);
    }

    public PersonNotFoundException(String document) {
        super("Person not found : document=" + document);
    }

    public PersonNotFoundException() {
        super("Person not found");
    }
}
