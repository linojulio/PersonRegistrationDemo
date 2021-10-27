package linojulio.person.registration.demo.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@ComponentScan(basePackages = "linojulio.person.registration.demo")
@SpringBootApplication
public class PersonRegistrationDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(PersonRegistrationDemoApplication.class, args);
	}

}
