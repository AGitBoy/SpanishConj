fun tokenize(inp: String): String = when {
        inp matches "yo.*" -> I
        inp matches "tu.*" -> You
        inp matches "(ell(o|a)|ustede)s.*" -> They
        inp matches "(el|la|ell(o|a)|usted).*" -> It
        inp matches "nosotros.*" -> We
        inp matches "vosotros.*" -> YouAll
        else -> throw IllegalArgumentException("no pronoun found")
    }