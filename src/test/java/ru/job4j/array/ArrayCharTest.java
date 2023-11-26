package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class ArrayCharTest {
    @Test
    void whenStartWithPrefixThenTrue() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 'l'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isTrue();
    }

    @Test
    void whenStartWithPrefixThenFalse() {
        char[] word = new char[]{'H', 'e', 'l', 'l', 'o'};
        char[] pref = new char[]{'H', 'e', 't'};
        boolean result = ArrayChar.startsWith(word, pref);
        assertThat(result).isFalse();
    }
}