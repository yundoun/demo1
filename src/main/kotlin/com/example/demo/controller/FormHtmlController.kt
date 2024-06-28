package com.example.demo.controller

import com.example.demo.domain.User
import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class FormHtmlController {
    @RequestMapping(
        value = ["/form", "/form/{userid}"],
        method = [RequestMethod.GET]
    )
    fun index(
        @PathVariable("userid")userid:Long?, // PathVariable : URL 경로에 변수를 넣어주는 어노테이션
        model : Model
    ) : String {

        val user = User(null, null, null)

        if (userid != null) {
            user.name = "yun do un"
            user.email = "ehdns1133@naver.com"
            user.password = "sexyman"
        }

        model.addAttribute("user", user)
        return "form/index"
    }
}