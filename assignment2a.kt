// Research on looping structures in kotlin

// Loops can execute a block of code as long as a specified condition is reached.

// Loops are handy because they save time, reduce errors, and they make code more readable

// 1. Kotlin While loop
// The while loop loops through a block of code as long as a specified condition is true:

fun main() {
    var x = 10

    while (x <= 20) {
        println(x)
        x++
    }
}

// 2. Kotlin Do - While loop
// The do..while loop is a variant of the while loop. 
// This loop will execute the code block once, before checking if the condition is true, then it will repeat the loop as long as the condition is true.

// The loop will always be executed at least once, even if the condition is false, because the code block is executed before the condition is tested:
fun main() {
    var y = 5

    do {
        println(y)
        y++
    }
    while (y < 15)
}

// 3. Kotlin For loop
// Often when you work with arrays, you need to loop through all of the elements.

// To loop through array elements, use the for loop together with the in operator:
fun main() {
    for (counter in 1 .. 10) {
        println("counter is $counter")
    }
}