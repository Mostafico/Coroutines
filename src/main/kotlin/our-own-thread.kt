import kotlinx.coroutines.launch
import kotlinx.coroutines.newSingleThreadContext
import kotlinx.coroutines.runBlocking

fun main(args: Array<String>) = runBlocking<Unit>{
    // .use to close resources after using it
    newSingleThreadContext("MyNewThread").use {ctx ->
        val job = launch(ctx) {
            println("Iam in Thread : ${Thread.currentThread().name}")
        }
    }
}