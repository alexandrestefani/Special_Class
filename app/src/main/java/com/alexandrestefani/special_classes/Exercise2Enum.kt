package com.alexandrestefani.special_classes
//Crie um enum DayOfWeek que contém todos os dias da semana
//Associe cada valor do enum a uma string, que deverá conter o dia da semana.


enum class DayOfWeek (val trascription:String) {
    MONDAY("monday"),
    TUESDAY("tuesday"),
    WEDNESDAY("wednesday"),
    THURSDAY("thursday"),
    FRIDAY("friday"),
    SATURDAY("saturday"),
    SUNDAY("sunday");
}

fun main() {
    val segunda = DayOfWeek.MONDAY
    println(segunda.trascription)

}