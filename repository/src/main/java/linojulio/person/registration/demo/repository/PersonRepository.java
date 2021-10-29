package linojulio.person.registration.demo.repository;

import linojulio.person.registration.demo.repository.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
    Person findPersonByDocument(String document);
}
