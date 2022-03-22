package lesson3

fun main()
{
    println(whatShouldIDoToday("rainy",0))

    //Practice loop and while
    /*Loops
    Using repeat:

    fun main(args: Array<String>) {
        var fortune: String = ""
        repeat (10) {
            fortune = getFortune(getBirthday())
            println("\nYour fortune is: $fortune")
            if (fortune.contains("Take it easy")) break;
        }
    }

    Using a while loop:

    fun main(args: Array<String>) {
        var fortune: String = ""
        while (!fortune.contains("Take it easy")) {
            fortune = getFortune(getBirthday())
            println("\nYour fortune is: $fortune")
        }
    }*/
}

fun whatShouldIDoToday( weather: String = "sunny", temperature: Int = 24): String {
    var mood  = readLine()
    val isMoodSad = mood == "sad"
    val isWeatherRainy = weather == "rainy"
    val isTemperature = temperature == 0


    return when {
        isMoodSad && isWeatherRainy && isTemperature -> "stay in bed"
        temperature > 35 -> "go swimming"
        else -> "blah blah."
    }
}