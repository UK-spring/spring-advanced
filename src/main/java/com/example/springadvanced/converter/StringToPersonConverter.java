package com.example.springadvanced.converter;

import com.example.springadvanced.entity.Person;
import org.springframework.core.convert.converter.Converter;

public class StringToPersonConverter implements Converter<String, Person> {
    // source = "wonuk:1200"
    @Override
    public Person convert(String source) {
        // ':' 를 구분자로 나누어 배열로 만든다.
        String[] parts = source.split(":");

        // 첫번째 배열은 이름이다. -> wonuk
        String name = parts[0];
        // 두번째 배열은 개월수이다. -> 1200
        int months = Integer.parseInt(parts[1]);

        // 개월수 나누기 12로 나이를 구하는 로직 (12개월 단위만 고려)
        int age = months / 12;

        return new Person(name, age);
    }
}
