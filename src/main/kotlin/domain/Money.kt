package domain

import domain.Store.Companion.LOTTO_AMOUNT

data class Money(
    val money: String
) {

    val toLong: Long
        get() = this.money.toLong()

    val toCount: Long
        get() = this.toLong / LOTTO_AMOUNT

    companion object {
        private const val MSG_NUMBER_ERROR = "숫자만 입력 가능해요."
    }

    init {
        this.verifyMoney(money)
    }

    private fun verifyMoney(money: String) {
        if (money.toIntOrNull() == null) throw IllegalStateException(MSG_NUMBER_ERROR)
    }

}