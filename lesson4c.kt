fun main(args: Array<String>) {
    // Functions with parameters.
    // Parameters are inputs that get passed as arguments when invoking a function.
    // Note: For parameters,  you must specify the data type of the parameter.

    fun greeting (name: String) {
        println("Hello, $name! , Hope you had a great day.")
    }

    // When the function is invoked, you pass a given name as an argument to the function.
    greeting("John") // Calling the function with an argument
    greeting("Matheka") // Calling the function with an argument


    println("===============================================================")
    // Below is an example of a function that is able to calculate the BMI of a person.
    fun BMI (weight: Double, height: Double) {
        val answer = weight / (height * height)
        println("The BMI of the person is: " + answer)
    }

    BMI(69.5, 1.73) // Calling the function with arguments

     // Create a function that accepts parameters and checks whether a given number is odd or even
    println("===============================================================")
    fun check (x : Int) {
        if (x % 2 == 0) {
            println("$x is an even number.")
        }
        else {
            println("$x is an odd number.")
        }
    } 
    
    check(10)
    check(15)
}