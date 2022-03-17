import java.util.Calendar

fun main(args: Array<String>) {
    val time : Int? = if(args[0].toInt() in 0..24) args[0].toInt() else null
    print(args[0])
    println(
        if (time != null) {
            if(time < 12) "Good morning, Kotlin"
            else "Good night, Kotlin"
        } else ""
    )

}
fun dayOfWeek()
{
    println("What day is today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    when(day){
        1 -> println("Monday")
        2 -> println("Tuesday")
        3 -> println("Wednesday")
        4 -> println("Thursday")
        5 -> println("Friday")
        6 -> println("Saturday")
        7 -> println("Sunday")
    }
}
