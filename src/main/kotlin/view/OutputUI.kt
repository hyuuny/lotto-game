package view

class OutputUI {

    companion object {
        private const val MSG_PURCHASE_COUNT = "개를 구매했습니다."
        private const val MSG_WINNING_STATISTICS = "당첨 통계"
        private const val MSG_DASH = "---------"
        private const val MSG_THREE = "3개 일치 (5,000원)- "
        private const val MSG_FOUR = "4개 일치 (50,000원)- "
        private const val MSG_FIVE = "5개 일치 (15,000,000원)- "
        private const val MSG_Six = "6개 일치 (2,000,000,000원)- "
        private const val MSG_EX = "개"

        fun printPurchaseCount(count: Long) = println("$count" + MSG_PURCHASE_COUNT)

        fun printLottoNumbers(lottoNumbers: List<List<Int>>) = lottoNumbers.forEach(::println)

        fun printWinningStatistics() = println(MSG_WINNING_STATISTICS)

        fun printDash() = println(MSG_DASH)

        fun printEmpty() = println()

        fun printErrorMsg(message: String) = println(message + "\n")

        fun printResult(mutableMap: MutableMap<Int, Int>) {
            this.printThree(mutableMap[3])
            this.printFour(mutableMap[4])
            this.printFive(mutableMap[5])
            this.printSix(mutableMap[6])
        }

        private fun printThree(count: Int?) = println(MSG_THREE + "$count" + MSG_EX)

        private fun printFour(count: Int?) = println(MSG_FOUR + "$count" + MSG_EX)

        private fun printFive(count: Int?) = println(MSG_FIVE + "$count" + MSG_EX)

        private fun printSix(count: Int?) = println(MSG_Six + "$count" + MSG_EX)
    }

}