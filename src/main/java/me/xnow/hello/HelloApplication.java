package me.xnow.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
        return "welcome to my first springboot project";
    }
    
    @RequestMapping(value = "/sayhi", method = RequestMethod.GET)
    String sayhi(@RequestParam("name") String name) {
        return "Hi, " + name;
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloApplication.class, args);
    }
}


public class HelloApplication {

	public static void main(String[] args) {
		SpringApplication.run(HelloApplication.class, args);
	}
}
