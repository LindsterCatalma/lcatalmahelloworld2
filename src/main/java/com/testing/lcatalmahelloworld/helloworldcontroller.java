package com.testing.lcatalmahelloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloworldcontroller {
    
    @GetMapping(value = "/hello")
    public String sayHello(){
        return "Hello World!";
    }
}
