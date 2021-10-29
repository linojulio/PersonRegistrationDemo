package linojulio.person.registration.demo.repository.entity;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Data
@Builder
@Entity
public class Person {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String firstName;

    @Column(nullable = false)
    private String lastName;

    @Column(nullable = false, unique = true)
    private String cpf;

    private String birthDate = ""; // default is blank

    @Column(nullable = false)
    @OneToMany(
            targetEntity = Phone.class,
            fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.REMOVE,
                    CascadeType.MERGE
            }
    )
    private List<Phone> phones;
}
