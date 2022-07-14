package domain

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class StoreTest {

    @Test
    fun `가게에서 로또 구입하기`() {
        val money = 14000L
        val buyLottos = Store.buy(money)
        assertThat(buyLottos.size).isEqualTo(14)
    }

}