import javafx.event.EventHandler
import javafx.scene.Node
import javafx.scene.control.Button
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import javafx.scene.input.MouseEvent
import javafx.scene.layout.BorderPane
import javafx.scene.layout.Pane
import tornadofx.*


class PokemonView: View() {
    val empty = Pokemon(0)

    private fun getImage(url: String): Image {
        val req = Http.get(url)

        val body = req.body()!!.byteStream()

        return Image(body)
    }

    override val root = hbox(5) {
        addClass(PokemonStyle.App)
        vbox(5) {
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
                            layoutY = 12.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply {
                            layoutX = 60.0
                            layoutY = 28.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 64.0
                            layoutY = 24.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        button {
                            layoutX = 190.0
                            text = "X"
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
                            layoutY = 12.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply {
                            layoutX = 60.0
                            layoutY = 28.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 64.0
                            layoutY = 24.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        button {
                            layoutX = 190.0
                            text = "X"
                        }
                    }
                }
            }
        }
        vbox(5) {
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
                            layoutY = 12.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply {
                            layoutX = 60.0
                            layoutY = 28.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 64.0
                            layoutY = 24.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        button {
                            layoutX = 190.0
                            text = "X"
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
                            layoutY = 12.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply {
                            layoutX = 60.0
                            layoutY = 28.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 64.0
                            layoutY = 24.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        button {
                            layoutX = 190.0
                            text = "X"
                        }
                    }
                }
            }
        }
        vbox(5) {
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
                            layoutY = 12.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply {
                            layoutX = 60.0
                            layoutY = 28.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 64.0
                            layoutY = 24.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        button {
                            layoutX = 190.0
                            text = "X"
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
                            layoutY = 12.0
                            addClass(PokemonStyle.Nickname)
                        }
                        imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply {
                            layoutX = 60.0
                            layoutY = 28.0
                            addClass(PokemonStyle.ItemIcon)
                        }
                        label {
                            text = empty.item
                            layoutX = 64.0
                            layoutY = 24.0
                            addClass(PokemonStyle.ItemName)
                        }
                        imageview(getImage(empty.ball)) {
                            layoutX = 34.0
                            layoutY = 34.0
                            addClass(PokemonStyle.PokeBall)
                        }
                        button {
                            layoutX = 190.0
                            text = "X"
                        }
                    }
                }
            }
        }
    }

    val panes = mutableListOf<BorderPane>()
    val pokes = mutableListOf(empty, empty, empty, empty, empty, empty)

    init {
        root.getChildList()!!.forEachIndexed { i, vbox ->
            vbox.getChildList()!!.forEachIndexed { j, it ->
                it.addClass("row${j+1}")
                it as BorderPane
                it.center.getChildList()!![5].onMouseClicked = EventHandler<MouseEvent>{ _ -> removePokemon(i*2+j) }
                panes.add(it)
            }
        }

        setPokemon(0, Pokemon(493).apply {
            setPBall("Poke Ball")
            setPLevel(5)
        })
        setPokemon(1, Pokemon(384).apply {
            setPBall("Love Ball")
            setPLevel(100)
            setPNick("Ponty")
            setPItem("Oran Berry")
        })
    }

    private fun update() {
        pokes.forEachIndexed { i, pokemon ->
            val pane = panes[i]
            val children = pane.center.getChildList()!!

            val pokeicon = children[0] as ImageView
            val ballicon = children[4] as ImageView
            val itemicon = children[2] as ImageView
            val nickname = children[1] as Label
            val itemname = children[3] as Label
            val buttonX = children[5] as Button

            pokeicon.image = getImage(pokemon.icon)
            ballicon.image = getImage(pokemon.ball)
            nickname.text = if (pokemon.nickname != "") "${pokemon.nickname} Lv.${pokemon.level}" else ""
            itemname.text = pokemon.item

            itemicon.image = getImage(if (pokemon.item == "") "http://via.placeholder.com/24x24/f4f4f4/f4f4f4" else "https://cdn.bulbagarden.net/upload/d/d6/Held_icon_VII.png")

            buttonX.isVisible = (pokemon.nickname != "")
        }
    }

    fun setPokemon(pos: Int, pokemon: Pokemon){
        try { pokes.removeAt(pos) } catch(e: Exception) { }
        pokes.add(pos, pokemon)
        update()
    }

    fun removePokemon(pos: Int){
        pokes.removeAt(pos)
        pokes.add(empty)
        update()
    }
}

class PokemonOverlayCore: App(PokemonView::class, PokemonStyle::class){
    init {
        reloadStylesheetsOnFocus()
    }
}