object IrregularStorage {
    private val e_ie = TransitionType("e", "ie")
    private val e_i = TransitionType("e", "i")
    private val u_ue = TransitionType("u", "ue")
    private val o_ue = TransitionType("e", "ue")

    val irregulars = mapOf(
            "jugar" to Irregular(u_ue),
            "dormir" to Irregular(o_ue),
            "tener" to Irregular(e_ie, go = true),
            "pedir" to Irregular(e_i),
            "poder" to Irregular(o_ue),
            "almorzar" to Irregular(o_ue),
            "cerrar" to Irregular(e_ie),
            "comenzar" to Irregular(e_i),
            "conseguir" to Irregular(e_i),
            "empezar" to Irregular(e_ie),
            "encontrar" to Irregular(o_ue),
            "entender" to Irregular(e_ie)
    )
}