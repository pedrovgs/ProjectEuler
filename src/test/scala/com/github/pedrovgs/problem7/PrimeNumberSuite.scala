package com.github.pedrovgs.problem7

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class PrimeNumberSuite extends FunSuite {

  test("The 6th prime number is 13") {
    assert(13 === PrimeNumber.getPrimeNumberAt(6))
  }

}
