package com.example.testing

import android.content.Context
import com.google.gson.Gson

class QuotesManager() {

    var quoteList = emptyArray<Quote>()
    val currentQuoteIndex = 0

    fun populateQuoteFromAssets(context: Context, filename: String) {
        val inputStream = context.assets.open(filename)
        val size: Int = inputStream.available()
        val buffer = ByteArray(size)
        inputStream.read(buffer)
        inputStream.close()

        val json = String(buffer, Charsets.UTF_8)
        val gson = Gson()
        quoteList = gson.fromJson(json,Array<Quote>::class.java)
    }

    fun getCurrentQuote() : Quote{
        return quoteList[currentQuoteIndex]
    }


}