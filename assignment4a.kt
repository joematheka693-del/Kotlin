fun main() {
    // Create a function that accepts parameter that is able to do the convertion of degree celcius into farenheit.
    fun farenheit (degreeCelcius : Double) {
    val answer =  (degreeCelcius * 1.8) + 32
    println("$degreeCelcius degree Celcius is equal to $answer degree Farenheit.")
}

farenheit(20.5)

// Create a function that is able to calculate the compound interest of a person.
println("===============================================================")
fun compoundInterest (principal: Double, rate: Double, time: Double) {
    val amount = principal * Math.pow(1 + rate / 100, time)
    val interest = amount - principal
    println("The compound interest is: $interest")
}

compoundInterest(1000.0, 5.0, 2.0)
}

