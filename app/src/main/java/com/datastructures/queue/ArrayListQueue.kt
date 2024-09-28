package com.datastructures.queue

class ArrayListQueue<T : Any> : Queue<T> {

    private val storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override fun dequeue(): T? {
        return if (isEmpty) null else storage.removeFirstOrNull()
    }

    override fun peek(): T? {
        return storage.firstOrNull()
    }

    override fun enqueue(element: T) {
        storage.add(element)
    }
}
