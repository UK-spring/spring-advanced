package com.example.springadvanced.converter;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.format.support.DefaultFormattingConversionService;

public class FormattingConversionServiceTest {

    @Test
    void formattingConversionService() {

        // given
        DefaultFormattingConversionService conversionService = new DefaultFormattingConversionService();

        // Converter 등록
        conversionService.addConverter(new StringToPersonConverter());
        conversionService.addConverter(new PersonToStringConverter());
        // Formatter 등록
        conversionService.addFormatter(new PriceFormatter());

        // when
        String result = conversionService.convert(10000, String.class);

        // then
        Assertions.assertThat(result).isEqualTo("10,000");

    }

}
