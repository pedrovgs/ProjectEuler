package com.github.pedrovgs.problem4

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class LargestPalindromeProductSuite extends FunSuite {

  // Iterative version

  test("Largest palindrome product of 3-digists number is 906609") {
    assert(906609 === LargestPalindromeProduct.getLargestPalindromeProduct())
  }

  // Iterative version based on functional combinators and view

  test("Largest palindrome product of 3-digists number is 906609 - functional combiator version -") {
    assert(906609 === LargestPalindromeProduct.getLargestPalindromeProductFunctionalCombinators())
  }
}

