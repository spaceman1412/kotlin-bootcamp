package lesson3

import kotlin.random.Random

fun main()
{
    val rollDice = { Random.nextInt(12) + 1}
    print(rollDice())
}


