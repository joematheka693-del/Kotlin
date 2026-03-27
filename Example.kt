fun main() {
    val counties = arrayOf("Nairobi", "Mombasa", "Kisumu", "Nakuru", "Eldoret", "Machakos", "Kiambu")

    for (county in counties) {
        if (county == "Nairobi" || county == "Kisumu") {
            println("County: $county")
        }
    }

    println("================================================================")

    println("County: ${counties[0]}") // Nairobi
    println("County: ${counties[2]}") // Kisumu
}