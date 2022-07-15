package domain

import java.math.RoundingMode
import java.text.DecimalFormat

class Yields(
    private val money: Long,
    private val countMap: MutableMap<Int, Int>,
    private val decimalFormat: DecimalFormat = DecimalFormat("#.##"),
) {

    init {
        decimalFormat.roundingMode = RoundingMode.DOWN
    }

    companion object {
        private const val THREE = 5_000
        private const val FOUR = 50_000
        private const val FIVE = 1_500_000
        private const val SIX = 2_000_000_000
    }

    fun calculateYields(): String {
        val winningMoney = calculateWinningMoney()
        return divWinningMoney(winningMoney)
    }

    private fun calculateWinningMoney(): Long {
        val three = countMap[3]!!.times(THREE).toLong()
        val four = countMap[4]!!.times(FOUR).toLong()
        val five = countMap[5]!!.times(FIVE).toLong()
        val six = countMap[6]!!.times(SIX).toLong()
        return three.plus(four).plus(five).plus(six)
    }

    private fun divWinningMoney(winningMoney: Long) = if (winningMoney == 0L) "0.00" else {
        decimalFormat.format(winningMoney.div(this.money.toDouble()))
    }

}