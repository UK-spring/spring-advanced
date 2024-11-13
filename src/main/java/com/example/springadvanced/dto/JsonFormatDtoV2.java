package com.example.springadvanced.dto;

import com.example.springadvanced.serializer.CurrencyDeserializer;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class JsonFormatDtoV2 {

    @JsonDeserialize(using = CurrencyDeserializer.class)
    private BigDecimal price;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
    private LocalDate orderDate;

}
