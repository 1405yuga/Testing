package com.example.testing.utils

class Helper {

    fun isPalindrome(str : String): Boolean{
        var i=0
        var j = str.length -1
        while(i<j){
            if(str[i]!=str[j]){
                return false
            }
            i++
            j--
        }
        return true
    }
}