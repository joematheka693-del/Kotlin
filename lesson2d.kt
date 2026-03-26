fun main() {
    val marks : Int = 200

    if (marks > 0 && marks < 30) {
        println("You Failed")
    }
    else if (marks >= 30 && marks <= 50) {
        println("Average")
    }
    else if (marks > 50 && marks <= 70) {
        println("Above Average")
    }
    else if(marks > 70 && marks <= 100){
        println("You Passed")
    }
    else (
        println("Invalid Score")
    )
}