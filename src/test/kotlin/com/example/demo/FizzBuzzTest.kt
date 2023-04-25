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

    @ParameterizedTest
    @CsvSource(
        "3, fizz",
        "6, fizz",
        "9, fizz"
    )
    fun should_Return_Fizz_When_DivisibleByThree(input: Int, expected: String) {
        val actual = fizzbuzz.getResult(input)
        assertThat(actual).isEqualTo(expected)
    }

    @ParameterizedTest
    @CsvSource(
        "5, buzz",
        "10, buzz",
        "20, buzz"
    )
    fun should_Return_Buzz_When_DivisibleByFive(input: Int, expected: String) {
        val actual = fizzbuzz.getResult(input)
        assertThat(actual).isEqualTo(expected)
    }

    @ParameterizedTest
    @CsvSource(
        "15, fizzbuzz",
        "30, fizzbuzz",
        "45, fizzbuzz"
    )
    fun should_Return_FizzBuzz_When_DivisibleByThreeAndFive(input: Int, expected: String) {
        val actual = fizzbuzz.getResult(input)
        assertThat(actual).isEqualTo(expected)
    }
}