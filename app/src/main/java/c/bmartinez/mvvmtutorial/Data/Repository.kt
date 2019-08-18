package c.bmartinez.mvvmtutorial.Data

class Repository private constructor(private  val quoteDao: FakeQuoteDao) {

    companion object{
        @Volatile private var instance: Repository? = null

        fun getInstance(quoteDao: FakeQuoteDao) =
            instance?: synchronized(this){
                instance?: Repository(quoteDao).also { instance = it}
            }
    }
}