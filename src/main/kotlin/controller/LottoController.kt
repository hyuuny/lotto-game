package controller

import domain.*
import view.InputUI
import view.OutputUI

class LottoController {

    private var money: Money = Money()
    private var lottoNumbers: List<List<Int>> = ArrayList()
    private var winningNumbers: List<Int> = ArrayList()
    private var countMap: MutableMap<Int, Int> = mutableMapOf()

    fun start() {
        try {
            // 1. 구입 금액 입력
            this.inputMoney()
            this.outputLottoNumbers()

            // 2. 우승번호 입력
            this.inputWinningNumber()

            // 3. 결과 출력
            this.outputResult()
            this.outputYields()
        } catch (e: Exception) {
            OutputUI.printErrorMsg(e.message.toString())
            this.start()
        }
    }

    private fun outputLottoNumbers() {
        lottoNumbers = LottoStore.buy(money.toLong)
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
        countMap = winningChecker.checking(lottoNumbers)
        OutputUI.printResult(countMap)
    }

    private fun outputYields() {
        val yields = Yields(money.toLong, countMap)
        val calculatedYields = yields.calculateYields()
        OutputUI.printYields(calculatedYields)
    }

}