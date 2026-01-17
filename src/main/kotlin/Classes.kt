package org.example

import kotlin.math.PI
import kotlin.math.sqrt


//classes bundle certain data. a blueprint to build something
fun uweppo() {
    val rect1 = rectangle(
        width = 5f,
        height = 7f
    )
    val circle = Circle(radius = 5f)
    println(circle.circumference)

    println(rect1.width)
    println(rect1.height)
    println("The diagonal ia ${rect1.diagonal}. The area is ${rect1.area}")
}
class rectangle(val width: Float, val height: Float){

val diagonal = sqrt(width * width + height * height)

    val area = width * height

 }
data class Circle(val radius:Float){
    val circumference = radius * radius * PI
}

//Interfaces a way to define a contract for a class

