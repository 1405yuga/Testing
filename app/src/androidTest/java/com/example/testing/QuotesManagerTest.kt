package com.example.testing

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import org.junit.Test

class QuotesManagerTest {

    @Test
    fun populateQuoteFromAssets() {
        //arrange
        val quoteManager = QuotesManager()
        val context = ApplicationProvider.getApplicationContext<Context>()
        //act
        quoteManager.populateQuoteFromAssets(context, "")

    }
}