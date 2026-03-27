// research on function without parameters in kotlin

// A function is a block of code which only runs when it is called.

// You can pass data, known as parameters, into a function.

// Functions are used to perform certain actions, and they are also known as methods.

// 1. Predefined Functions
// Example of a predefined function is println() which is used to print something on the console

// 2. User Defined Functions
// A user defined function is a function that is created by the user to perform a specific task
// Example of a user defined function is a function that is able to calculate the area of a circle
fun areaOfCircle(radius: Double): Double {
    val area = Math.PI * radius * radius
    return area
}

// 3. Function without parameters
// A function without parameters is a function that does not take any parameters and it is used to perform a specific task
fun greet() {
    println("Hello, welcome to Kotlin programming!")
}