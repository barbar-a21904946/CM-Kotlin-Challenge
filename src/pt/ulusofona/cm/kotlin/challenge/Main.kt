package pt.ulusofona.cm.kotlin.challenge
import pt.ulusofona.cm.kotlin.challenge.models.*
import java.text.SimpleDateFormat
import java.util.logging.SimpleFormatter

fun main(){
    //pequenos  exemplos de testes implementados
    val f = SimpleDateFormat("dd-MM-yyyy")

    var motor = Motor(1000,500)
    val bicicleta = Bicicleta("Bicla")
    var carro = Carro("KIT",motor)
    var pessoa1 : Pessoa = Pessoa("Joana", f.parse("19-02-2001"))
    var pessoa2 : Pessoa = Pessoa("Raquel", f.parse("15-11-2010"))





    //inserir elementos
    pessoa2.comprarVeiculo(carro)
    pessoa2.tirarCarta()
    pessoa2.moverVeiculoPara("KIT",1,4)
    pessoa2.moverVeiculoPara("KIT",1,4)



}