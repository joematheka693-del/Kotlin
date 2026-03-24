// Research on conditional statements in kotlin

// Kotlin has the following conditionals:
// Use if to specify a block of code to be executed, if a specified condition is true
// Use else to specify a block of code to be executed, if the same condition is false
// Use else if to specify a new condition to test, if the first condition is false
// Use when to specify many alternative blocks of code to be executed

// 1. Kotlin if statement

fun main() {
  val x = 20
  val y = 18

  if (x > y) {
    println("x is greater than y")
  }
}

// 2. Kotlin else statement

fun main() {
    val age = 20

    if (age >= 18) {
        println("This is an adult")
    }
    else {
        print("This is a minor")
    }
}

// 3. Kotlin else-if statement
fun main() {
    val time = 23

    if (time <= 10) {
        println("Good morning")
    }
    else if (time <= 15) {
        println("Good afternoon")
    }
    else {
        println("Good evening")
    }
}

// 4. Kotlin if-else statement
fun main() {
    val time = 23
    val greeting = if (time <= 11) {
        println("Good morning")
    }
    else {
        println("Good evening")
    }
}

// 5. Kotlin when 
// Instead of writing many if..else expressions, you can use the when expression, which is much easier to read.
// It is used to select one of many code blocks to be executed.

fun main() {
    val day = 3

    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid day."
    }

    println(result)
}

// The when variable (day) is evaluated once
// The value of the day variable is compared with the values of each "branch"
// Each branch starts with a value, followed by an arrow (->) and a result
// If there is a match, the associated block of code is executed
// else is used to specify some code to run if there is no match
// In the example above, the value of day is 3, meaning "Wednesday" will be printed