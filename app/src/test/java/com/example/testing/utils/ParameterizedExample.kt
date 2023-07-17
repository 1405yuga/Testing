package com.example.testing.utils

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedExample(val input : String , val expectedResult : Boolean) {

    @Test
    fun test(){
        val helper = Helper()

        //act
        val result = helper.isPalindrome(input)

        //assert
        Assert.assertEquals(expectedResult, result)
    }

    companion object{

        @JvmStatic
        @Parameterized.Parameters
        fun data() : List<Array<Any>>{
            return listOf(
                arrayOf("hee",false),
                arrayOf("lol",true)
            )
        }
    }

}