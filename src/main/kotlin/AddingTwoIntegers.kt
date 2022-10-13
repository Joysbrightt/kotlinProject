import java.util.Scanner

fun main(){
    var firstNumber = Scanner(System.`in`)
    var inputedNumber: Int = firstNumber.nextInt()
    print(inputedNumber)

    var secondNumber = Scanner(System.`in`)
    var secondInput: Int = secondNumber.nextInt()
    print(secondInput)

    var addTheIntegers = inputedNumber + secondInput
    println("The addition of $inputedNumber + $secondInput = $addTheIntegers")

}