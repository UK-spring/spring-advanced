package com.example.springadvanced.controller;

import com.example.springadvanced.dto.FormatDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormatController {

    @PostMapping("/format")
    public ResponseEntity<String> format(@RequestBody FormatDto dto) {
        return new ResponseEntity<>(
                "dto.getPrice() = " + dto.getPrice()
                        + " dto.getStartAt() = "
                        + dto.getStartAt() + " dto.getEndAt() = "
                        + dto.getEndAt(),
                HttpStatus.OK
        );
    }
}
