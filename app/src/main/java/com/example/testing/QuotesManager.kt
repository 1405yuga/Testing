package com.example.testing

import android.content.Context
import com.google.gson.Gson

class QuotesManager() {

    var quoteList = emptyArray<Quote>()
    var currentQuoteIndex = 0

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

    fun getNextQuote() : Quote{
        if(currentQuoteIndex == quoteList.size-1) return quoteList[currentQuoteIndex]
        return quoteList[++currentQuoteIndex]
    }

    fun getPreviousQuote() : Quote{
        if(currentQuoteIndex == 0) return quoteList[currentQuoteIndex]
        return quoteList[--currentQuoteIndex]
    }


}