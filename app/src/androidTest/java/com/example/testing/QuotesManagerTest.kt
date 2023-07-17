package com.example.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
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
}