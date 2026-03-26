fun main() {
    val points = -2000

    if (points < 0) {
        println("Invalid points")
    }
    else if (points >= 0 && points <= 100) {
        println("You do not qualify")
    }
    else if (points >= 101 && points <= 400) {
        println("You win a smartphone")
    }
    else if (points >= 401 && points <= 1000) {
        println("You win a Laptop")
    }
    else {
        println("You win a trip to Canada")
    }
}