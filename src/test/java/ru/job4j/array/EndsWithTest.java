package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class EndsWithTest {
    @Test
    void whenEndWithPrefixThenTrue() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pregfix = new char[]{'l', 'o'};
        boolean result = EndsWith.endsWith(word, pregfix);
        assertThat(result).isTrue();
    }

    @Test
    void whenEndWithPrefixThenFalse() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pregfix = new char[]{'p', 'l', 'o'};
        boolean result = EndsWith.endsWith(word, pregfix);
        assertThat(result).isFalse();
    }
}