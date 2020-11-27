//import kotlinx.coroutines.async
//import kotlinx.coroutines.delay
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//
//fun main(args: Array<String>)  = runBlocking<Unit>{
//    val job = launch {
//        val result = async { doWork("Work One") }
//        //to block second work until first is done
//        result.await()
//        doWork("Work Two")
//    }
//
//    job.join()
//}
//
//suspend fun doWork(name: String): Int {
//    println(name + " Started")
//    delay(400)
//    println(name + " Ended")
//    return 40
//}