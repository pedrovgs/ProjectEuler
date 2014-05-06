package com.github.pedrovgs.problem1

/**
 *
 * Problem 1.
 *
 * If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these
 * multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object MultipleOf3Or5 {

  def main(args: Array[String]) {
    val start = System.currentTimeMillis();
    println("If you sum multiples of 3 or 5 below 10 you get: " + sumMultiplesOf3Or5Below(1000))
    println("Time spent to calculate with 1000 elements: " + (System.currentTimeMillis() - start) + " ms")
  }

  def sumMultiplesOf3Or5Below(bound: Int): Int = {
    val multiples = (1 to bound - 1).filter(elem => elem % 3 == 0 || elem % 5 == 0)

    def sumElements(elements: List[Int]): Int = {
      if (elements.isEmpty) 0
      else elements.head + sumElements(elements.tail)
    }
    sumElements(multiples.toList)
  }
}
