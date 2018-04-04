import org.json.JSONObject
import java.io.File

val pokemonDB = JSONObject(File("out.json").readText())
val ballsDB = JSONObject(File("balls.json").readText())
val typesDB = JSONObject(File("types.json").readText())


class Pokemon(id: Any) {
    var level = 1
    var name = ""
    var nickname = ""
    var icon = ""
    var dexno = ""
    var types = mutableListOf<String>()
    var ball = ""
    var item = ""

    init {
        if (id != 0) {
            dexno = id.toString().padStart(3, '0')

            val json = pokemonDB.getJSONObject(dexno)

            dexno = json.getString("dexno")

            for (type in json.getJSONArray("types")) {
                types.add(typesDB.getString(type.toString()))
            }

            if (types.size == 1){
                types.add("http://via.placeholder.com/1x1/f4f4f4/f4f4f4")
            }

            name = json.getString("name")
            nickname = name
            icon = json.getString("url")
        } else {
            icon = "http://via.placeholder.com/1x1/f4f4f4/f4f4f4"
            ball = "http://via.placeholder.com/1x1/f4f4f4/f4f4f4"
            types.add("http://via.placeholder.com/1x1/f4f4f4/f4f4f4")
            types.add("http://via.placeholder.com/1x1/f4f4f4/f4f4f4")
        }
    }

    fun setPNick(name: String){
        nickname = name
    }

    fun setPLevel(level: Int){
        this.level = level
    }

    fun setPBall(ball: String){
        this.ball = ballsDB.getString(ball)
    }

    fun setPItem(name: String){
        this.item = name
    }
}


fun getAllPokemon(): Array<Pokemon>{
    val allPokemon = mutableListOf<Pokemon>()

    for (key in pokemonDB.keys()){
        allPokemon.add(Pokemon(key))
    }

    return allPokemon.toTypedArray()
}

fun getAllBalls(): List<String>{
    return ballsDB.keys().asSequence().toList()
}