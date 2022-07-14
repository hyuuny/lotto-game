package domain

import java.util.*


class Numbers {

    companion object {
        private const val MAX_NUMBER = 6
        private const val MAX_LOTTO_NUMBER = 45

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