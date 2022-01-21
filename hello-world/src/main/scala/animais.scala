object animaiss {
    abstract class Animal(val nome: String) {
        def fazerBarulho: String
    }

    class Cachorro(nome: String) extends Animal(nome){
        override def fazerBarulho = {
            "Au Au"
        }
    }

    class Gato(nome: String) extends Animal(nome) {
        override def fazerBarulho = {
            "Miau Miau"
        }
    }
    def main(args: Array[String]) = {
        val gato = new Gato("Garfield")
        val cachorro = new Cachorro("Pluto")
        val animais = List(gato, cachorro)

        gato.fazerBarulho
        cachorro.fazerBarulho
        animais.foreach { animal =>
            animal.fazerBarulho    
        }
    }
}
