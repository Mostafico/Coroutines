import kotlinx.coroutines.Deferred
import kotlinx.coroutines.*

fun main(args: Array<String>) = runBlocking{
    launch {
        val result = async{doWork("Work One")}
        println(result.await())
    }

    println("Hello World !")
}

fun doWorkAsync(name: String): Deferred<Int> = GlobalScope.async<Int> {
    println(name + " Started in + ${Thread.currentThread().name}")
    delay(2000)
    println(name + " Ended")
    return@async 40
}

suspend fun doWork(name: String): Int {
    println(name + " Started")
    delay(400)
    println(name + " Ended")
    return 40
}