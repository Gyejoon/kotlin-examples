package com.gyejoon.jooq

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.ui.set
import org.springframework.web.bind.annotation.GetMapping

/**
 * Created by 00700mm@gmail.com on 2019-03-31
 * Blog : http://gyejoong.tistory.com
 * Github : http://github.com/Gyejoon
 */
@Controller
class HomeController {

    @GetMapping("/")
    fun home(model: Model): String {
        // java의 setter method와 동일한 효과
        model["title"] = "Home"
        return "home"
    }

}