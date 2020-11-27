//import kotlinx.coroutines.CoroutineName
//import kotlinx.coroutines.Dispatchers
//import kotlinx.coroutines.launch
//import kotlinx.coroutines.runBlocking
//
//fun main(args: Array<String>) = runBlocking<Unit> {
//    val job = launch(Dispatchers.Default + CoroutineName("test")) {
//        println("I'm working in thread ${Thread.currentThread().name}")
//    }
//    job.join()
//}