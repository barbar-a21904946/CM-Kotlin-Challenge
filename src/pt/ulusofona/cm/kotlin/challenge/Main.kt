package pt.ulusofona.cm.kotlin.challenge
import com.example.appname.util.PersonA

fun main(){
    var pessoa1 = models.Pessoa("joão", HashMap<String,models.Veiculo>() ,models.Data("01","02","22"),models.Carta(),models.Posicao(1,1))
    var carro1 = models.Carro("carrinho1",models.Posicao(1,2),models.Data("13","02","2001"),models.Motor(170,1400,false))
    var carro2 = models.Carro("carrinho2",models.Posicao(1,2),models.Data("08","03","2019"),models.Motor(170,1400,false))
    pessoa1.comprarVeiculo(carro1)
    pessoa1.comprarVeiculo(carro2)

    pessoa1.comprarVeiculo(carro1)
    pessoa1.comprarVeiculo(carro2)
    pessoa1.comprarVeiculo(carro1)
    pessoa1.comprarVeiculo(carro2)

    var motor = models.Motor(321,2900,false)
    println(motor)
    var bicicleta = models.Bicicleta("bicicleta",models.Posicao(2,3), models.Data("09","02","22"))

    for (v in pessoa1.veiculos.values){
        println(v)
    }




}