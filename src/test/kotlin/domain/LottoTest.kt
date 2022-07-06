package domain

class LottoTest {
}

const val FIRST_PRIZE = 2_000_000_000L
const val SECOND_PRIZE = 15_000_00L
const val THIRD_PRIZE = 500_000L
const val FOURTH_PRIZE = 5_000L

data class Lotto(
    private val winNumbers: WinNumbers
) {

    fun lottery() {

    }


}