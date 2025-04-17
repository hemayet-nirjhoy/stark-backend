package devssprint.stark.stark;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class GreetingController {

    @GetMapping("/")
    public Greeting greet(){
        String name = "Stark";
        return new Greeting(name);
    }
}
