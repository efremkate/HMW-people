package ru.netology

fun main() {
    val likes = 1000
    val naming1 = "человеку"
    val naming2 = "людям"

    val result = if (likes % 10 != 1) naming2 else naming1

    println("Понравилось $likes $result")
}