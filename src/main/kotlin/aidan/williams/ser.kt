fun serConj(inp: String): String {
    val normalizedInp = stripAccents(inp.decapitalize())
    val pronoun = tokenize(normalizedInp)
    val pronounString = (inp.split(" "))[0]
    return when(pronoun) {
        I -> "$pronounString soy"
        You -> "$pronounString eres"
        It -> "$pronounString es"
        We -> "$pronounString somos"
        YouAll -> "$pronounString sois"
        They -> "$pronounString son"
        else -> throw Error("Something Went Wrong!")
    }
}