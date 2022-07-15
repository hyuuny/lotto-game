package domain

import java.util.*


class LottoGenerator {

    companion object {
        private const val MAX_NUMBER = 6
        private const val MAX_LOTTO_NUMBER = 45

        val lottoNumbers: List<Int>
            get() {
                val lottoNumbers = mutableSetOf<Int>()
                while (lottoNumbers.size < MAX_NUMBER)
                    lottoNumbers.add(Random().nextInt(MAX_LOTTO_NUMBER) + 1)
                return lottoNumbers.sorted()
            }
    }

}