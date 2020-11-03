package com.rmiranda.mykmmapplication.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}
