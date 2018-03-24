fun conjSelect(inp: String): String = when {
    inp.split(" ")[1] == "ser" -> serConj(inp)
    inp.split(" ")[1] == "ir" -> ir(inp)
    IrregularStorage.irregulars.containsKey(inp.split(" ")[1]) -> irregularConj(inp)
    else -> conjVerb(inp)
}