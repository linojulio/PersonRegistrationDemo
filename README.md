# PersonRegistrationDemo
RESTful API with Springboot and Clean Architecture Demo: PersonRegistrationDemo

## Implementation Details

### Project Structure and Architecture
The project structure is strongly referenced on the [Clean Architecture](https://blog.cleancoder.com/uncle-bob/2012/08/13/the-clean-architecture.html)
by Robert C. Martin (Uncle Bob) and the [Hexagonal Architecture](https://medium.com/idealo-tech-blog/hexagonal-ports-adapters-architecture-e3617bcf00a0)
by Alistar Cockburn.

The main idea here is for us to have separate layers which communicate with each other through interfaces. This way the project layers are highly decoupled and, therefore,
the project is robust and less susceptible to systematic bugs.

This approach helps us to achieve to make the business layer independent of any framework, UI , database or any other external components.
This makes business logic easier to test without any dependence to the other systems.

Hence, the project is flexible enough to have its adapters changed easily.
For example, you can swap out a particular database for an equivalent one or consume a different version of an external
API without significant impact or major code rewrites to other layers.
Each layer simply doesn't know anything at all about other layers configurations, connections or implementations.

**todo:**

- Unit Testing
- Error handling
- Web security
- Some more validations on the WEB layer (example: LocalDate; normalizations; serializations)
- Enhance documentation

Swagger doc: https://person-registration-demo.herokuapp.com/swagger-ui.html