package com.github.pedrovgs.problem9

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class PythagoreanTripletSuite extends FunSuite {

  test("The product of the pythagorean triples that sum 1000 is 31875000") {
    assert(31875000 === PythagoreanTriplet.getProductOfPythagoreanTripletFor(1000))
  }

}
