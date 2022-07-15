package domain

class LottoStore {

    companion object {
        const val LOTTO_AMOUNT = 1_000

        fun buy(money: Long): List<List<Int>> {
            val lottoCount = this.divide(money)
            val lottoNumbers = mutableListOf<List<Int>>()
            for (i in 1..lottoCount) lottoNumbers.add(LottoGenerator.lottoNumbers)
            return lottoNumbers.toList()
        }

        private fun divide(money: Long) = money.div(LOTTO_AMOUNT)
    }

}