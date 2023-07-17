package com.example.testing.utils

import org.junit.Assert.*

import org.junit.Test

class HelperTest {

    @Test
    fun isPalindrome() {
        //arrange
        val helper = Helper()

        //act
        val result = helper.isPalindrome("Hello")

        //assert
        assertEquals(false,result)
    }
}