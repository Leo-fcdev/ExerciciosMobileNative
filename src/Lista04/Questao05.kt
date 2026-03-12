package Lista04

/*
* Colocar as coisas em ordem exige trabalho
* e dedicação, mas não só isso: existe técnica.
* Definir o que é maior, menor ou igual depende
* sempre de um critério. Neste desafio,
* você deve realizar a leitura de 10 valores
* numéricos. O seu objetivo é colocá-los em
* ordem crescente de valor. Por fim, você deve
* exibir a ordem original que os valores foram
* inseridos e depois eles ordenados.
*/


fun main(){
    val numeros = mutableListOf<Double>()

    for (i in 0..9){
        println("Digite um numero:")
        val numero = readln().toDouble()
        numeros.add(numero)
    }

    val ordenada = numeros.sorted()

    println("A lista original é $numeros")
    println("A lista ordenada é $ordenada")
}