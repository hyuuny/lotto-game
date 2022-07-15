package domain

import io.kotest.matchers.shouldBe
import kotlin.test.Test

class LottoStoreTest {

    @Test
    fun `가게에서 로또 구입하기`() {
        val money = 14000L
        val buyLottos = LottoStore.buy(money)
        buyLottos.size shouldBe 14
    }

}