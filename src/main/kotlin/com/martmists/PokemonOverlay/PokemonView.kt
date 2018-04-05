package com.martmists.PokemonOverlay

import javafx.event.EventHandler
import javafx.event.ActionEvent
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.layout.BorderPane
import tornadofx.*

class PokemonView : View() {
    private val empty = Pokemon(0)
    private val cache = mutableMapOf<String, Image>()
    private val placeholder = getImage("http://via.placeholder.com/0x0/f4f4f4/f4f4f4")

    private fun getImage(url: String): Image {
        if (cache.containsKey(url)) {
            return cache.getValue(url)
        } else {
            val img = Image(Http.get(url).body()!!.byteStream())
            cache[url] = img
            return img
        }
    }

    override val root = hbox(5) {
        addClass(PokemonStyle.App)
        vbox(15) {
            addClass(PokemonStyle.Column)
            borderpane {
                addClass(PokemonStyle.Pokemon)

                center {
                    pane {
                        addClass(PokemonStyle.Inner)
                        imageview(getImage(empty.icon)).apply {
                            layoutX = 10.0
                            layoutY = 10.0
                            addClass(PokemonStyle.PokemonIcon)
                        }
                        label {
                            text = empty.nickname
                            layoutX = 64.0
                            layoutY = 5.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview().apply {
                            layoutX = 65.0
                            layoutY = 40.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 67.0
                            layoutY = 37.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        imageview(placeholder).apply {
                            layoutX = 64.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type1)
                        }
                        imageview(placeholder).apply {
                            layoutX = 114.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type2)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "X"
                            addClass(PokemonStyle.XButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "+"
                            addClass(PokemonStyle.PlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 3.0
                            text = "+"
                            addClass(PokemonStyle.LevelPlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 30.0
                            text = "-"
                            addClass(PokemonStyle.LevelMinusButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 26.0
                            text = "\u270e"
                            addClass(PokemonStyle.EditButton)
                        }
                    }
                }
            }
            borderpane {
                addClass(PokemonStyle.Pokemon)

                center {
                    pane {
                        addClass(PokemonStyle.Inner)
                        imageview(getImage(empty.icon)).apply {
                            layoutX = 10.0
                            layoutY = 10.0
                            addClass(PokemonStyle.PokemonIcon)
                        }
                        label {
                            text = empty.nickname
                            layoutX = 64.0
                            layoutY = 5.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview().apply {
                            layoutX = 65.0
                            layoutY = 40.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 67.0
                            layoutY = 37.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        imageview(placeholder).apply {
                            layoutX = 64.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type1)
                        }
                        imageview(placeholder).apply {
                            layoutX = 114.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type2)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "X"
                            addClass(PokemonStyle.XButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "+"
                            addClass(PokemonStyle.PlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 3.0
                            text = "+"
                            addClass(PokemonStyle.LevelPlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 30.0
                            text = "-"
                            addClass(PokemonStyle.LevelMinusButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 26.0
                            text = "\u270e"
                            addClass(PokemonStyle.EditButton)
                        }
                    }
                }
            }
        }
        vbox(15) {
            addClass(PokemonStyle.Column)
            borderpane {
                addClass(PokemonStyle.Pokemon)

                center {
                    pane {
                        addClass(PokemonStyle.Inner)
                        imageview(getImage(empty.icon)).apply {
                            layoutX = 10.0
                            layoutY = 10.0
                            addClass(PokemonStyle.PokemonIcon)
                        }
                        label {
                            text = empty.nickname
                            layoutX = 64.0
                            layoutY = 5.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview().apply {
                            layoutX = 65.0
                            layoutY = 40.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 67.0
                            layoutY = 37.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        imageview(placeholder).apply {
                            layoutX = 64.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type1)
                        }
                        imageview(placeholder).apply {
                            layoutX = 114.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type2)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "X"
                            addClass(PokemonStyle.XButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "+"
                            addClass(PokemonStyle.PlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 3.0
                            text = "+"
                            addClass(PokemonStyle.LevelPlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 30.0
                            text = "-"
                            addClass(PokemonStyle.LevelMinusButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 26.0
                            text = "\u270e"
                            addClass(PokemonStyle.EditButton)
                        }
                    }
                }
            }
            borderpane {
                addClass(PokemonStyle.Pokemon)

                center {
                    pane {
                        addClass(PokemonStyle.Inner)
                        imageview(getImage(empty.icon)).apply {
                            layoutX = 10.0
                            layoutY = 10.0
                            addClass(PokemonStyle.PokemonIcon)
                        }
                        label {
                            text = empty.nickname
                            layoutX = 64.0
                            layoutY = 5.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview().apply {
                            layoutX = 65.0
                            layoutY = 40.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 67.0
                            layoutY = 37.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        imageview(placeholder).apply {
                            layoutX = 64.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type1)
                        }
                        imageview(placeholder).apply {
                            layoutX = 114.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type2)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "X"
                            addClass(PokemonStyle.XButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "+"
                            addClass(PokemonStyle.PlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 3.0
                            text = "+"
                            addClass(PokemonStyle.LevelPlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 30.0
                            text = "-"
                            addClass(PokemonStyle.LevelMinusButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 26.0
                            text = "\u270e"
                            addClass(PokemonStyle.EditButton)
                        }
                    }
                }
            }
        }
        vbox(15) {
            addClass(PokemonStyle.Column)
            borderpane {
                addClass(PokemonStyle.Pokemon)

                center {
                    pane {
                        addClass(PokemonStyle.Inner)
                        imageview(getImage(empty.icon)).apply {
                            layoutX = 10.0
                            layoutY = 10.0
                            addClass(PokemonStyle.PokemonIcon)
                        }
                        label {
                            text = empty.nickname
                            layoutX = 64.0
                            layoutY = 5.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview().apply {
                            layoutX = 65.0
                            layoutY = 40.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 67.0
                            layoutY = 37.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        imageview(placeholder).apply {
                            layoutX = 64.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type1)
                        }
                        imageview(placeholder).apply {
                            layoutX = 114.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type2)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "X"
                            addClass(PokemonStyle.XButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "+"
                            addClass(PokemonStyle.PlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 3.0
                            text = "+"
                            addClass(PokemonStyle.LevelPlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 30.0
                            text = "-"
                            addClass(PokemonStyle.LevelMinusButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 26.0
                            text = "\u270e"
                            addClass(PokemonStyle.EditButton)
                        }
                    }
                }
            }
            borderpane {
                addClass(PokemonStyle.Pokemon)

                center {
                    pane {
                        addClass(PokemonStyle.Inner)
                        imageview(getImage(empty.icon)).apply {
                            layoutX = 10.0
                            layoutY = 10.0
                            addClass(PokemonStyle.PokemonIcon)
                        }
                        label {
                            text = empty.nickname
                            layoutX = 64.0
                            layoutY = 5.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview().apply {
                            layoutX = 65.0
                            layoutY = 40.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 67.0
                            layoutY = 37.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        imageview(placeholder).apply {
                            layoutX = 64.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type1)
                        }
                        imageview(placeholder).apply {
                            layoutX = 114.0
                            layoutY = 21.0
                            addClass(PokemonStyle.Type2)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "X"
                            addClass(PokemonStyle.XButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 6.0
                            text = "+"
                            addClass(PokemonStyle.PlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 3.0
                            text = "+"
                            addClass(PokemonStyle.LevelPlusButton)
                        }
                        button {
                            layoutX = 250.0
                            layoutY = 30.0
                            text = "-"
                            addClass(PokemonStyle.LevelMinusButton)
                        }
                        button {
                            layoutX = 275.0
                            layoutY = 26.0
                            text = "\u270e"
                            addClass(PokemonStyle.EditButton)
                        }
                    }
                }
            }
        }
    }

    private val panes = mutableListOf<BorderPane>()
    private val pokes = mutableListOf(empty, empty, empty, empty, empty, empty)

    init {
        root.getChildList()!!.forEachIndexed { i, vbox ->
            vbox.getChildList()!!.forEachIndexed { j, it ->
                it.addClass("row${j + 1}")
                it as BorderPane
                val children = it.center.getChildList()!!

                val remove = children[7] as Button
                val add = children[8] as Button
                val buttonLevelPlus = children[9] as Button
                val buttonLevelMinus = children[10] as Button
                val buttonEdit = children[11] as Button


                remove.onAction = EventHandler<ActionEvent> { _ -> removePokemon(i * 2 + j) }
                add.onAction = EventHandler<ActionEvent> { _ -> menuPokemon(i * 2 + j) }

                buttonLevelPlus.onAction = EventHandler<ActionEvent> { _ ->
                    pokes[i * 2 + j].level += 1
                    update(i * 2 + j)
                }
                buttonLevelMinus.onAction = EventHandler<ActionEvent> { _ ->
                    pokes[i * 2 + j].level -= 1
                    update(i * 2 + j)
                }
                buttonEdit.onAction = EventHandler<ActionEvent> { menuPokemon(i * 2 + j, true) }

                panes.add(it)
            }
        }

        setPokemon(0, Pokemon(493).apply {
            setPBall("Poke Ball")
            setPLevel(45)
            setPItem("Focus Sash")
        })
        setPokemon(1, Pokemon(384).apply {
            setPBall("Love Ball")
            setPLevel(100)
            setPNick("Ponty")
            setPItem("Oran Berry")
        })
        setPokemon(2, Pokemon(150).apply {
            setPBall("Master Ball")
            setPLevel(90)
            setPNick("Mew 2.0")
            setPItem("Choice Scarf")
        })
        setPokemon(3, Pokemon(717).apply {
            setPBall("Ultra Ball")
            setPLevel(75)
        })
        setPokemon(4, Pokemon("038/2").apply{
            setPBall("Friend Ball")
            setPLevel(100)
        })

        for (x in 0 until 6)
            update(x)
    }

    private fun update(i: Int) {
        val pokemon = pokes[i]
        val pane = panes[i]
        val children = pane.center.getChildList()!!

        val pokeicon = children[0] as ImageView
        val ballicon = children[4] as ImageView
        val itemicon = children[2] as ImageView
        val nickname = children[1] as Label
        val itemname = children[3] as Label

        val typeImage1 = children[5] as ImageView
        val typeImage2 = children[6] as ImageView

        val buttonX = children[7] as Button
        val buttonPlus = children[8] as Button

        val buttonLevelPlus = children[9] as Button
        val buttonLevelMinus = children[10] as Button

        val buttonEdit = children[11] as Button

        pokeicon.image = getImage(pokemon.icon)
        ballicon.image = getImage(pokemon.ball)
        nickname.text = if (pokemon.nickname != "") "${pokemon.nickname} Lv.${pokemon.level}" else ""
        itemname.text = pokemon.item

        itemicon.image = if (pokemon.item == "") placeholder else getImage("https://cdn.bulbagarden.net/upload/d/d6/Held_icon_VII.png")

        typeImage1.image = getImage(pokemon.types[0])
        typeImage2.image = getImage(pokemon.types[1])

        buttonX.isVisible = (pokemon.nickname != "")
        buttonPlus.isVisible = if (i > 0) panes.subList(0, i).filter { !it.center.getChildList()!![7].isVisible }.isEmpty() and !children[7].isVisible else pokemon == empty

        buttonLevelPlus.isVisible = buttonX.isVisible
        buttonLevelPlus.isDisable = (pokemon.level == 100)
        buttonLevelMinus.isVisible = buttonX.isVisible
        buttonLevelMinus.isDisable = (pokemon.level == 1)

        buttonEdit.isVisible = buttonX.isVisible
    }

    fun setPokemon(pos: Int, pokemon: Pokemon) {
        try {
            pokes.removeAt(pos)
        } catch (e: Exception) {
        }
        pokes.add(pos, pokemon)
        update(pos)
        if (pos < 5)
            update(pos + 1)
    }

    private fun menuPokemon(pos: Int, edit: Boolean = false) {
        val editScope = Scope()
        val model = if (edit) EditPokemon(pos, this, pokes[pos]) else AddPokemon(pos, this)
        setInScope(model, editScope)
        find(model::class, editScope).openWindow()
    }

    private fun removePokemon(pos: Int) {
        pokes.removeAt(pos)
        pokes.add(empty)
        for (i in pos until pokes.indexOfFirst { it == empty } + 2)
            if (i < 6)
                update(i)
    }
}