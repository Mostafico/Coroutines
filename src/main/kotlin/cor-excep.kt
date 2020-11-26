import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking {
    val job = GlobalScope.launch {
        try {
            repeat(1000){
                yield()
                print(".")
                Thread.sleep(10)
            }
        }
        catch (ex: CancellationException){
            println()
            println("Cancelled")
        }
        finally {
            withContext(NonCancellable){
                println()
                println("In Finally")
            }
        }

    }
    delay(100)
    job.cancel("reason")
    job.join()

}