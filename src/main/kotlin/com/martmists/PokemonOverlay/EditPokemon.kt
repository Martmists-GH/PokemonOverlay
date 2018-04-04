package com.martmists.PokemonOverlay

import javafx.beans.property.SimpleStringProperty
import tornadofx.*

class EditPokemon(private val pos: Int, private val parent: View, private val pokemon: Pokemon) : View() {
    var ePokemon = SimpleStringProperty("${pokemon.name} (#${pokemon.dexno})")
    var eNickname = pokemon.nickname
    var eBall = SimpleStringProperty(getAllBalls().filter { ballsDB[it] == pokemon.ball }.first())
    var eLevel = pokemon.level.toString()
    var eItem = pokemon.item

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
                textfield(pokemon.nickname) {
                    textProperty().addListener { _, _, new ->
                        eNickname = new
                    }
                }
                addClass(PokemonStyle.EditNickname)
            }
            field("Level*") {
                textfield(pokemon.level.toString()) {
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
                textfield(pokemon.item) {
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