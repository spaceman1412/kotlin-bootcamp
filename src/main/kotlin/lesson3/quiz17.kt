package lesson3

fun main()
{
    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry", "green curry", "red pepper" )

    val curries = spices.filter {
        it.contains("curry")
    }.sortedByDescending { it.length }

    val spicesList = spices.asSequence().take(3).filter {
        it[0] == 'c' && it[it.length-1] == 'e'
    }.toList()


    println(curries)
    println(spicesList)

}