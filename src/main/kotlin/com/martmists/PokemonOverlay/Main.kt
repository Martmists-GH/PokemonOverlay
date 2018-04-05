package com.martmists.PokemonOverlay

import javafx.application.Application
import kotlin.system.exitProcess

fun main(args: Array<String>) {
    try {
        assert(System.getProperty("java.version").startsWith("1.8"))
    } catch (e: AssertionError) {
        println("Invalid java version, use JRE 8 instead!")
        exitProcess(1)
    }

    val screen = PokemonApp()

    Application.launch(screen::class.java, *args)
}