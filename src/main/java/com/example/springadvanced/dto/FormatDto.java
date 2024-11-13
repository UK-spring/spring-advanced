package com.example.springadvanced.dto;

import lombok.Getter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.NumberFormat;

import java.time.LocalDateTime;

@Getter
public class FormatDto {

    @NumberFormat(style = NumberFormat.Style.CURRENCY)
    private final Integer price;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private final LocalDateTime startAt;

    @DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
    private final LocalDateTime endAt;

    public FormatDto(Integer price, LocalDateTime startAt, LocalDateTime endAt) {
        this.price = price;
        this.startAt = startAt;
        this.endAt = endAt;
    }
}
