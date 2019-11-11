package com.example.demo.web

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class HelloControllerNew {


    @GetMapping("/hello1")
    fun greeting(@RequestParam(value = "name", defaultValue = "World") name: String) =  "Hello, $name"
}