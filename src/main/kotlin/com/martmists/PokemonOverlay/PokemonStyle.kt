package com.martmists.PokemonOverlay

import javafx.scene.layout.BorderStrokeStyle
import javafx.scene.paint.Color
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

        val Type1 by cssclass()
        val Type2 by cssclass()

        val XButton by cssclass()
        val PlusButton by cssclass()
        val LevelPlusButton by cssclass()
        val LevelMinusButton by cssclass()
        val EditButton by cssclass()

        val EditApp by cssclass()
        val EditPokemon by cssclass()
        val EditNickname by cssclass()
        val EditLevel by cssclass()
        val EditBall by cssclass()
        val EditItem by cssclass()
        val EditSave by cssclass()
    }

    init {
        App {
            prefHeight = 205.px
            prefWidth = 1305.px
            padding = box(40.px)
            // backgroundColor += Color.RED
        }

        Column {
            prefWidth = 405.px
            // backgroundColor += Color.BLUE
        }

        Pokemon {
            prefWidth = 305.px
            prefHeight = 60.px
            // backgroundColor += Color.WHITE
        }

        Inner {
            borderStyle += BorderStrokeStyle.SOLID
            borderWidth += box(2.px)
            borderRadius += box(40.px)
            // backgroundColor += Color.GREEN
        }

        PokemonIcon {
            scaleX = 1.75
            scaleY = 1.75
        }

        ItemName {
            scaleX = 0.8
            scaleY = 0.8
        }

        row1 {
            padding = box(0.px, 100.px, 0.px, 0.px)
        }

        row2 {
            padding = box(0.px, 0.px, 0.px, 100.px)
        }

        s(XButton, PlusButton, EditButton) {
            scaleX = 0.75
            scaleY = 0.75
        }

        XButton {
            baseColor = Color.RED
        }

        PlusButton {
            baseColor = Color.GREEN
        }

        s(EditApp, EditPokemon, EditNickname, EditLevel, EditBall, EditItem, EditSave) {
            prefWidth = 360.px
        }

        s(button, comboBox) {
            backgroundRadius += box(15.px)
        }

        comboBox {
            prefWidth = 255.px
        }
    }
}