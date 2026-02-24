package Lista01

/*
* O IBGE (Instituto Brasileiro de Geografia e Estatística)
* para definir um preço médio de um produto alimentar,
* por exemplo: o feijão, faz consulta a pelo menos 5 mercados
* de tamanhos variados. Após ler os valores dos 5 mercados,
* o instituto calcula o valor médio do produto.
* Diferente do que era praticado antes, atualmente, o
* IBGE utiliza um pequeno sistema para computar o preço médio.
* Você está trabalhando na equipe de TI do IBGE para calcular
* o preço médio dos produtos. Lembre-se de ler os cinco preços,
* calcular a média e exibir o resultado.
* */

fun main(){
    var soma: Double = 0.0

    for (i in 0..4){
        println("Qual o preço do produto no mercado ${i + 1}? ")
        val preco = readln().toDouble()

        soma += preco
    }

    val media: Double = soma / 5
    println("O preço médio do produto é de R$$media")
}