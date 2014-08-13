package com.github.pedrovgs.problem12

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class HighlyDivisibleTriangularNumberSuite extends FunSuite {

  test("First triangular number with 5 divisors is 28") {
    assert(28 === HighlyDivisibleTriangularNumber.getTriangularNumberWithDivisors(5))
  }

}
