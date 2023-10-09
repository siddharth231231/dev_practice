package dev_Practice.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    @GetMapping("/greet")
    public String greet(){
        return "Hi Siddhu";
    }
}
