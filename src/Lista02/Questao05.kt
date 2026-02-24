package Lista02

/*
* A minha sobrinha está aprendendo as letras
* do alfabeto. Ela ainda confunde o que é vogal
* e consoante. Você topou fazer comigo um programa
* que verifica se uma letra é vogal ou consoante.
* Então, é isso, né? Vamos lá?
*/

fun main(){
    println("Qual a sua letra? ")
    val letra = readln()

    if (letra in "aeiou"){
        println("A letra '$letra' é uma vogal")
    }else{
        println("A letra '$letra' é uma consoante")
    }
}