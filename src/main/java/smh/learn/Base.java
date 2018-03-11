package smh.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class Base {
    public static void main(String[] args) {
        SpringApplication.run(Base.class, args);
    }

    @RequestMapping("/123")
    public String path() {
        return "123";

    }
}
