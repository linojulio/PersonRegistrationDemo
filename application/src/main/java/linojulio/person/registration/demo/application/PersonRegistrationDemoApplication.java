package linojulio.person.registration.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = "linojulio.person.registration.demo")
@EnableJpaRepositories(basePackages = "linojulio.person.registration.demo.repository.*")
@EntityScan(basePackages = "linojulio.person.registration.demo.repository.*")
@SpringBootApplication
public class PersonRegistrationDemoApplication {
	public static void main(String[] args) {
		SpringApplication.run(PersonRegistrationDemoApplication.class, args);
	}

}
