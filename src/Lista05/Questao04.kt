package Lista05

/*
* Crie uma função chamada calcularPrecoFinal que
* receba precoOriginal: Double e valorDesconto:
* Double. Ela deve retornar o preço subtraído do
* desconto. O parâmetro valorDesconto deve ter o
* valor padrão 0.0. Realize uma chamada não nomeada
* (posicional) passando os valores 100.0 e 15.0.
* Realize uma chamada nomeada invertendo a ordem
* dos parâmetros. Imprima ambos os resultados no console.
*/

fun main (){
    println(calcularPrecoFinal(150.0, 15.0))
    println(calcularPrecoFinal(valorDesconto = 15.0, precoOriginal = 150.0))
}

fun calcularPrecoFinal (precoOriginal: Double,valorDesconto: Double): Double{
    return precoOriginal - valorDesconto
}