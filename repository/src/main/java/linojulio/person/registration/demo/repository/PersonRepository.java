package linojulio.person.registration.demo.repository;

import linojulio.person.registration.demo.repository.entity.Person;
import linojulio.person.registration.demo.repository.service.PersonRepositoryClient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
