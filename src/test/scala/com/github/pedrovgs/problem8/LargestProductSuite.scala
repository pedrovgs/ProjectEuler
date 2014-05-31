package com.github.pedrovgs.problem8

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class LargestProductSuite extends FunSuite {

  test("Largest product of 4 digits adjacent numbers in the exercise attached number is 40824") {
    assert(40824 === LargestProduct.getLargestProduct())
  }

}
