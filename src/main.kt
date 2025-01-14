import java.util.*

const val alphabet: String = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

fun main() {
    println("What do you want to encode :")
    val toEncode: String = readln()
    println("How much to Shift :")
    val iShift: Int = readln().toInt()
    println("Encoded Text :")
    println(toEncode.cezarCypherEncode(iShift))

}

fun String.cezarCypherEncode(shift: Int): String {
    var encodedString = ""
    val input: String = this.uppercase()
    for(x in input){
        var LetterNumber = alphabet.indexOf(x)
        LetterNumber = (LetterNumber + shift) % alphabet.length
        val encodedLetter = alphabet[LetterNumber]
        encodedString += encodedLetter
    }
    return encodedString
}