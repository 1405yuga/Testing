package com.example.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.gson.JsonSyntaxException
import org.junit.Assert
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

    @Test
    fun populateQuoteFromAssets_ValidJsonExpected() {
        //arrange
        val quoteManager = QuotesManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        //act
        quoteManager.populateQuoteFromAssets(context, "quotes.json")
        //assert
        Assert.assertEquals(true, quoteManager.quoteList.size>10)
    }

    @Test
    fun test_PreviousQuote() {
        //arrange
        val quoteManager = QuotesManager()
        quoteManager.quoteList = arrayOf(
            Quote("1st quote","1"),
            Quote("2nd quote","2"),
            Quote("3rd quote","3")
        )
        //act
        val result : Quote = quoteManager.getPreviousQuote()

        //assert
        Assert.assertEquals("1", result.author)
    }

    @Test
    fun test_NextQuote() {
        //arrange
        val quoteManager = QuotesManager()
        quoteManager.quoteList = arrayOf(
            Quote("1st quote","1"),
            Quote("2nd quote","2"),
            Quote("3rd quote","3")
        )
        //act
        val result : Quote = quoteManager.getNextQuote()

        //assert
        Assert.assertEquals("2", result.author)
    }
}