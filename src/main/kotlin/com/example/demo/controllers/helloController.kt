package com.example.demo.controllers

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class helloController {

    @GetMapping("/")
    fun index(): String {
        println("in the controller");
        return "index";
    }
}