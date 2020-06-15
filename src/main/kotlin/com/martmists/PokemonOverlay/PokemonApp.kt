package com.martmists.PokemonOverlay

import javafx.scene.input.KeyCode
import javafx.scene.input.KeyCodeCombination
import javafx.stage.Stage
import tornadofx.*

class PokemonApp : App(PokemonView::class, PokemonStyle::class) {
    init {
        reloadStylesheetsOnFocus()
        FX.layoutDebuggerShortcut = KeyCodeCombination(KeyCode.getKeyCode("J"))
    }

    override fun start(stage: Stage) {
        if (parameters.named["json-file"] != null) {
            PokemonView.readJsonPath = parameters.named["json-file"]
        } else if (parameters.unnamed.size == 2) {
            if (parameters.unnamed[0] == "--json-file") {
                PokemonView.readJsonPath = parameters.unnamed[1]
            }
        }
        super.start(stage)
    }
}