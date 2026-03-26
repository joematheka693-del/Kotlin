// Using if statements or when statement, create a program to find if given year is leap or not

fun main() {
    var year = 2000

    if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
        println("$year is a Leap year")
    }
    else {
        println("$year is not a Leap year")
    }
}