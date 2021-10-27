package linojulio.person.registration.demo.web.health;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("Health Status Controller")
@RequestMapping("/public")
public class HealthController {

    @GetMapping("status")
    public String getHealthStatus() {
        return "API IS ALIVE!";
    }

}
