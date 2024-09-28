package com.datastructures.stack

fun main() {

    println(")()()".checkParentheses())
}

private fun String.checkParentheses(): Boolean {
    val stack = StackImpl<Char>()
    for (char in this) {
        when (char) {
            '(' -> stack.push(char)
            ')' -> if (stack.isEmpty) return false else stack.pop()
        }
    }
    return stack.isEmpty
}
