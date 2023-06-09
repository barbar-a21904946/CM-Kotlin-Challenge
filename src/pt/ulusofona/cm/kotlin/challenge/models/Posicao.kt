package pt.ulusofona.cm.kotlin.challenge.models

import pt.ulusofona.cm.kotlin.challenge.exceptions.AlterarPosicaoException

data class Posicao(var x: Int = 0, var y: Int = 0) {
//foi mais facil criar uma posicao em si
    fun alterarPosicaoPara(x: Int, y: Int) {
        if (this.x == x && this.y == y)
            throw AlterarPosicaoException("Já se encontra nesta posição")
        this.x = x
        this.y = y
    }

    override fun toString(): String {
        return "Posicao | x:$x | y:$y"
    }
}
