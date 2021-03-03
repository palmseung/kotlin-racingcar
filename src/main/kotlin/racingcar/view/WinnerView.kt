package racingcar.view

import racingcar.model.Car

private const val STRING_JOINER = ", "

object WinnerView {
    fun printWinner(winners: List<Car>) {
        val result = winners.joinToString(STRING_JOINER) { it.name }
        println(">>>>> ${result}가 최종 우승했습니다. ")
    }
}
