package lesson3

fun main() {
    println(fitMoreFish(10.0, listOf(3,3,3)))
    println(fitMoreFish(8.0, listOf(2,2,2), hasDecorations = false))
}

fun fitMoreFish(tankSize: Double, currentFish: List<Int>, fishSize: Int = 2, hasDecorations: Boolean = true): Boolean {
    var listTotal = 0
    currentFish.forEach {
        listTotal += it
    }
    val total = listTotal + fishSize
    val percentage = total / tankSize
    return if (hasDecorations)
        percentage <= 0.8
    else percentage <= 1.0
}