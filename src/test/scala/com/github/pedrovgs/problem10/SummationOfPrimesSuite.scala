package com.github.pedrovgs.problem10

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class SummationOfPrimesSuite extends FunSuite {

  test("The sum of the primes below 10 is 17") {
    assert(17 === SummationOfPrimes.getSummationOfPrimesBelow(10))
  }

  test("The fum of all the primes below two million is 142913828922") {
    assert(142913828922L === SummationOfPrimes.getSummationOfPrimesBelow(2000000L))
  }

}
