//import kotlinx.coroutines.async
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//import kotlin.system.measureTimeMillis
//
//fun main(args: Array<String>) = runBlocking<Unit>{
//    val job = launch {
//        val time = measureTimeMillis {
//            val res1 = async { jobOne() }
//            val res2 = async { jobTwo() }
//            println("${res1.await() + res2.await()}")
//        }
//        println("Done in $time")
//    }
//
//    job.join()
//}
//
//suspend fun jobOne(): Int {
//    delay(100)
//    return 20
//}
//
//suspend fun jobTwo(): Int {
//    delay(200)
//    return 10
//}