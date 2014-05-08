package com.github.pedrovgs.problem3

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import com.github.pedrovgs.problem3.LargestPrimeFactor

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class LargestPrimeFactorSuite extends FunSuite {

  test("Largest prime factor of 13195 is 29") {
    assert(29 === LargestPrimeFactor.getLargestPrimeFactor(13195))
  }

}
