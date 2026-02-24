package Lista01
/*
* O Bar do Boca é um bar conhecido na sua cidade.
* Todas as sextas-feiras, o bar tem música ao vivo
* e um novo cardápio a cada mês. O dono do bar, Boca,
* não sabe mais o que fazer com as contas que são
* fechadas erradas, pois os garçons esquecem de adicionar
* a taxa de couvert ou esquecem que a gorjeta sai de 10%
* para 20%. Você que conhece o Boca há muito tempo resolveu ajudá-lo.
* Você vai fazer um programa que ler o total da conta e acrescenta 20% da
* gorjeta e a taxa fixa do couvert.
* */
fun main() {
    println("Qual o valor da conta? ")
    val conta = readln().toDouble()

    println("Qual o valor fixo do couvert? ")
    val couvert = readln().toDouble()

    val gorjeta = 1.20

    val totalConta = conta * gorjeta + couvert

    println("O valor total da conta é de R$$totalConta")
}