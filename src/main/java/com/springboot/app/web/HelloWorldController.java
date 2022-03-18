package com.springboot.app.web;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    //get http resquest


    @GetMapping("/hello-world")
    public String helloWorld(){
        return "Hello world";
    }


}
