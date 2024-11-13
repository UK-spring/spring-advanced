package com.example.springadvanced.controller;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class TypeConverterController {

    @GetMapping("/param")
    public void param(HttpServletRequest request) {

        // 조회시 : String
        String stringExample = request.getParameter("example");

        // Integer로 Type 변환
        Integer integerExample = Integer.valueOf(stringExample);
        log.info("integerExample = {}", integerExample);

    }

    @GetMapping("/v2/param")
    public void paramV2(@RequestParam Integer example) {
        // Integer 타입으로 바인딩
        log.info("example = {}", example);
    }

}
