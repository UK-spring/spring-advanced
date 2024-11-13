package com.example.springadvanced.controller;

import com.example.springadvanced.dto.FormatForm;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormatController {

    @PostMapping("/format")
    public ResponseEntity<String> format(@ModelAttribute FormatForm form) {
        return new ResponseEntity<>(
                "form.getPrice() = " + form.getPrice() +
                        " form.getOrderDate() = " + form.getOrderDate(),
                HttpStatus.OK
        );
    }
}
