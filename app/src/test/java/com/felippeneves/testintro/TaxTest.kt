package com.felippeneves.testintro

import com.google.common.truth.Truth.assertThat
import org.junit.After
import org.junit.Before
import org.junit.Test

class TaxTest {

    //You can use to initialize something before the code starts
    @Before
    fun setup() {

    }

    @After
    fun teardown() {

    }

    @Test
    fun calculateTaxTest() {
        val tax = calculateTax(grossIncome = 100.0, taxRate = 0.1)
        assertThat(tax).isEqualTo(10)
    }

    @Test
    fun calculateIncomeTest() {
        val income = calculateIncome(grossIncome = 100.0, taxRate = 0.1)
        assertThat(income).isEqualTo(90)
    }
}