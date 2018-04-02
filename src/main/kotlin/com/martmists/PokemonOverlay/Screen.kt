import javafx.scene.Node
import javafx.scene.control.Label
import javafx.scene.image.Image
import javafx.scene.image.ImageView
import tornadofx.*


class PokemonView: View() {
    val empty = Pokemon(0)

    private fun getImage(url: String): Image {
        val req = Http.get(url)

        val body = req.body()!!.byteStream()

        return Image(body)
    }

    override val root = hbox(20) {
        vbox(20) {
            pane {
                maxWidth = 200.0
                minWidth = 200.0
                maxHeight = 100.0
                minHeight = 100.0
                imageview(getImage(empty.icon)).apply {
                    scaleY = 2.0
                    scaleX = 2.0
                    layoutX = 10.0
                    layoutY = 10.0
                }
                label {
                    text = empty.nickname
                    layoutX = 64.0
                    layoutY = 12.0

                }
                imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply{
                    layoutX = 60.0
                    layoutY = 28.0
                }
                label {
                    text = empty.item
                    layoutY = 24.0
                    layoutX = 64.0
                    scaleX = 0.8
                    scaleY = 0.8
                }
                imageview(getImage(empty.ball)) {
                    layoutX = 34.0
                    layoutY = 34.0
                    scaleY = 1.0
                    scaleX = 1.0
                }
            }
            pane {
                layoutX = 200.0
                maxWidth = 200.0
                minWidth = 200.0
                maxHeight = 100.0
                minHeight = 100.0
                imageview(getImage(empty.icon)).apply {
                    scaleY = 2.0
                    scaleX = 2.0
                    layoutX = 10.0
                    layoutY = 10.0
                }
                label {
                    text = empty.nickname
                    layoutX = 64.0
                    layoutY = 12.0

                }
                imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply{
                    layoutX = 60.0
                    layoutY = 28.0
                }
                label {
                    text = empty.item
                    layoutY = 24.0
                    layoutX = 64.0
                    scaleX = 0.8
                    scaleY = 0.8
                }
                imageview(getImage(empty.ball)) {
                    layoutX = 34.0
                    layoutY = 34.0
                    scaleY = 1.0
                    scaleX = 1.0
                }
            }
        }
        vbox(20) {
            pane {
                maxWidth = 200.0
                minWidth = 200.0
                maxHeight = 100.0
                minHeight = 100.0
                imageview(getImage(empty.icon)).apply {
                    scaleY = 2.0
                    scaleX = 2.0
                    layoutX = 10.0
                    layoutY = 10.0
                }
                label {
                    text = empty.nickname
                    layoutX = 64.0
                    layoutY = 12.0

                }
                imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply{
                    layoutX = 60.0
                    layoutY = 28.0
                }
                label {
                    text = empty.item
                    layoutY = 24.0
                    layoutX = 64.0
                    scaleX = 0.8
                    scaleY = 0.8
                }
                imageview(getImage(empty.ball)) {
                    layoutX = 34.0
                    layoutY = 34.0
                    scaleY = 1.0
                    scaleX = 1.0
                }
            }
            pane {
                maxWidth = 200.0
                minWidth = 200.0
                maxHeight = 100.0
                minHeight = 100.0
                imageview(getImage(empty.icon)).apply {
                    scaleY = 2.0
                    scaleX = 2.0
                    layoutX = 10.0
                    layoutY = 10.0
                }
                label {
                    text = empty.nickname
                    layoutX = 64.0
                    layoutY = 12.0

                }
                imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply{
                    layoutX = 60.0
                    layoutY = 28.0
                }
                label {
                    text = empty.item
                    layoutY = 24.0
                    layoutX = 64.0
                    scaleX = 0.8
                    scaleY = 0.8
                }
                imageview(getImage(empty.ball)) {
                    layoutX = 34.0
                    layoutY = 34.0
                    scaleY = 1.0
                    scaleX = 1.0
                }
            }
        }
        vbox(20) {
            pane {
                maxWidth = 200.0
                minWidth = 200.0
                maxHeight = 100.0
                minHeight = 100.0
                imageview(getImage(empty.icon)).apply {
                    scaleY = 2.0
                    scaleX = 2.0
                    layoutX = 10.0
                    layoutY = 10.0
                }
                label {
                    text = empty.nickname
                    layoutX = 64.0
                    layoutY = 12.0

                }
                imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply{
                    layoutX = 60.0
                    layoutY = 28.0
                }
                label {
                    text = empty.item
                    layoutY = 24.0
                    layoutX = 64.0
                    scaleX = 0.8
                    scaleY = 0.8
                }
                imageview(getImage(empty.ball)) {
                    layoutX = 34.0
                    layoutY = 34.0
                    scaleY = 1.0
                    scaleX = 1.0
                }
            }
            pane {
                maxWidth = 200.0
                minWidth = 200.0
                maxHeight = 100.0
                minHeight = 100.0
                imageview(getImage(empty.icon)).apply {
                    scaleY = 2.0
                    scaleX = 2.0
                    layoutX = 10.0
                    layoutY = 10.0
                }
                label {
                    text = empty.nickname
                    layoutX = 64.0
                    layoutY = 12.0

                }
                imageview(getImage("http://via.placeholder.com/24x24/f4f4f4/f4f4f4")).apply{
                    layoutX = 60.0
                    layoutY = 28.0
                }
                label {
                    text = empty.item
                    layoutY = 24.0
                    layoutX = 64.0
                    scaleX = 0.8
                    scaleY = 0.8
                }
                imageview(getImage(empty.ball)) {
                    layoutX = 34.0
                    layoutY = 34.0
                    scaleY = 1.0
                    scaleX = 1.0
                }
            }
        }
    }

    val panes = mutableListOf<Node>()
    val pokes = mutableListOf<Pokemon>()

    init {
        root.getChildList()!!.forEach {
            it.getChildList()!!.forEach {
                panes.add(it)
            }
        }

        setPokemon(0, Pokemon(493).apply {
            setPBall("Poke Ball")
            setPLevel(5)
        })
    }

    private fun update() {
        pokes.forEachIndexed { i, pokemon ->
            val children = panes[i].getChildList()!!

            val pokeicon = children[0] as ImageView
            val ballicon = children[4] as ImageView
            val itemicon = children[2] as ImageView
            val nickname = children[1] as Label
            val itemname = children[3] as Label

            pokeicon.image = getImage(pokemon.icon)
            ballicon.image = getImage(pokemon.ball)
            nickname.text = "${pokemon.nickname} Lv.${pokemon.level}"
            itemname.text = pokemon.item

            itemicon.image = getImage(if (empty.item == "") "http://via.placeholder.com/24x24/f4f4f4/f4f4f4" else "https://cdn.bulbagarden.net/upload/d/d6/Held_icon_VII.png")
        }
    }

    fun setPokemon(pos: Int, pokemon: Pokemon){
        try { pokes.removeAt(pos) } catch(e: Exception) { }
        pokes.add(pos, pokemon)
        update()
    }

    fun removePokemon(pos: Int){
        pokes.removeAt(pos)
        pokes.add(pos, empty)
        update()
    }
}

class PokemonOverlayCore: App(PokemonView::class, PokemonStyle::class){
    init {
        reloadStylesheetsOnFocus()
    }
}