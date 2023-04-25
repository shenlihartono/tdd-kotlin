package com.example.demo

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class FizzBuzzTest {
    @Test
    fun should_Return_One() {
        val fizzbuzz = Fizzbuzz()
        val actual = fizzbuzz.getResult(1)
        assertEquals("1", actual)
    }

    @Test
    fun should_Return_Two() {
        val fizzbuzz = Fizzbuzz()
        val actual = fizzbuzz.getResult(2)
        assertEquals("2", actual)
    }
}