import tornadofx.*

class PokemonStyle: Stylesheet() {
    companion object {
        val imageview by cssclass()
    }

    init {
        imageview {
            borderRadius += box(50.px)
        }
    }
}