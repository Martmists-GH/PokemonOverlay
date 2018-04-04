package com.martmists.PokemonOverlay


import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class AddPokemon(private val pos: Int, private val parent: View) : View() {
    var ePokemon = SimpleStringProperty()
    var eNickname = ""
    var eBall = SimpleStringProperty()
    var eLevel = ""
    var eItem = ""

    override val root = form {
        addClass(PokemonStyle.EditApp)
        fieldset("Add Pokemon") {
            label("* = Required") {
                style {
                    fontSize = 10.px
                }
            }
            field("Pokemon*") {
                combobox(ePokemon, getAllPokemon().apply { sortBy { it.dexno } }.map { "${it.name} (#${it.dexno})" }) {
                    makeAutocompletable()
                }
                addClass(PokemonStyle.EditPokemon)
            }
            field("Nickname") {
                textfield {
                    textProperty().addListener { _, _, new ->
                        eNickname = new
                    }
                }
                addClass(PokemonStyle.EditNickname)
            }
            field("Level*") {
                textfield {
                    textProperty().addListener { _, _, new ->
                        try {
                            new.toInt()
                            eLevel = new
                        } catch (e: Exception) {
                        }
                    }
                }
                addClass(PokemonStyle.EditLevel)
            }
            field("Pokeball*") {
                combobox(eBall, getAllBalls().sorted()) {
                    makeAutocompletable()
                }
                addClass(PokemonStyle.EditBall)
            }
            field("Item") {
                textfield {
                    textProperty().addListener { _, _, new ->
                        eItem = new
                    }
                }
                addClass(PokemonStyle.EditItem)
            }

            button("Save") {
                action {
                    if (arrayOf(ePokemon.value, eBall.value).filterNotNull().isEmpty() or (eLevel == ""))
                        text = "Set all required variables first! (Save)"
                    else
                        save()
                }
                addClass(PokemonStyle.EditSave)
            }
        }
    }

    private fun save() {
        parent as PokemonView
        var dexno = ePokemon.value.split('#')[1]
        dexno = dexno.substring(0, dexno.length - 1)


        val poke = Pokemon(dexno).apply {
            setPLevel(eLevel.toInt())
            setPBall(eBall.value)
            setPItem(eItem)
            if (eNickname.isNotEmpty())
                setPNick(eNickname)
        }
        parent.setPokemon(pos, poke)
        close()
    }
}