package service;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;


@Controller
@EnableAutoConfiguration
public class SimpleService {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "I'm a simple Spring Boot service started with this command: " + System.getProperty("sun.java.command");
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(SimpleService.class, args);
    }
}