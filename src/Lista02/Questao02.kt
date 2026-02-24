package Lista02

/*
* Você agora quer fazer um programa apenas
* para exercitar a sua lógica. Basicamente,
* você viu que o IBGE faz uma consulta de 5
* preços para ver a média de preços.
* Você resolveu fazer o seguinte: ler os valores,
* calcular a média e verificar quais valores estão
* acima da média.
* */

fun main (){
    val preco = mutableListOf<Double>()
    var soma: Double = 0.0

    for (i in 1..5){
        println("Qual o preço do produto no mercado ${i}? ")
        val valor = readln().toDouble()
        preco.add(valor)

    }

    val media = preco.average()
    println("O preço médio do produto é de R$$media")
    println("Produtos acima da média: ")

    for ((i , preco) in preco.withIndex()){
        if (preco > media)
            println("O produto ${i + 1} (R$$preco) está acima da média")
    }
}