// Create assignment3.kt and use for loop, create an array of 7 counties and loop through them.
fun main() {
    val counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Thika", "Malindi")
    for (county in counties) {
        println(county)
    }

    println("======================================================================")
    // Create a For loop to print year from 2000 to 2025
    for (year in 2000..2025) {
        println("The year is $year")
    }

    println("======================================================================")
    // Create a For loop to print from 100 to 1
    for (num in 100 downTo 1) {
        println(num)
    }
    println("======================================================================")
    // Create a while loop to print from -20 to +20
    var x = -20

    while (x <= 20) {
        println(x)
        x++
    }

    println("======================================================================")
    // Create a while loop to print all EVEN years from 2000 to 2025.
    var year = 2000
    while (year <= 2025) {
        if (year % 2 == 0) {
            println(year)
        }
        year++
    }
}


