//import kotlinx.coroutines.*
//
//fun main(args: Array<String>) = runBlocking {
//    val job = GlobalScope.launch {
//        repeat(100000){
//            //delay can handle cancellation
////            delay(100)
////            print(".")
//            //using yield as thread sleep isn't cancellable by default
////            print(".")
////            yield()
////            Thread.sleep(100)
//
//            //implementing cancellation ourselves
////            if(!isActive) throw CancellationException()
////            print(".")
//            if(!isActive) return@launch
//            print(".")
//        }
//    }
//
//    delay(100)
//
////    job.cancel()
////    job.join()
//    job.cancelAndJoin()
//
//    print("done")
//}