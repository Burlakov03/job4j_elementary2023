package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;
class FitTest {

    @Test
    void whenMan140Then46() {
        short in = 140;
        double expected = 46;
        double eps = 0.01F;
        double rs1 = Fit.manWeight(in);
        assertThat(rs1).isCloseTo(expected, withPrecision(eps));
    }

    @Test
    void whenWoman140Then34dot5() {
        short in = 140;
        double expected = 34.5F;
        double eps = 0.01F;
        double rs1 = Fit.womanWeight(in);
        assertThat(rs1).isEqualTo(expected, withPrecision(eps));
    }
}