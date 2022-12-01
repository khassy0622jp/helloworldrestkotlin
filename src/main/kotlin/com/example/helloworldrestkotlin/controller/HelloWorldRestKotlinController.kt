package com.example.helloworldrestkotlin.controller

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@Controller
class HelloWorldRestKotlinController {

    @GetMapping("/")
    fun index(model:Model): String {
        return "index"
    }

    @GetMapping("/hello")
    fun hello(model: Model) : String {
        model["hello"] = "Hello world!"
        return "hello"
    }
}