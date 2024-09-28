package com.datastructures.tree

fun drinksTree(): TreeNode<String> {
    val tree = TreeNode("Drinks")

    val hot = TreeNode("Hot")

    val cold = TreeNode("Cold")

    val tea = TreeNode("Tea")
    val coffee = TreeNode("Coffee")
    val chocolate = TreeNode("Chocolate")

    val soda = TreeNode("Soda")
    val milk = TreeNode("Milk")

    tree.add(hot)
    tree.add(cold)

    hot.add(tea)
    hot.add(coffee)
    hot.add(chocolate)

    cold.add(soda)
    cold.add(milk)

    return tree
}

fun main() {
    val tree = drinksTree()

    println(">>>DFS<<<")
    tree.dfs {
        println("- ${it.value}")
    }

    println()

    println(">>>BFS<<<")
    tree.bfs {
        println("- ${it.value}")
    }

    println()

    println(">>>Search<<<")
    tree.search("Soda")

    println()

    println(">>>Levels<<<")
    tree.printLevels()
}
