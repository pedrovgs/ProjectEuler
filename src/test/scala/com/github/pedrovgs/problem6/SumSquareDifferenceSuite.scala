package com.github.pedrovgs.problem6

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class SumSquareDifferenceSuite extends FunSuite {

  test("The difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640") {
    assert(2640 === SumSquareDifference.getSumSquareDifference((1 to 10).toList))
  }


  test("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is 25164150") {
    assert(25164150 === SumSquareDifference.getSumSquareDifference((1 to 100).toList))
  }

}
