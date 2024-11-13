package com.example.springadvanced.controller;

import com.example.springadvanced.dto.FormatForm;
import com.example.springadvanced.dto.JsonFormatDto;
import com.example.springadvanced.dto.JsonFormatDtoV2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/json-format")
    public ResponseEntity<String> jsonFormat(@RequestBody FormatForm form) {
        return new ResponseEntity<>(
                "form.getPrice() = " + form.getPrice() +
                        " form.getOrderDate() = " + form.getOrderDate(),
                HttpStatus.OK
        );
    }

    @PostMapping("/json-format/deserialize")
    public ResponseEntity<String> jsonFormatDeserialize(@RequestBody JsonFormatDto dto) {
        return new ResponseEntity<>(
                "dto.getPrice() = " + dto.getPrice() +
                        " dto.getOrderDate() = " + dto.getOrderDate(),
                HttpStatus.OK
        );
    }

    @PostMapping("/json-format/annotation")
    public ResponseEntity<String> jsonFormatAnnotation(@RequestBody JsonFormatDtoV2 dto) {
        return new ResponseEntity<>(
                "dto.getPrice() = " + dto.getPrice() +
                        " dto.getOrderDate() = " + dto.getOrderDate(),
                HttpStatus.OK
        );
    }

}
