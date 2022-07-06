package domain

import domain.Numbers.Companion.randomNumbers
import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class StoreTest {

    @Test
    internal fun `가게에서 로또 구입하기`() {
        val money = 14000L
        val store = Store()
        val buyLottos = store.buy(money)
        buyLottos
        assertThat(buyLottos.size).isEqualTo(14)
    }

}

const val LOTTO_AMOUNT = 1_000

class Store {

    fun buy(money: Long): List<List<Int>> {
        val lottoCount = this.divide(money)
        val lottoNumbers = mutableListOf<List<Int>>()
        for (i in 1..lottoCount) {
            lottoNumbers.add(randomNumbers)
        }
        return lottoNumbers.toList()
    }

    private fun divide(money: Long) = money / LOTTO_AMOUNT

}