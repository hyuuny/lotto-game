package view

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

private const val MSG_PURCHASE_COUNT = "개를 구매했습니다."
private const val MSG_WINNING_STATISTICS = "당첨 통계"
private const val MSG_DASH = "---------"
private const val MSG_THREE_MATCHES = "3개 일치 (5,000원)- "
private const val MSG_FOUR_MATCHES = "4개 일치 (50,000원)- "
private const val MSG_FIVE_MATCHES = "5개 일치 (15,000,000원)- "
private const val MSG_ALL_MATCHES = "6개 일치 (2,000,000,000원)- "
private const val MSG_EX = "개"

class OutputUiTest {

    @Test
    fun `개수 구매 완료 메시지`() {
        val expectedMsg = "개를 구매했습니다."
        assertThat(MSG_PURCHASE_COUNT).isEqualTo(expectedMsg)
    }

    @Test
    fun `당첨 통계 메시지`() {
        val expectedMsg = "당첨 통계"
        assertThat(MSG_WINNING_STATISTICS).isEqualTo(expectedMsg)
    }

    @Test
    fun `3개 일치 메시지`() {
        val expectedMsg = "3개 일치 (5,000원)- "
        assertThat(MSG_THREE_MATCHES).isEqualTo(expectedMsg)
    }

    @Test
    fun `4개 일치 메시지`() {
        val expectedMsg = "4개 일치 (50,000원)- "
        assertThat(MSG_FOUR_MATCHES).isEqualTo(expectedMsg)
    }

    @Test
    fun `5개 일치 메시지`() {
        val expectedMsg = "5개 일치 (15,000,000원)- "
        assertThat(MSG_FIVE_MATCHES).isEqualTo(expectedMsg)
    }

    @Test
    fun `모두 일치 메시지`() {
        val expectedMsg = "6개 일치 (2,000,000,000원)- "
        assertThat(MSG_ALL_MATCHES).isEqualTo(expectedMsg)
    }

    @Test
    fun `개 메시지`() {
        val expectedMsg = "개"
        assertThat(MSG_EX).isEqualTo(expectedMsg)
    }

}




