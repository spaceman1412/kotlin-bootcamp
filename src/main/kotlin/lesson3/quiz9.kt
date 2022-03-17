package lesson3_quiz9


fun main(args: Array<String>) {
    var fortune: String
    for (i in 1..10) {
        fortune = getFortune(getBirthday())
        println("\nYour fortune is: $fortune")
        if (fortune.contains("Take it easy")) break;
    }
}

fun getFortune(birthday: Int) : String
{
    return when(birthday)
    {
        28 or 31 -> "Hello"
        in 1..7 -> "First week"
        else -> "Nothing"
    }
}

fun getBirthday() : Int
{
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}