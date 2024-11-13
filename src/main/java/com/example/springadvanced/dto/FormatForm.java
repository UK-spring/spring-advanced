package com.example.springadvanced.dto;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class FormatForm {

    @NumberFormat(pattern = "#,###.##")
    private BigDecimal price;

    @DateTimeFormat(pattern = "dd-MM-yyyy")
    private LocalDate orderDate;

}
