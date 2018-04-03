import javafx.application.Application

fun main(args: Array<String>) {
    val screen = PokemonOverlayCore()

    Application.launch(screen::class.java, *args)
}