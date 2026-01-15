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

    println("How many numbers will you enter?")
    val amountOfNumbers = readln().toIntOrNull() ?: 0
    var sum = 0
    var i = 0
    while (i < amountOfNumbers){
        println("Please enter number #${i + 1}") //i is increased by 1
        val number = readln().toIntOrNull() ?: 0 // so ?: 0 means that if you input an invalid number like "hello" and add with lets say 5 the answer will come as 5. meaning it has ignored the invalid input. ?: continue means if you put the invalid the program will ask you to enter again unit you enter correct value. ?: break meas it stops everything
        sum += number
        i++
    }
    println("tHE TOTAL SUM IS $sum")






}