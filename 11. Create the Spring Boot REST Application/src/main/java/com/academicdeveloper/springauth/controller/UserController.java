package com.academicdeveloper.springauth.controller;

/*
PROJECT NAME : 12. Create the Spring Boot REST Application
Module NAME: IntelliJ IDEA
Author Name : @ DRRONIDZ
DATE : 2/23/2022 11:12 PM
*/

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @RequestMapping("/user/{name}")
    public String sayHello(@PathVariable("name") String name) {
        return "Hello " + name + " from " + UserController.class.getSimpleName();
    }
}
