package com.datastructures.stack

class StackImpl<T: Any> : Stack<T> {

    private val storage = arrayListOf<T>()

    override val count: Int
        get() = storage.size

    override fun push(element: T) {
        storage.add(element)
    }

    override fun peek(): T? {
        return storage.lastOrNull()
    }

    override fun pop(): T? {
        return storage.removeLastOrNull()
    }
}
