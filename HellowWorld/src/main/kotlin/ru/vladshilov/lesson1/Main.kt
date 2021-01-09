package ru.vladshilov.lesson1

import java.time.LocalDate

fun main(){
    // fun will
    val cntr1 = Contract("233", LocalDate.of(2020,12,31), 258000.00, "OOO Powerbank")
    val cntr2 = Contract("156", LocalDate.of(2020,12,20), 325012.00, "OOO Portal")


    println(cntr1)
    println(cntr2)

}