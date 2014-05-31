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

}
