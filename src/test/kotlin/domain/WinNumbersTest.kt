package domain

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

class WinNumbersTest {

    @Test
    internal fun `이번주 로또번호 확인`() {
        val winNumbers = WinNumbers(listOf(1, 2, 3, 4, 5, 6))
        assertThat(winNumbers.thisWeekLottoNumbers.size).isEqualTo(6)
        assertThat(winNumbers.thisWeekLottoNumbers).contains(1, 2, 3, 4, 5, 6)
    }

}

class WinNumbers(
    val thisWeekLottoNumbers: List<Int>
)