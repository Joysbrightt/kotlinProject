import java.util.*

fun main(){

    var firstNumber = Scanner(System.`in`)
    var numberEntered: Float = firstNumber.nextFloat()
    print(numberEntered)

    var secondNumber = Scanner(System.`in`)
    var secondInput: Int = secondNumber.nextInt()
    print(secondInput)


    var thirdNumber = Scanner(System.`in`)
    var thirdInput: Int = thirdNumber.nextInt()
    print(thirdInput)


    val largest = numberEntered
    if (largest > secondInput){
        println("$firstNumber is the larger than $secondInput.")
    }
    if (largest > thirdInput){
        println("$firstNumber is the larger than $thirdNumber.")
    }
     else if(largest < secondInput){
        println("$secondInput is the largest.")
    }
    else{
        println("$thirdInput is the largest")
    }
//    println("The addition of $numberEntered + $secondInput = $addTheIntegers")


}