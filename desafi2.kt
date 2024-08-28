// Calculando o IMC

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    var sair: Char

    do {
        coletarDados()
        println("Tecle [c] para continuar ou [s] para sair: ")
        sair = scanner.next()[0]
    } while (sair != 's')
}

fun coletarDados() {
    val scanner = Scanner(System.`in`)
    var peso: Float
    var altura: Float

    println("Digite o seu peso: ")
    peso = scanner.nextFloat()

    println("Digite a sua altura: ")
    altura = scanner.nextFloat()

    val imc = peso / (altura * altura)

    val categoria = when {
        imc < 18.5 -> "Excesso de Magreza"
        imc < 25 -> "Peso Normal"
        imc < 30 -> "Excesso de Peso"
        imc < 35 -> "Obesidade - Grau I"
        imc < 40 -> "Obesidade - Grau II"
        else -> "Obesidade - Grau III"
    }

    println("Seu IMC é: %.2f".format(imc))
    println("Categoria: $categoria")
}
