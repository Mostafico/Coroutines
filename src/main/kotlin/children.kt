//import kotlinx.coroutines.*
//
//fun main(args: Array<String>) = runBlocking<Unit>{
//    val outer = launch {
//        println("Outer Thread : ${Thread.currentThread().name}")
//            val child = launch {
//                println("Inner Thread: " + Thread.currentThread().name)
//                try {
//                    repeat(1000) {
//                        print(".")
//                        delay(1)
//                    }
//                } catch (ex: CancellationException) {
//                    println("ex : Child Cancelled")
//                }
//            }
//            launch {
//                println("Second Inner Thread: " + Thread.currentThread().name)
//                repeat(1000){
//                    print("-")
//                    delay(1)
//                }
//            }
//
//
//        repeat(1000){
//            print("L")
//            delay(1)
//        }
//    }
//
//    delay(200)
//    outer.cancelChildren()
//
//    outer.join()
//
//}