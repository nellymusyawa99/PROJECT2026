package org.example

fun main() {
    //String
    val message: String = "Happy new year"

    //integer
    val number: Int = 10

    //float
    val temperature: Float = 37.5f

    //double
    val price: Double = 99.99

    //Boolean
    val isKotlinFun : Boolean = true

    println("message: $message")
    println("number: $number")
    println("temperature:$temperature")
    println("price:$price")
    println("isKotlinFun:$isKotlinFun")

    //arithmetic operations
    var a=10
    a += 5
    val b=5
    println(a+b)

    //comparison operators
    val c= 20
    val d=30
    val aretheyequal = c==d
    println(aretheyequal)

    //Logical operators AND &&, OR ||
    val e= 10
    val f = 17
    val arebotheven = e % 2 == 0 && f % 2 == 0
    println(arebotheven)

    // AND is usually prioritized more

    //console input
    println("please enter a number:")
    val input = readln() // here the word input is a string so u have to convert into integer that why we use code in line 48
    val inputAsInteger = input.toInt()
    val isEven = inputAsInteger % 2 == 0
    println("Is the number even? $isEven")

    //nullabiliy If the value entered is not integer instead of it bringing error, it returns null
    print("please enter number:")
    val weka = readln()
    val wekaAsInteger = weka.toIntOrNull() ?: 0 //null safety    ?: 0  this assigns the invalid value as 0 so the output will be even. Try with "hello"       ?.inc this one increments     ?.rem is for remainder
    val yetEven= wekaAsInteger!! % 2 == 0 //!!  means double , but if we put this it crashes the program coz it cant process anything other than int
    println("Is the number Even? $yetEven")

    //if conditions != means not equal toy
    println("please enter a number:")
    val eka = readln()
    val ekaAsInteger = eka.toIntOrNull()

    if (ekaAsInteger != null){
        val output = if(ekaAsInteger % 2 == 0){

            "The number is even"
        } else if (ekaAsInteger <10 ){
            "The number is odd and less than 10"
        }else {
            "The number is odd and at least 11"
        }
        println(output)

    }else {
        println("Enter a valid number!")
    }




}

// we have 5 primitive data types String, integer, float 34 bits, double 64bits, Boolean
 // var is changable

