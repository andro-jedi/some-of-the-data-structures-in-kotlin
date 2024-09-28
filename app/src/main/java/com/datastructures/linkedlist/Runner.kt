package com.datastructures.linkedlist

fun main() {
    nodesExample()
    println()

    appendExample()
    println()

    pushExample()
    println()

    popExample()
    println()

    insertExample()
    println()

    removeLastExample()
    println()

    removeAfterExample()
    println()

    getMiddleExample()
    println()

    reversedExample()
    println()
}

fun nodesExample() {
    println("nodesExample")
    val list = Node(value = 1, next = Node(value = 2, next = Node(value = 3, next = Node(value = 4))))
    println(list)
    println("nodes reversed")
    list.printInReverse()
}

private fun appendExample() {
    val list = LinkedList<Int>()
    list.append(1).append(2).append(3)
    println("appendExample")
    println(list.toString())
}

private fun pushExample() {
    val list = LinkedList<Int>().push(1).push(2).push(3)
    println("pushExample")
    println(list.toString())
}

private fun popExample() {
    val list = LinkedList<Int>().push(1).push(2).push(3)
    println("popExample")
    println("Before pop: $list")

    val poppedValue = list.pop()
    println("After pop: $list")
    println("Popped value: $poppedValue")
}

private fun insertExample() {
    val list = LinkedList<Int>().push(1).push(2).push(3)
    println("insertExample")
    println("Before insertion: $list")

    list.insert(0, list.nodeAt(1)!!)
    println("After insertion: $list")
}

private fun removeLastExample() {
    val list = LinkedList<Int>().append(1).append(2).append(3)
    println("removeLastExample")
    println("Before remove last: $list")

    list.removeLast()
    println("After remove last: $list")
}

private fun removeAfterExample() {
    val list = LinkedList<Int>().append(1).append(2).append(3)
    println("removeAfterExample")
    println("Before remove after: $list")

    val node = list.nodeAt(0)!!
    list.removeAfter(node)
    println("After remove after: $list")
}

private fun getMiddleExample() {
    val list = LinkedList<Int>().append(1).append(2).append(3).append(4).append(5)
    println("getMiddleExample: $list")
    val middle = list.getMiddle()
    println("The middle: ${middle?.value}")
}

private fun reversedExample() {
    val list = LinkedList<Int>().append(1).append(2).append(3)
    println("reversedExample")
    println("Before reverse: $list")

    val reversed = list.reversed()
    println("After reverse: $reversed")
}
