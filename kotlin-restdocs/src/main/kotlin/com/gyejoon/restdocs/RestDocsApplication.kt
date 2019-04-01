package com.gyejoon.restdocs

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

@SpringBootApplication
@Controller
class SpringwebmvcApplication {

    @GetMapping
    fun home(model: Model): String {
        model["title"] = "Hello world"
        return "home"
    }

}

fun main(args: Array<String>) {
    runApplication<SpringwebmvcApplication>(*args)
}
