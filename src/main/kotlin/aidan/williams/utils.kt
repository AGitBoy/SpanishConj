import java.text.Normalizer

/**
 * An extension function that gives syntactic sugar for regex matching
 *
 * @return weather the regex matches
 */
infix fun String.matches(regex: String): Boolean = Regex(regex).matches(this)

/**
 * A container for conjugation endings
 *
 * Does nothing, just improves readability.
 *
 * @property ar Holds ar ending.
 * @property er Holds er ending, defaults to the same value as ar.
 * @property ir Holds ir ending, defaults to the same value as er.
 * @constructor Creates the kotlin.Ending class.
 */
data class Ending(
        val ar: String,
        val er: String = ar,
        val ir: String = er
)

/**
 * Removes accents from a string
 *
 * @return The string without accents.
 */
fun stripAccents(str: String): String {
    var s = str
    s = Normalizer.normalize(s, Normalizer.Form.NFD)
    s = s.replace("[\\p{InCombiningDiacriticalMarks}]".toRegex(), "")
    return s
}

data class TransitionType(val first: String, val second: String)

data class Irregular(val type: TransitionType, val go: Boolean = false)

fun String.replaceLast(regex: String, replacement: String): String {
    return this.replaceFirst("(?s)$regex(?!.*?$regex)".toRegex(), replacement)
}

data class Sentence(private val pronoun: String, var root: String, private val ending: String) {
    override fun toString(): String = "$pronoun $root$ending"
}
