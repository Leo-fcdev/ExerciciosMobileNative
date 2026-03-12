package Lista04

/*
* O menor preço garantido é o que queremos.
* Nós procuramos em vários sites de compras
* o mesmo produto a fim de poupar o máximo
* possível. Você basicamente deve escrever
* um programa que leia 5 entradas de preços
* de um mesmo produto e informe qual o menor
* preço encontrado entre eles e o seu índice.
* */

fun main(){

    val precos = mutableListOf<Double>()

    for (i in 0 .. 4){
        println("Digite o ${i + 1}º preço:")
        val valor = readln().toDouble()

        precos.add(valor)
    }
    println("=== Menores preços encontrados ===")

    val menorValor = precos.minOrNull()

    for ((i, valor) in precos.withIndex()){
        if (valor == menorValor){
            println("O menor valor encontrado foi $menorValor e ele foi o ${i + 1}º valor inserido")
        }
    }


}
