package com.github.pedrovgs.problem5

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class SmallestMultipleSuite extends FunSuite {

  test("Smallest multiple of 1 to 20 is 232792560") {
    assert(232792560 === SmallestMultiple.getSmallestMultipleOfFirst20())
  }

  test("Smallest multiple of 1 to 20 is 232792560 fucntional combinators implementation") {
    assert(232792560 === SmallestMultiple.getSmallestMultipleOfFirst20UsingFunctionalCombinators())
  }

}
