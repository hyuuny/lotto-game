package domain

class Formatter {

    companion object {
        private const val COMMA = ", "

        fun splitToList(winningNumbers: String) =
            winningNumbers.split(COMMA).map { number -> number.toInt() }.toList()
    }

}