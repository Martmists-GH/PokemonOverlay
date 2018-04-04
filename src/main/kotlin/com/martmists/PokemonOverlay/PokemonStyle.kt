import tornadofx.*

class PokemonStyle: Stylesheet() {
    companion object {
        val App by cssclass()

        val Column by cssclass()

        val Pokemon by cssclass()
        val PokemonIcon by cssclass()
        val PokeBall by cssclass()
        val ItemIcon by cssclass()
        val ItemName by cssclass()
        val Nickname by cssclass()

        val Inner by cssclass()

        val row1 by cssclass()
        val row2 by cssclass()
    }

    init {
        App {
            prefHeight = 130.px
            prefWidth = 930.px
            // backgroundColor += Color.RED
        }

        Column {
            prefWidth = 300.px
            // backgroundColor += Color.BLUE
        }

        Pokemon {
            prefWidth = 200.px
            prefHeight = 60.px
            // backgroundColor += Color.WHITE
        }

        Inner {
            // backgroundColor += Color.GREEN
        }

        PokemonIcon {
            scaleX = 1.75
            scaleY = 1.75
        }

        Nickname {
            scaleX = 1.0
            scaleY = 1.0
        }

        ItemIcon {
            scaleX = 1.0
            scaleY = 1.0
        }

        ItemName {
            scaleX = 0.8
            scaleY = 0.8
        }

        PokeBall {
            scaleY = 1.0
            scaleX = 1.0
        }

        row1 {
            padding = box(0.px, 100.px, 0.px, 0.px)
        }

        row2 {
            padding = box(0.px, 0.px, 0.px, 100.px)
        }
    }
}