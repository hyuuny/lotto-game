package controller

import domain.Formatter
import domain.Money
import domain.Store
import domain.WinningChecker
import view.InputUI
import view.OutputUI

class LottoController {

    private var money: Money = Money("0")
    private var lottoNumbers: List<List<Int>> = ArrayList()
    private var winningNumbers: List<Int> = ArrayList()


    fun start() {
        try {
            // 1. 구입 금액 입력
            this.inputMoney()
            this.outputLottoNumbers()

            // 2. 우승번호 입력
            this.inputWinningNumber()

            // 3. 결과 출력
            this.outputResult()
        } catch (e: Exception) {
            OutputUI.printErrorMsg(e.message.toString())
            this.start()
        }
    }

    private fun outputLottoNumbers() {
        lottoNumbers = Store.buy(money.toLong)
        OutputUI.printLottoNumbers(lottoNumbers)
        OutputUI.printEmpty()
    }

    private fun inputMoney() {
        InputUI.printPurchase()
        money = Money(readLine()!!)
        OutputUI.printPurchaseCount(money.toCount)
    }

    private fun inputWinningNumber() {
        InputUI.printLastWeekWinningNumber()
        winningNumbers = Formatter.splitToList(readLine()!!)
        OutputUI.printEmpty()
    }

    private fun outputResult() {
        OutputUI.printWinningStatistics()
        OutputUI.printDash()
        val winningChecker = WinningChecker(this.winningNumbers)
        OutputUI.printResult(winningChecker.checking(lottoNumbers))
    }

}