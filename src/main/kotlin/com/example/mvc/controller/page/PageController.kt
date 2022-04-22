package com.example.mvc.controller.page

import com.example.mvc.model.http.UserRequest
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController

@Controller
class PageController {

    // http://localhost/main
    @GetMapping("/main")
    fun main(): String {
        println("init main")
        return "main.html"
    }

    @ResponseBody
    @GetMapping("/test")
    fun response(): String {
        return "main.html"
    }

    @ResponseBody
    @GetMapping("/test2")
    fun response2(): UserRequest {
        return UserRequest().apply {
            this.name = "steve"
        }
        return UserRequest(name = "steve")
    }



}