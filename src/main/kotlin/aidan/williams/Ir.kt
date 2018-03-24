fun ir(inp: String): String = inp.replace(
        "ir",
        when(tokenize(inp)) {
            I -> "voy"
            You -> "vas"
            It -> "va"
            We -> "vamos"
            YouAll -> "vais"
            They -> "van"
            else -> throw Exception("went wrong")
        }
)
