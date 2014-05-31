package com.github.pedrovgs.problem4

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
 * Pedro Vicente Gómez Sánchez
 */

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class LargestPalindromeProductSuite extends FunSuite {

  test("Largest palindrome product of 3-digists number is 906609") {
    assert(906609 === LargestPalindromeProduct.getLargestPalindromeProduct())
  }

}

