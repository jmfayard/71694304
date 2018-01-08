package com.github.jmfayard.askotlintest

import io.kotlintest.matchers.shouldBe
import org.junit.Test

import org.junit.Assert.*

class CalculatorTest {

    val calculator : Calculator

    init {
        calculator = com.github.jmfayard.askotlintest.calculator()
    }

    @Test
    fun twoPlusTwo() {
        calculator().twoPlusTwo() shouldBe 4
    }
}