package com.example.springadvanced.converter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

@Slf4j
public class StringToIntegerConverter implements Converter<String, Integer> {
    @Override
    public Integer convert(String source) {
        log.info("source = {}", source);
        // 검증
        return Integer.valueOf(source);
    }
}
