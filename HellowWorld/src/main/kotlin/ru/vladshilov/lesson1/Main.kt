package ru.vladshilov.lesson1

import java.time.LocalDate

fun main(){
    // fun will
    val cntr = Contract("233", LocalDate.of(2020,12,31), 258000.00, "OOO Powerbank")


    println(cntr)

}