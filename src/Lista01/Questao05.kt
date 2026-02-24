package Lista01

/*
* Uma loja de tintas deseja informar para os clientes
* o melhor custo-benefício na compra de suas tintas.
* Você foi contratado para desenvolver um programa
* que deverá pedir o tamanho em metros quadrados da
* área a ser pintada. Considere que a cobertura da
* tinta é de 1 litro para cada 6 metros quadrados e
* que a tinta é vendida em latas de 18 litros, que
* custam R$ 80,00 ou em galões de 3,6 litros, que
* custam R$ 25,00. Informe ao usuário as quantidades
* de tinta a serem compradas e os respectivos preços em 3 situações:
a. comprar apenas latas de 18 litros;
b. comprar apenas galões de 3,6 litros;
c. misturar latas e galões, de forma que o desperdício de
* tinta seja menor. Acrescente 10% de folga e sempre
* arredonde os valores para cima, isto é, considere latas cheias.
* */
import kotlin.math.ceil
fun main(){
    println("Qual a área em metros²? ")
    val area = readln().toDouble()

    val litrosNecessario = (area / 6) * 1.1

    val capacidadeLata = 18.0
    val precoLata =  80.0

    val capacidadeGalao = 3.6
    val precoGalao = 25.0

    val qtdLatas = ceil(litrosNecessario / capacidadeLata).toInt()
    val custoLata = qtdLatas * precoLata

    val qtdGaloes = ceil(litrosNecessario / capacidadeGalao).toInt()
    val custoGalao = qtdGaloes * precoGalao

    val mistura = ceil(litrosNecessario / capacidadeLata).toInt()

    val resto = litrosNecessario % capacidadeLata

    val restanteGalao = ceil(resto / capacidadeGalao).toInt()
    val custoMistura = (precoLata * mistura) + (precoGalao * restanteGalao)

    println("Opção 1 (apenas latas): R$$custoLata\nOpção 2 (apenas galões): " +
            "R$$custoGalao\nOpção 3 (latas e galões): R$$custoMistura")
}