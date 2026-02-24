package Lista02

/*
*Em um jogo de tabuleiro, um jogador pode
*movimentar uma peça apenas se o número do
*seu dado for maior que o do seu adversário.
*Faça um programa que informe se o jogador
*pode ou não jogar aquela partida.
*Leia o número do dado do jogador e do seu
*adversário e informe quem deve jogar.
*No caso de empate, nenhum dos jogadores joga.
*/

import kotlin.random.Random

fun main(){
    val dado1 = Random.nextInt(1,7)
    val dado2 = Random.nextInt(1,7)

    println("O jogador 1 rolou um $dado1")
    println("O jogador 2 rolou um $dado2")

    when {
        dado1 > dado2 -> println("Vez do jogador 1, ande $dado1 casas")
        dado1 < dado2 -> println("Vez do jogador 2, ande $dado2 casas")
        else -> println("Empate")
    }
}