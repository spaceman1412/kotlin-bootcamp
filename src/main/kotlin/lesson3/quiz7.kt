package lesson3_quiz7


fun main() {
    println("Hello world")
    val value = getFortuneCookie()
    println("Your fortune is: $value")
    while(value != "Take it easy and enjoy life!")
    {
        val value = getFortuneCookie()
        println("Your fortune is: $value")
    }
    println("Your fortune is: $value")
}

fun getFortuneCookie() : String
{
    val listFortunes = listOf("You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.")
    print("Enter your birthday ")
    var birthday = readLine()?.toIntOrNull() ?: 1
    val value = birthday/listFortunes.count()
    return listFortunes[value]
}