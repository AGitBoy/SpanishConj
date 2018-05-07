fun conj(inp: String, go: Boolean = false): Sentence {
    val normalizedInp = stripAccents(inp.decapitalize())

    val conjTable = mapOf(
            I to Ending(if (go){ "go" } else { "o" }),
            You to Ending("as", "es"),
            It to Ending("a", "e"),
            We to Ending("amos", "emos", "imos"),
            YouAll to Ending("áis", "éis", "ís"),
            They to Ending("an", "en")
    )

    val end = when {
        normalizedInp matches ".*ar" -> "ar"
        normalizedInp matches ".*er" -> "er"
        normalizedInp matches ".*ir" -> "ir"
        else -> throw IllegalArgumentException("No ar/er/ir ending found")
    }

    val pronoun = tokenize(normalizedInp)

    val conjEnding = when(end) {
        "ar" -> conjTable[pronoun]?.ar
        "er" -> conjTable[pronoun]?.er
        "ir" -> conjTable[pronoun]?.ir
        else -> throw Error("Something Went Wrong, Sorry")
    }
    val root = normalizedInp.split(" ")[1].substring(0 until normalizedInp.split(" ")[1].length - 2)
    return Sentence(normalizedInp.split(" ")[0], root, conjEnding!!)
}