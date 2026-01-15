package org.example

fun functions(){
    println("Enter a string:")
    val input = readln()

     reversed(input)
}

fun reversed (stringToReverse: String): String {
    val finalString = buildString {
        for (i in stringToReverse.lastIndex downTo 0){
            append(stringToReverse[i])
    }
}
return finalString
}

//extensions functions we can call a function on an actual object,variable, string, array

//function overloading  we can overload a function to make it callable with different types on input parameters


