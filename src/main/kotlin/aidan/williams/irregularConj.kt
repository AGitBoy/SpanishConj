fun irregularConj(inp: String): String {
    val verbReference = IrregularStorage.irregulars[inp.split(" ")[1]]!!
    val out = conj(inp, verbReference.go)
    return if (verbReference.go && tokenize(inp) == I || tokenize(inp) == We || tokenize(inp) == YouAll) out.toString()
    else {
        out.root = out.root.replaceLast(verbReference.type.first, verbReference.type.second)
        return out.toString()
    }
}