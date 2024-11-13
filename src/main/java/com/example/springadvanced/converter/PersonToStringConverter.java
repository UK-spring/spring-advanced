package com.example.springadvanced.converter;

import com.example.springadvanced.entity.Person;
import org.springframework.core.convert.converter.Converter;

public class PersonToStringConverter implements Converter<Person, String> {
    @Override
    public String convert(Person source) {

        // 이름
        String name = source.getName();
        // 개월수
        int months = source.getAge() * 12;

        return name + ":" + months;
    }
}
