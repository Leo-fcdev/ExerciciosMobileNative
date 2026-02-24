package Lista01

/*
* Você saiu com seus amigos para ir ao cinema.
* Depois de assistirem o filme, vocês foram para
* um restaurante comemorar o aniversário de sua amiga,
* Alice. Na hora de pagar a conta, como sempre,
* foi aquele furdunço, divide daqui, divide dali.
* Então, você pensou: vou fazer um programa para
* calcular a conta por pessoa em um aniversário.
* Claro que a aniversariante não conta. Deste modo,
* você faria um programa que lesse o total da conta,
* divide-a pelo número de pessoas na mesa, menos o
* aniversariante. Depois, você só precisa exibir
* quanto cada um tem que pagar.
* */

fun main(){
    println("Qual é o total de pessoas? ")
    val pessoas = readln().toInt()

    println("Qual o total da conta? ")
    val conta = readln().toDouble()

    val totalConta = conta / (pessoas - 1)

    println("O total da conta é de R$$totalConta por pessoas")

}