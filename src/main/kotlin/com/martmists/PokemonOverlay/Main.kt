package com.martmists.PokemonOverlay

import javafx.application.Application

fun main(args: Array<String>) {
    val screen = PokemonApp()

    Application.launch(screen::class.java, *args)
}