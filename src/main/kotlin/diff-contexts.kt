//import kotlinx.coroutines.*
//
//fun main(args: Array<String>) = runBlocking<Unit> {
//    launch { // context of the parent, main runBlocking coroutine
//        println("main runBlocking      : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
//        println("Unconfined            : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(Dispatchers.Default) { // will get dispatched to DefaultDispatcher
//        println("Default               : I'm working in thread ${Thread.currentThread().name}")
//    }
//    launch(newSingleThreadContext("MyOwnThread")) { // will get its own new thread
//        println("newSingleThreadContext: I'm working in thread ${Thread.currentThread().name}")
//    }
//
//    delay(3000)
//
//    println()
//    println()
//
//
//    launch(Dispatchers.Unconfined) { // not confined -- will work with main thread
//        println("Unconfined      : I'm working in thread ${Thread.currentThread().name}")
//        delay(500)
//        println("Unconfined      : After delay in thread ${Thread.currentThread().name}")
//    }
//
//    delay(1000)
//
//    println()
//    println()
//
//    launch { // context of the parent, main runBlocking coroutine
//        println("main runBlocking: I'm working in thread ${Thread.currentThread().name}")
//        delay(1000)
//        println("main runBlocking: After delay in thread ${Thread.currentThread().name}")
//    }
//}