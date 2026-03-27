fun main() {
    // Below is a function that is able to add two numbers.
    fun addition () {
        val number1 = 10
        val number2 = 20
        val sum = number1 + number2

        println("The sum of the numbers is: $sum")
    }

    addition() // Calling the function to execute its code

    println("===============================================================")
    // Create a function that is able to multiply three numbers.
    fun multiplication() {
        val num1 = 5
        val num2 = 10
        val num3 = 15
        val product = num1 * num2 * num3

        println("The product of the numbers is: $product")
    }

    multiplication() // Calling the function to execute its code


    println("===============================================================")
    // Given two numbers, create a function that is able to find the largest and the smallest number among them.
    fun findLargestAndSmallest() {
        val numb1 = 25
        val numb2 = 15
        
        val largest = if(numb1 > numb2) numb1 else numb2
        val smallest = if(numb1 < numb2) numb1 else numb2

        println("The largest number is: $largest")
        println("The smallest number is: $smallest")
    }

    findLargestAndSmallest() // Calling the function to execute its code

    // Using if-else statement
    println("===============================================================")

    fun Compare() {
        val a = 30
        val b = 20

        if (a > b) {
            println("$a is greater than $b")
        }
        else if (a < b) {
            println("$a is less than $b")
        }
        else {
            println("$a is equal to $b")
        }
    }

    Compare() // Calling the function to execute its code

    // Given 179 minutes, create a function that is able to convert it to hours and show the remainder of the minutes.
    println("===============================================================")
    fun convert() {
        val minutes = 179
        val hours = minutes / 60
        val remMinutes = (minutes % 60)

        println("$minutes minutes is equal to $hours hours and $remMinutes minutes")
    }

    convert()
}