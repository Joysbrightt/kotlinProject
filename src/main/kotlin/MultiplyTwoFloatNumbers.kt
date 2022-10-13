import java.util.Scanner
fun main() {
    var firstNumber = Scanner(System.`in`)
    var numberEntered: Float = firstNumber.nextFloat()
    print(numberEntered)

    var secondNumber = Scanner(System.`in`)
    var secondInput: Int = secondNumber.nextInt()
    print(secondInput)

    var addTheIntegers = numberEntered * secondInput
    println("The addition of $numberEntered + $secondInput = $addTheIntegers")

}