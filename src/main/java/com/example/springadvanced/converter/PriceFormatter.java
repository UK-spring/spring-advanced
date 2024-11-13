package com.example.springadvanced.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.format.Formatter;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

@Slf4j
public class PriceFormatter implements Formatter<Number> {
    @Override
    public Number parse(String text, Locale locale) throws ParseException {
        log.info("text = {}, locale={}", text, locale);

        // 변환 로직
        // 기본 제공되는 기능 숫자 중간에 (,) 쉼표를 넣어준다.
        // Locale 정보를 활용하여 나라별로 다른 숫자 포맷으로 만들어준다.
        NumberFormat format = NumberFormat.getInstance(locale);

        return format.parse(text);
    }

    @Override
    public String print(Number object, Locale locale) {
        log.info("object = {}, locale = {}", object, locale);

        return NumberFormat.getInstance(locale).format(object);
    }
}
