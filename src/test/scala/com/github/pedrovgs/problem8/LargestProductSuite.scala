package com.github.pedrovgs.problem8

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class LargestProductSuite extends FunSuite {

  test("Largest product of 4 digits adjacent numbers in the exercise attached number is 5832") {
    assert(5832 === LargestProduct.getLargestProduct(4))
  }

  test("Largest product of 13 digits adjacent numbers in the exercise attached number is 23514624000") {
    assert(BigInt("23514624000") === LargestProduct.getLargestProduct(13))
  }

}
