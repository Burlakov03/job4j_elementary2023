package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class SqAreaTest {

    @Test
    void whenP6K2Square2() {
        double expected = 2;
        int p = 6;
        double k = 2;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenP1K44Square0dot055() {
        double expected = 0.005F;
        int p = 1;
        double k = 44;
        double out = SqArea.square(p, k);
        assertThat(out).isEqualTo(expected, withPrecision(0.001));
    }
}