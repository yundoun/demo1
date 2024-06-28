package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller
class FormHtmlController {
    @RequestMapping(
        value = ["/form"],
        method = [RequestMethod.GET]
    )
    fun index() : String = "form/index"
}