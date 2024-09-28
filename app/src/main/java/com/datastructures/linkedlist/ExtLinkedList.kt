package com.datastructures.linkedlist

fun <T : Any> LinkedList<T>.printInReverse() {
    this.nodeAt(0)?.printInReverse()
}

fun <T : Any> LinkedList<T>.getMiddle(): Node<T>? {
    var fast = this.nodeAt(0)
    var slow = this.nodeAt(0)

    while (fast != null) {
        fast = fast.next
        if (fast != null) {
            slow = slow?.next
            fast = fast.next
        }
    }

    return slow
}

fun <T : Any> LinkedList<T>.reversed(): LinkedList<T> {
    val result = LinkedList<T>()

    val head = this.nodeAt(0)
    if (head != null) {
        addInReverse(result, head)
    }
    return result
}

private fun <T : Any> addInReverse(list: LinkedList<T>, node: Node<T>) {
    val next = node.next
    if (next != null) {
        addInReverse(list, next)
    }
    list.append(node.value)
    node.next = null
}



