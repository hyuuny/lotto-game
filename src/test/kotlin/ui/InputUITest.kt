package ui

import org.assertj.core.api.Assertions.assertThat
import kotlin.test.Test

const val MSG_PURCHASE_AMOUNT = "구입금액을 입력해 주세요."

class InputUITest {

    @Test
    internal fun `구입 금액 입력 메시지`() {
        val expectedMsg = "구입금액을 입력해 주세요."
        assertThat(MSG_PURCHASE_AMOUNT).isEqualTo(expectedMsg)
    }

    @Test
    internal fun `지난 주 당첨 번호 입력 메시지`() {
        val expectedMsg = "지난 주 당첨 번호를 입력해 주세요."
        assertThat(MSG_LAST_WEEK_WINNING_NUMBERS).isEqualTo(expectedMsg)
    }

}

const val MSG_LAST_WEEK_WINNING_NUMBERS = "지난 주 당첨 번호를 입력해 주세요."


