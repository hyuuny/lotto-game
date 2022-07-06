package domain

import domain.Numbers.Companion.randomNumbers
import org.assertj.core.api.Assertions.assertThat
import java.util.*
import kotlin.test.Test

class RandomNumbersTest {

    @Test
    internal fun `랜덤 로또 번호 6개 가져오기`() {
        val randomNumbers = randomNumbers
        assertThat(randomNumbers.size).isEqualTo(6)
    }

}


const val MAX_NUMBER = 6
const val MAX_LOTTO_NUMBER = 45

class Numbers {

    companion object {
        val randomNumbers: List<Int>
            get() {
                val randomNumbers = mutableSetOf<Int>()
                while (randomNumbers.size < MAX_NUMBER) {
                    randomNumbers.add(Random().nextInt(MAX_LOTTO_NUMBER) + 1)
                }
                return randomNumbers.sorted()
            }
    }
}
