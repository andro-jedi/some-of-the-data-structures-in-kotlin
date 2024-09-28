package com.datastructures.tree

import com.datastructures.queue.ArrayListQueue

typealias Visitor<T> = (TreeNode<T>) -> Unit

class TreeNode<T>(val value: T) {

    private val children: MutableList<TreeNode<T>> = mutableListOf()

    fun add(child: TreeNode<T>) = children.add(child)

    fun dfs(visit: Visitor<T>) {
        visit(this)

        children.forEach {
            it.dfs(visit)
        }
    }

    fun bfs(visit: Visitor<T>) {
        visit(this)

        val queue = ArrayListQueue<TreeNode<T>>()
        children.forEach { queue.enqueue(it) }

        var node = queue.dequeue()
        while (node != null) {
            visit(node)
            node.children.forEach { queue.enqueue(it) }
            node = queue.dequeue()
        }
    }

    fun search(value: T): TreeNode<T>? {
        var result: TreeNode<T>? = null
        dfs {
            if (it.value == value) {
                result = it
                println("Found $value :)")
                return@dfs
            }
        }
        return result.also {
            if (it == null) println("$value is not found :(")
        }
    }

    fun printLevels() {
        val queue = ArrayListQueue<TreeNode<T>>()
        queue.enqueue(this)

        var leftOnLevel = 0

        while (!queue.isEmpty) {
            leftOnLevel = queue.count

            while (leftOnLevel > 0) {
                val node = queue.dequeue()

                if (node != null) {
                    println(node.value)
                    node.children.forEach { queue.enqueue(it) }
                    leftOnLevel--
                } else {
                    break
                }
            }
            println("---")
        }
    }
}
