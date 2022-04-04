package lesson4


class Spice(
    val nameOfSpice: String = "curry",
    val levelOfSpiceness: String = "mild"
) {


    val heat: Int
        get() {
            return when (levelOfSpiceness) {
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        println("The name of spice is $nameOfSpice, the level of spice is $heat")
    }
}

fun main() {
    val spices1 = listOf(
        Spice("curry", "mild"),
        Spice("pepper", "medium"),
        Spice("cayenne", "spicy"),
        Spice("ginger", "mild"),
        Spice("red curry", "medium"),
        Spice("green curry", "mild"),
        Spice("hot pepper", "extremely spicy")
    )
    val spice = Spice("cayenne", "spicy")
    val spicelist = spices1.filter {it.heat < 5}
    fun makeSalt() = Spice("Salt")

}