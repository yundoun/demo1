package com.example.demo.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod

@Controller // Controller : 웹 요청을 받아 응답을 반환하는 컨트롤러 클래스임을 나타냄
class HtmlController {

    @RequestMapping(
        value = ["/"],
        method = [RequestMethod.GET]
    ) // RequestMapping : 요청 URL을 매핑하는 어노테이션 (http://localhost:8080/
    fun index() : String = "index" // index.html을 반환, Controller 등록됨 (http://localhost:8080/index)

}