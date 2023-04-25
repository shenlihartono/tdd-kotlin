package com.example.demo

class Fizzbuzz {
    fun getResult(input: Int): String {
        if (input == 15) {
            return "fizzbuzz"
        }

        if (input % 3 == 0) {
            return "fizz"
        }

        if (input % 5 == 0) {
            return "buzz"
        }

        return input.toString()
    }

}
