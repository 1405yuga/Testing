package com.example.testing.utils

import org.junit.After
import org.junit.Assert.*
import org.junit.Before

import org.junit.Test

class HelperTest {

    lateinit var helper : Helper

    @Before
    fun setUp(){
        // Runs before every testcase
        println("Before every testcase")
        helper = Helper()
    }

    @After
    fun afterprint(){
        // Runs before every testcase
        println("After every testcase")
    }

    @Test
    fun isPalindrome() {
        //arrange

        //act
        val result = helper.isPalindrome("Hello")

        //assert
        assertEquals(false,result)
    }

    @Test
    fun isPalindrome_level() {
        //arrange
        val helper = Helper()

        //act
        val result = helper.isPalindrome("level")

        //assert
        assertEquals(true,result)
    }
}