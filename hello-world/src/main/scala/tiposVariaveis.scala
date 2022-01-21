object tiposVar {
    def main(args: Array[String]) = {
        val numero = 1
        val numeroComTipo: Int = 5
        val texto = "lucas"

        println(numero.getClass())
        println(numeroComTipo.getClass())
        println(texto.getClass())
    }
}