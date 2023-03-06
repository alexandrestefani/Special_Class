package com.alexandrestefani.special_classes

class Extension {
}
//Crie uma função de extensão para o tipo primitivo String, que transforma a string em uma lista de strings, composta por todas as letras da mesma.
//Crie uma string e utilizando a extensão criada imprima todas as letras da string

fun String.spelling(){
    for (i in 0..this.length-1){
        var ref = this.get(i)
        println(ref)
    }

}

fun main() {
    var word = "abacate"
    word.spelling()
}