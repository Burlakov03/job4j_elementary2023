package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class TwoNumberSumTest {
    @Test
    void whenOneFirst0() {
        int[] array = {0, 1};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenEmptyArray() {
        int[] array = {};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = TwoNumberSum.compress(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointOneFirst0() {
        int[] array = {0, 1};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {1, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointEmptyArray() {
        int[] array = {};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointNotFirst0() {
        int[] array = {1, 0, 2, 0, 3, 0, 4};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointFirst0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointFirst0AndLast0() {
        int[] array = {0, 1, 2, 0, 3, 0, 4, 0, 0, 0};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointAll0() {
        int[] array = {0, 0, 0, 0};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {0, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointSomeNumber0() {
        int[] array = {0, 0, 0, 1, 2, 3, 4};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {1, 2, 3, 4, 0, 0, 0};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void when2PointNotContains0() {
        int[] array = {1, 2, 3, 4};
        int[] result = TwoNumberSum.compress2Point(array);
        int[] expected = {1, 2, 3, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoEqualsNumbersYesTarget() {
        int[] array = {5, 5};
        int target = 10;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {0, 1};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenTwoEqualsNumbersNoTarget() {
        int[] array = {5, 5};
        int target = 12;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithNegativeNumbersYesTarget() {
        int[] array = {-7, -5, 0, 5, 8, 12};
        int target = 3;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {1, 4};
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenWithoutNegativeNumbersYesTarget() {
        int[] array = {0, 2, 5, 8, 10, 12};
        int target = 15;
        int[] result = TwoNumberSum.getIndexes(array, target);
        int[] expected = {2, 4};
        assertThat(result).isEqualTo(expected);
    }
}
