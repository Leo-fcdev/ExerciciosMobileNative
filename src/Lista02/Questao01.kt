package Lista02
/*
* Dessa vez, lhe iludiram e disseram que iam pagar
* para você fazer um programa, mas no fundo você
* sabe que não vai receber. Você foi contratado para
* criar um programa de promoção do dia do consumidor.
* Basicamente, você vai ler o total da compra de um
* consumidor e aplicar o desconto conforme abaixo:

total compra	desconto
< 50,00		5%
< 100,00		10%
< 200,00		20%
< 500,00		25%
>= 500, 00		30%

Por fim, você deve imprimir o valor total da compra após o
desconto.
* */
fun main(){
    println("Qual o valor da compra? ")
    val conta = readln().toDouble()

    val  desconto = when {
        conta < 0 -> 0.0
        conta < 50.0 -> 0.05
        conta < 100.0 -> 0.10
        conta < 200.0 -> 0.20
        conta < 500.0 -> 0.25
        else -> 0.30
    }

    val valorDesconto = conta * desconto
    val totalConta = conta -valorDesconto

    println("O valor total da sua conta é de R$$totalConta")
}
