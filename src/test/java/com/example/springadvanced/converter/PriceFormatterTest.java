package com.example.springadvanced.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.util.Locale;

public class PriceFormatterTest {

    PriceFormatter formatter = new PriceFormatter();

    @Test
    void parse() throws ParseException {
        // given, when
        Number result = formatter.parse("1,000", Locale.KOREA);

        // then
        // parse 결과는 Long Type
        Assertions.assertThat(result).isEqualTo(1000L);
    }

    @Test
    void print() {
        // given, when
        String result = formatter.print(1000, Locale.KOREA);

        // then
        Assertions.assertThat(result).isEqualTo("1,000");
    }

}
