import org.apache.commons.cli.*

fun main(args: Array<String>) {

    val optionList = listOf(
            Option("h", "help", false, "displays help message"),
            Option("i", "interactive", false, "opens interactive mode")
    )
    val group = OptionGroup()

    for(option in optionList) group.addOption(option)

    val options = Options().addOptionGroup(group)
    val arguments = DefaultParser().parse(options, args)

    when {
        arguments.hasOption("h") -> HelpFormatter().printHelp("conjugate [-h|-i]|[arguments]", options)
        arguments.hasOption("i") -> while(true) {
            try {
                print(conjSelect(readLine()!!))
            } catch (e: Exception) {
                print(e)
            }
            
            print("\n")
        }
        else -> conjSelect(arguments.argList.joinToString(" "))
    }
}