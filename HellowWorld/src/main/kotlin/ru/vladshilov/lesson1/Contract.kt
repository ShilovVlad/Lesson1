package ru.vladshilov.lesson1

import java.time.LocalDate

data class Contract(
    val Number: String = "w/n",
    val Date: LocalDate = LocalDate.of(2020,12,1),
    val Summa: Double = 1.00,
    val Contragent: String?
) {
    override fun toString(): String {
        return("Contract #$Number, date: $Date, amount: $Summa, contragent: $Contragent")
    }

    override fun hashCode(): Int {
        return 42+Number.hashCode() + Date.hashCode() + Summa.hashCode() + Contragent.hashCode()

    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other?.javaClass != this.javaClass) return false
        other as Contract
        if (other.Number != this.Number) return false
        if (other.Date != this.Date) return false
        if (other.Summa != this.Summa) return false
        if (other.Contragent != this.Contragent) return false
        return true

    }
}