package Lista01

/*
* A sua professora de Física passou uma questão sobre
* velocidade média. Ela explicou que a velocidade média
* de um corpo, por exemplo, um carro, é calculada
* dividindo a distância percorrido (em metros)
* pela quantidade de tempo (em segundos).
* Desse modo, a velocidade = distancia / tempo.
* Você que não é besta foi logo fazendo um programa
* que calculasse a velocidade média, apenas lendo
* a distância percorrida e o tempo gastado para percorrê-lo.
* */

fun main(){
    println("Qual é a distância percorrida (em metros)?")
    val distancia = readln().toDouble()

    println("Qual o tempo gasto para percorrer essa distância (em segundos)?")
    val tempo = readln().toDouble()

    val velocidade = distancia / tempo
    println("A velocidade média é de $velocidade m/s.")
}