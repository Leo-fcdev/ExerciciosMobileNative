package Lista04

/*
* Achar uma agulha em um palheiro não é uma
* tarefa fácil. Achar algo que se procura
* dentro de uma coleção de dados não é simples.
* Por isso, nós queremos que você procure o nome
* de uma pessoa dentro de uma lista de nomes.
* Você deve primeiro ler 10 nomes. Depois,
* você pode dar a oportunidade de uma pessoa
* procurar algum nome dentro dessa coleção.
* Se o nome existir, você deve dizer a posição
* do nome, se ele não existir, você deve retornar -1.
*/

fun main(){
    val nomes = mutableListOf<String>()

    for (i in 0.. 2){
        println("Digite um nome: ")
        val nome = readln()

        nomes.add(nome)
    }

    println("Qual nome deseja procurar? ")
    val procuraNome = readln()

    if (nomes.contains(procuraNome)){
        val i = nomes.indexOf(procuraNome)
        println("O nome $procuraNome e a posição é $i")
    }else{
        println(-1)
    }
}