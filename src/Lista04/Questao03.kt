package Lista04

/*
*O Banco Central do Brasil (BACEN)
* é a instituição responsável pelo
* controle monetário do real brasileiro.
* Um dos fatores que o BACEN monitora é
* a variação do valor de moedas estrangeiras
* no mercado brasileiro. O preço do dólar é
* um deles. Nós vamos fazer um monitoramento
* simples do preço do dólar. Você deve criar
* um programa que leia 5 preços do dólar em
* casas de câmbio distintas. Após ler os valores,
* você deve calcular o valor médio da moeda no mercado.
*/

fun main(){
    val precoDolar = mutableListOf<Double>()
    var soma = 0.0
    for (i in 0 .. 4){
        println("Qual o preço do dolar na ${i + 1}º casa de câmbio?")
        val valor = readln().toDouble()
        precoDolar.add(valor)
    }


    val media = precoDolar.average()

    println("A media do dolar é de R$ %.2f".format(media))
}
