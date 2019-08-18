package c.bmartinez.mvvmtutorial.Utilities

import c.bmartinez.mvvmtutorial.Data.FakeDatabase
import c.bmartinez.mvvmtutorial.Data.Repository
import c.bmartinez.mvvmtutorial.UI.Quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory{
        val quotesRespository = Repository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quotesRespository)
    }
}