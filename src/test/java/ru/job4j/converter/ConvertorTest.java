package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConvertorTest {

    @Test
    void whenConvert140RblThen1dot4Euro() {
        float in = 140;
        float expected = 1.4F;
        float out = Convertor.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RblThen2Dolar() {
        float in = 140;
        float expected = 2;
        float out = Convertor.rubleToDolar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}