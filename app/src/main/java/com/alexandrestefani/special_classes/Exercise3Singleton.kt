package com.alexandrestefani.special_classes
//Crie um singleton chamado UtilityHelper
//Crie uma propriedade privada do tipo do enum criado na atividade anterior chamada currentDay
//Inicialize o valor de currentDay com SUNDAY
//Crie um método setCurrentDay, que altera o valor da propriedade currentDay
//Crie um método isWeekend que retorna verdadeiro quando o valor de currentDay é sábado ou domingo

object UtilityHelper{
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun setCurrentDay(newCurrentDay: DayOfWeek){
        this.currentDay = newCurrentDay
    }
    fun sayCurrentDay() = println(currentDay)

    fun isWeekend(): Boolean = (currentDay == DayOfWeek.SUNDAY )||(currentDay == DayOfWeek.SATURDAY)
}

fun main() {
    UtilityHelper.sayCurrentDay()
    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    UtilityHelper.sayCurrentDay()
    println("Is weekend? ${UtilityHelper.isWeekend()}")
}