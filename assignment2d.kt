// Using when statement to determine a leap year

fun main() {
    var year = 2000

    when {
        (year % 400 == 0) -> println("$year is a leap year")
        (year % 100 == 0) -> println("$year is not a leap year")
        (year % 4 == 0) -> println("$year is a leap year")
        else -> println("$year is not a leap year")
    }
}