package net.gospring.spring5demo.controllers;

import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    public String hello() {
        System.out.println("hello from MyController");
        return "hi";
    }
}
