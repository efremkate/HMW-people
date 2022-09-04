package ru.netology

fun main() {
    val likes = 121
    val naming1 = "человеку"
    val naming2 = "людям"

    val result = if (likes > 10 && likes < 21 || likes % 100 == 11) naming2 else naming1

    println("Понравилось $likes $result")
}