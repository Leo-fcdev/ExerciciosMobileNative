package Lista02

/*
* Um baralho contém 52 cartas de 4 tipos
*(naipes) diferentes: paus, espadas, copas
*e ouro. Em cada naipe, que consiste de 13
*cartas, 3 dessas cartas contêm as figuras
*do rei, da dama e do valete, respectivamente.
*Faça um programa que leia um número de 1 a 13
*e informe qual carta o número representa por
*extenso. Lembrando que temos algumas cartas
*especiais: 1 (Ás), 11 (Valete), 12 (Rainha), 13 (Rei).
*/

fun main(){
    println("Qual o número da sua carta?")
    val numero = readln().toInt()

    when{
        numero == 1 -> println("Sua carta é um ás")
        numero == 2 -> println("Sua carta é um dois")
        numero == 3 -> println("Sua carta é um três")
        numero == 4 -> println("Sua carta é um quatro")
        numero == 5 -> println("Sua carta é um cinco")
        numero == 6 -> println("Sua carta é um seis")
        numero == 7 -> println("Sua carta é um sete")
        numero == 8 -> println("Sua carta é um oito")
        numero == 9 -> println("Sua carta é um nove")
        numero == 10 -> println("Sua carta é um dez")
        numero == 11 -> println("Sua carta é um valete")
        numero == 12 -> println("Sua carta é uma rainha")
        numero == 13 -> println("Sua carta é um rei")
    }
}

