package com.example.springadvanced.converter;

import com.example.springadvanced.entity.Person;
import org.junit.jupiter.api.Test;
import org.springframework.core.convert.support.DefaultConversionService;

import static org.assertj.core.api.Assertions.*;

public class ConversionServiceTest {

    @Test
    void defaultConversionService() {
        // given
        DefaultConversionService dcs = new DefaultConversionService();
        dcs.addConverter(new StringToPersonConverter());
        Person wonuk = new Person("wonuk", 100);

        // when
        Person stringToPerson = dcs.convert("wonuk:1200", Person.class);

        // then
        assertThat(stringToPerson.getName()).isEqualTo(wonuk.getName());
        assertThat(stringToPerson.getAge()).isEqualTo(wonuk.getAge());
    }

}
