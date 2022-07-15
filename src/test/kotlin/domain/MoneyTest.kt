package domain

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.throwable.shouldHaveMessage
import org.junit.jupiter.api.Test

private const val MSG_NUMBER_ERROR = "숫자만 입력 가능해요."
private const val MSG_EMPTY_ERROR = "금액은 공백일 수 없어요"

class MoneyTest {

    @Test
    fun `금액으로 로또 구매 개수 카운팅`() {
        val expectedCount = 14L
        val money = Money("14000")
        money.toCount shouldBe expectedCount
    }

    @Test
    fun `입력받은 금액 Long으로 변환`() {
        val expectedMoney = 14000L
        val money = Money(expectedMoney.toString())
        money.toLong shouldBe expectedMoney
    }

    @Test
    fun `Money Null 예외`() {
        shouldThrow<IllegalStateException> {
            Money(null.toString())
        }.shouldHaveMessage(MSG_NUMBER_ERROR)
    }

    @Test
    fun `Money 문자 예외`() {
        shouldThrow<IllegalStateException> {
            Money("hello")
        }.shouldHaveMessage(MSG_NUMBER_ERROR)
    }

    @Test
    fun `Money empty 예외`() {
        shouldThrow<IllegalStateException> {
            Money("")
        }.shouldHaveMessage(MSG_EMPTY_ERROR)
    }


}