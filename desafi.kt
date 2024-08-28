fun main() {
    var precoCoxinha = 5.00
    var qtdCoxinha = 3
    var precoCerveja = 15.00
    var qtdCerveja = 2

    var totalCoxinhas = precoCoxinha * qtdCoxinha
    var totalCervejas = precoCerveja * qtdCerveja

    var somatoria = totalCervejas + totalCoxinhas

    val taxa = 0.10

    var taxaFinal = somatoria * taxa
    val total = somatoria + taxaFinal

    println("---------------------")
    println("Console")
    println("---------------------")
    println(".: Lanchonete Leo :.")
    println("---------------------")
    println("3 Coxinhas --- R$ $totalCoxinhas")
    println("2 Cervejas --- R$ $totalCervejas")
    println("Somatoria  --- R$ $somatoria")
    println("Taxa 10%   --- R$ $taxaFinal")
    println("---------------------")
    println("Conta Final -- R$ $total")
}
