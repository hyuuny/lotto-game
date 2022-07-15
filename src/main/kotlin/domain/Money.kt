package domain

import domain.LottoStore.Companion.LOTTO_AMOUNT

data class Money(
    val money: String = "0"
) {

    val toLong: Long
        get() = this.money.toLong()

    val toCount: Long
        get() = this.toLong.div(LOTTO_AMOUNT)

    companion object {
        private const val MSG_NUMBER_ERROR = "숫자만 입력 가능해요."
        private const val MSG_EMPTY_ERROR = "금액은 공백일 수 없어요"
    }

    init {
        this.verifyMoney(money)
    }

    private fun verifyMoney(money: String) {
        if (money.trim().isEmpty()) throw IllegalStateException(MSG_EMPTY_ERROR)
        if (money.toIntOrNull() == null) throw IllegalStateException(MSG_NUMBER_ERROR)
    }

}