package domain

data class WinningChecker(
    val winningNumber: List<Int> = ArrayList(),
    val countMap: MutableMap<Int, Int> = mutableMapOf(1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0)
) {

    fun checking(lottoNumbers: List<List<Int>>): MutableMap<Int, Int> {
        lottoNumbers.forEach(::matchToCount)
        return countMap
    }

    private fun matchToCount(lottoNumber: List<Int>) {
        val union = lottoNumber + this.winningNumber
        val intersection = groupByAndDistinct(union)
        val length = intersection.joinToString().split(", ").size
        this.countMap[length] = countMap[length]!! + 1
    }

    private fun groupByAndDistinct(union: List<Int>) =
        union.groupBy { it }.filter { it.value.size > 1 }.flatMap { it.value }.distinct()


}