package com.example.java_web_final_project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "student")
public class StudentController {

    @GetMapping
    public String sayHello() {
        return "Hello Friend";
    }

}
