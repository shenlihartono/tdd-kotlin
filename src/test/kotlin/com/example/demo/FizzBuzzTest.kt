package com.example.demo

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource

class FizzBuzzTest {
    private val fizzbuzz = Fizzbuzz()

    @ParameterizedTest
    @CsvSource(
        "1, 1",
        "2, 2",
        "4, 4"
    )
    fun should_Return_The_Same(input: Int, expected: String) {
        val actual = fizzbuzz.getResult(input)
        assertThat(actual).isEqualTo(expected)
    }

    @Test
    fun should_Return_Fizz_When_Three() {
        val actual = fizzbuzz.getResult(3)
        assertThat(actual).isEqualTo("fizz")
    }

    @Test
    fun should_Return_Buzz_When_Five() {
        val actual = fizzbuzz.getResult(5)
        assertThat(actual).isEqualTo("buzz")
    }
}