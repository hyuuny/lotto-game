package domain

import domain.LottoGenerator.Companion.lottoNumbers
import io.kotest.matchers.shouldBe
import kotlin.test.Test

class LottoGeneratorTest {

    @Test
    fun `랜덤 로또 번호 6개 가져오기`() {
        lottoNumbers.size shouldBe 6
    }

}