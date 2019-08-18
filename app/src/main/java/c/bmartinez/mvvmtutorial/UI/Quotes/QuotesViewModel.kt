package c.bmartinez.mvvmtutorial.UI.Quotes

import androidx.lifecycle.ViewModel
import c.bmartinez.mvvmtutorial.Data.Quote
import c.bmartinez.mvvmtutorial.Data.Repository

class QuotesViewModel(private val quoteRepository: Repository): ViewModel() {

    fun getQuotes() = quoteRepository.getQuotes()

    fun addQuote(quote: Quote) = quoteRepository.addQuote(quote)
}