package com.rmiranda.mykmmapplication.shared


class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }

    fun randomUUID() = UUIDHelper().randomUUID()
}
