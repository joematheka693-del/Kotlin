// How to create an array in Kotlin

// Arrays are used to store multiple values in a single variable, instead of creating separate variables for each value.

// To create an array, use the arrayOf() function, and place the values in a comma-separated list inside it:

fun main() {
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  println(cars[3])
}

// To change the value of a specific element, refer to the index number:
fun main() {
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  cars[0] = "Opel"
  println(cars[0])
}

// To find out how many elements an array have, use the size property:
fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
    println(cars.size)
}

// You can use the in operator to check if an element exists in an array:
fun main() {
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  if ("Volvo" in cars) {
    println("It exists!")
  } else {
    println("It does not exist.")
  }
}

// Loop through an array

// Often when you work with arrays, you need to loop through all of the elements.

// You can loop through the array elements with the for loop
fun main() {
  val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")
  for (x in cars) {
    println(x)
  }
}