fun main(args: Array<String>) {
    // For loop
    // It is used to execute a block of code/statement a number of times until a condition is met

    for (number in 1 .. 10) {
        println("The count is: $number")
    }

    println("====================================")

    // Create a loop that is able to print from 50 to 65

    for (num in 50 .. 65) {
        println("The count is $num")
    }

    println("======================================")
     // research on how to increment on the for loop by use of steps
     for (x in 20 .. 40  step 2) {
        println(x)
     }

     println("======================================")
    //  Odd number in a given range
     for (x in 20 .. 40) {

        if (x % 2 != 0) {
            println("$x is an odd number")
        }
        
     }

    println("======================================")
    //  Generate multiplication table of 5 from 1 - 5
    for (y in 1..5) {
        val mul = y * 5
        println("5 * $y = $mul")
    }

    println("======================================")
    //create a program that is able to find the factorial of number 5
     var factorial = 1
    for (i in 1..5) {
        factorial = factorial *  i
        println(factorial)
    }
    println("Factorial of 5 is $factorial")
}

// Check on the difference between local variables and global variables