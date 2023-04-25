package com.example.demo

import org.assertj.core.api.AssertionsForClassTypes.assertThat
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    private val fizzbuzz = Fizzbuzz()

    @Test
    fun should_Return_One() {
        val actual = fizzbuzz.getResult(1)
        assertThat(actual).isEqualTo("1")
    }

    @Test
    fun should_Return_Two() {
        val actual = fizzbuzz.getResult(2)
        assertThat(actual).isEqualTo("2")
    }

    @Test
    fun should_Return_Fizz_When_Three() {
        val actual = fizzbuzz.getResult(3)
        assertThat(actual).isEqualTo("fizz")
    }

    @Test
    fun should_Return_Four() {
        val actual = fizzbuzz.getResult(4)
        assertThat(actual).isEqualTo("4")
    }
}