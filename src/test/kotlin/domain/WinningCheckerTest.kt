package domain

import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test

class WinningCheckerTest {

    @Test
    fun `당첨 번호 일치 확인`() {
        val list1 = listOf(listOf(1, 2, 3, 4, 5), listOf(1, 2, 3, 4, 9), listOf(13, 8, 9, 1, 2))
        val list2 = listOf(3, 4, 5, 6, 7)

        val matchMap = mutableMapOf(1 to 0, 2 to 0, 3 to 0, 4 to 0, 5 to 0, 6 to 0)

        list1.stream()
            .forEach { lottoNumber ->
                val union = lottoNumber + list2
                val intersection =
                    union.groupBy { it }.filter { it.value.size > 1 }.flatMap { it.value }
                        .distinct()
                val length = intersection.joinToString().split(", ").size

                matchMap[length] = matchMap[length]!! + 1
            }
        
        matchMap[1] shouldBe 1
        matchMap[2] shouldBe 1
        matchMap[3] shouldBe 1
        matchMap[4] shouldBe 0
        matchMap[5] shouldBe 0
        matchMap[6] shouldBe 0
    }

}