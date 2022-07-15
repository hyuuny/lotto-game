package domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class FormatterTest {

    @Test
    fun `로또 번호를 ', '를 기준으로 자른다`() {
        val lottos = "1, 2, 3, 4, 5, 6"
        val splitToLotts = Formatter.splitToList(lottos)
        splitToLotts[0] shouldBe 1
        splitToLotts[1] shouldBe 2
        splitToLotts[2] shouldBe 3
        splitToLotts[3] shouldBe 4
        splitToLotts[4] shouldBe 5
        splitToLotts[5] shouldBe 6
    }

}