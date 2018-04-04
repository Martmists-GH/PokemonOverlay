package com.martmists.PokemonOverlay

import javafx.scene.input.KeyCode
import javafx.scene.input.KeyCodeCombination
import tornadofx.*

class PokemonApp : App(PokemonView::class, PokemonStyle::class) {
    init {
        reloadStylesheetsOnFocus()
        FX.layoutDebuggerShortcut = KeyCodeCombination(KeyCode.getKeyCode("J"))
    }
}