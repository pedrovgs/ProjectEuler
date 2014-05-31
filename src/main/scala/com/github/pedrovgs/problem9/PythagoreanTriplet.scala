package com.github.pedrovgs.problem9

import com.github.pedrovgs.time.Time

/**
 *
 * A Pythagorean triplet is a set of three natural numbers, a < b < c, for which, a**2 + b**2= c**2
 * For example, 3**2 + 4**2 = 9 + 16 = 25 = 5**2
 *
 * There exists exactly one Pythagorean triplet for which a + b + c = 1000. Find the product abc.
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object PythagoreanTriplet {

  def main(args: Array[String]) = {
    Time.measure(println("The product of the pythagorean triples that sum 1000 is: " + getProductOfPythagoreanTripletFor(1000)))
  }


  def getProductOfPythagoreanTripletFor(value: Int): Int = {

    def square(n: Int) = n * n

    def isTriplet(a: Int, b: Int, c: Int): Boolean = {
      val squares = square(a) + square(b) == square(c)
      val gratherThan = a < b && b < c
      squares && gratherThan
    }

    for (a <- 1 to value)
      for (b <- 1 to value)
        for (c <- 1 to value)
          if ((a + b + c) == value && isTriplet(a, b, c)) return a * b * c
    return -1
  }

}
