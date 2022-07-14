package view

class InputUI {

    companion object {
        private const val MSG_PURCHASE_AMOUNT = "구입금액을 입력해 주세요."
        private const val MSG_LAST_WEEK_WINNING_NUMBER = "지난 주 당첨 번호를 입력해 주세요."

        fun printPurchase() = println(MSG_PURCHASE_AMOUNT)

        fun printLastWeekWinningNumber() = println(MSG_LAST_WEEK_WINNING_NUMBER)
    }

}