package com.alexandrestefani.special_classes

class Exercise4Singleton {
}
//Pegue uma instância do singleton que criamos anteriormente
//Use o método setCurrentDay e altere o dia da semana para segunda-feira
//Chame o método isWeekend e confira se ele está retornando falso
//Pegue uma nova instância do singleton, e usando setCurrentDay altere o dia atual para domingo
//Chame o método isWeekend e confira se agora ele está retornando verdadeiro

fun main() {
    UtilityHelper.sayCurrentDay()
    UtilityHelper.setCurrentDay(DayOfWeek.TUESDAY)
    UtilityHelper.sayCurrentDay()
    println("Is weekend? ${UtilityHelper.isWeekend()}")
    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    UtilityHelper.sayCurrentDay()
    println("Is weekend? ${UtilityHelper.isWeekend()}") //A alteração promovida pela outra instância não interfere no resultado dessa instância. É como se cada instancia acessase de maneira independente e isolada o objeto.

}