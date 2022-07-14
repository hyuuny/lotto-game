package domain

import domain.Numbers.Companion.randomNumbers
import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class RandomNumbersTest {

    @Test
    fun `랜덤 로또 번호 6개 가져오기`() {
        val randomNumbers = randomNumbers
        assertThat(randomNumbers.size).isEqualTo(6)
    }

}