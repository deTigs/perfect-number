
fun main() {
    //A program to check if a number is a perfect number
    println("Enter number:")
    val number = readlnOrNull()?.toIntOrNull()
    var sum = 0

    if (number != null) {
        for (i in 1 until number) {
            if (number % i == 0) {
                sum += i
            }
        }
    }
    else {
        println("Please enter a valid integer")
    }

    val perfectOrNot = if (number == sum) "$number is a perfect number"
                        else if(number == null) ""
                        else "$number not a perfect number."
    println(perfectOrNot)
}