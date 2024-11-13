package com.example.springadvanced.dto;

import com.example.springadvanced.serializer.CurrencyDeserializer;
import com.example.springadvanced.serializer.LocalDateDeserializer;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Data;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class JsonFormatDto {

    @JsonDeserialize(using = CurrencyDeserializer.class)
    private BigDecimal price;

    @JsonDeserialize(using = LocalDateDeserializer.class)
    private LocalDate orderDate;

}
