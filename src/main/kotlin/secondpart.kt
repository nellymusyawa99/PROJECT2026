package org.example

//Arrays - is a container used to store multiple pieces of the same data type
fun second (){
   val favoriteNumbers = intArrayOf(1,2,3,58)

    println(favoriteNumbers[3])

    val inputt = readln()
    val inputtAsInteger = inputt.toIntOrNull()
    val favoriteNumberss = intArrayOf(1,2,4,67)+ 5 // the +5 means that a new number has been added to the array. because array is fixed without the +5 or (1,2,3,67) the program will know we have 3 indices
    favoriteNumberss[2] = 69 // here this means that an array is utable meaning the value in index  2 has been changed from 4 to 69

    if(inputtAsInteger != null && inputtAsInteger in 0 .. favoriteNumberss.lastIndex){
        println("your number is ${favoriteNumberss[inputtAsInteger]}")
    }else {
        println("That index doesnt exist")
    }

    //Loops

}