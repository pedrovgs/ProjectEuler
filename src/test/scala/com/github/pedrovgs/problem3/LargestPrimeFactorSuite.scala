package com.github.pedrovgs.problem3

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class LargestPrimeFactorSuite extends FunSuite {

  test("Largest prime factor of 2 is 2") {
    assert(2 === LargestPrimeFactor.getLargestPrimeFactor(2))
  }

  test("Largest prime factor of 4 is 2") {
    assert(2 === LargestPrimeFactor.getLargestPrimeFactor(4))
  }

  test("Largest prime factor of 15 is 5") {
    assert(5 === LargestPrimeFactor.getLargestPrimeFactor(15))
  }

  test("Largest prime factor of 33 is 11") {
    assert(11 === LargestPrimeFactor.getLargestPrimeFactor(33))
  }

  test("Largest prime factor of 111 is 37") {
    assert(37 === LargestPrimeFactor.getLargestPrimeFactor(111))
  }

  test("Largest prime factor of 13195 is 29") {
    assert(29 === LargestPrimeFactor.getLargestPrimeFactor(13195))
  }

}
