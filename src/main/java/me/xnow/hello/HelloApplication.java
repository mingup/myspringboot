package me.xnow;
import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
@SpringBootApplication

public class HelloApplication {

    @RequestMapping("/")
    String index() {
        return "<h1>I am so good!</h1>";
    }
    
    @RequestMapping(value = "/sayhi", method = RequestMethod.GET)
    String sayhi(@RequestParam("name") String name) {
        return "Hi, " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}

