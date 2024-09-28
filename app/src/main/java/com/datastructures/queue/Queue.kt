package com.datastructures.queue

interface Queue<T : Any> {

    val count: Int

    val isEmpty: Boolean
        get() = count == 0

    fun enqueue(element: T)

    fun dequeue(): T?

    fun peek(): T?
}
