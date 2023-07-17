package com.example.testing.utils

import org.junit.Assert
import org.junit.Test

class ParameterizedExample(val input : String , val expectedResult : Boolean) {

    @Test
    fun test(){
        val helper = Helper()

        //act
        val result = helper.isPalindrome(input)

        //assert
        Assert.assertEquals(expectedResult, result)
    }

}