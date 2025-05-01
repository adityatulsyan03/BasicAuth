package com.example.BasicAuth.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String Greet(HttpServletRequest request) {
        return "Hello World\n" + request.getSession().getId();
    }

}