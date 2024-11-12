package com.example.springadvanced.controller;

import com.example.springadvanced.dto.DataDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class MessageConverterController {

    @PostMapping("/json-to-text")
    // String -> produces = "text/plain"
    public String jsonToText(@RequestBody String data) {
        // logic
        return data;
    }

    @PostMapping("/json-to-json")
    // Object -> produces = "application/json"
    public DataDto jsonToJson(@RequestBody DataDto dto) {
        // logic
        return dto;
    }

    @PostMapping("/text-to-json")
    // Object -> produces = "application/json"
    public DataDto textToJson(@RequestBody DataDto dto) {
        // logic
        return dto;
    }

}
