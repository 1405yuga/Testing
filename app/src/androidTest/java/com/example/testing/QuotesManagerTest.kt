package com.example.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Test
import java.io.FileNotFoundException

class QuotesManagerTest {

    @Test(expected = FileNotFoundException::class) //assert
    fun populateQuoteFromAssets() {
        //arrange
        val quoteManager = QuotesManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        //act
        quoteManager.populateQuoteFromAssets(context, "")
    }

    @Test(expected = JsonSyntaxException::class) //assert
    fun populateQuoteFromAssets_InvalidJsonExpected_Exception() {
        //arrange
        val quoteManager = QuotesManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        //act
        quoteManager.populateQuoteFromAssets(context, "malformed.json")
    }
}