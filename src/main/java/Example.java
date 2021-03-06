import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {

        return "Hello World!  branch master v0.6     v0.5 merged   update to remote  merged another commit";

    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}

