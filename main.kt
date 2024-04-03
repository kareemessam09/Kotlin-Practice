import java.util.Calendar

fun main() {
    println("Hello, Kemo!")
    dayOfWeek()
}

fun dayOfWeek() {
    println("what is the day today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println( when(day){
        1 -> "sunday"
        2 -> "monday"
        3 -> "tuesday"
        4 -> "wednesday"
        5 -> "thursday"
        6 -> "friday"
        7 -> "saturday"
        else -> "time has stopped"
    })

}