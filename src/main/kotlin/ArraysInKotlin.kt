class ArraysInKotlin

fun main(){
        val numbers = intArrayOf(1,2,3,4,42,-3)
        if (4 in numbers){
            println("numbers array contains 4.")
        }

        val checkingNumbers = intArrayOf(11,12,13,15,14,13)
        if(13 in checkingNumbers || 14 in checkingNumbers){
            println("checkingNumbers array contains the number entered")
        }
    else{
        println("checkingNumber array doesn't contains the number entered")
        }


    val number1: Int = 55
    val number2: Long = number1.toLong()
    println(number2)

    }
