package com.github.pedrovgs.problem1

import com.github.pedrovgs.time.Time

import scala.annotation.tailrec

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
    Time.measure(println("If you sum multiples of 3 or 5 below 1000 you get: " + sumMultiplesOf3Or5Below(1000)))
    Time.measure(println("If you sum multiples of 3 or 5 below 1000 you get: " + sumMultiplesOf3Or5BelowTailRecursive(1000)))
  }

  /**
   * Calculate the sum of each multiple of 3 or 5 below a limit.
   *
   * This version of the algorithm is the slowest in this Scala Object because all the syntactic sugar used to get
   * a one line solution is going to affect the performance. "to", "filter" and "sum" functions are going to go over
   * a set of N elements.
   *
   * @param bound used to calculate the multiples.
   * @return sum of each multiple of 3 or 5 below bound parameter.
   */
  def sumMultiplesOf3Or5Below(bound: Int) = (1 to bound - 1).filter(elem => elem % 3 == 0 || elem % 5 == 0).sum

  /**
   * Calculate the sum of each multiple of 3 or 5 below a limit.
   *
   * This version of the algorithm is much more faster than the first one because this algorithm is going over the set of
   * N elements just one time to calculate the sum of each multiples.
   *
   * This implementation is tail recursive.
   *
   * @param bound used to calculate the multiples.
   * @return sum of each multiple of 3 or 5 below bound parameter.
   */
  def sumMultiplesOf3Or5BelowTailRecursive(bound: Int) = {

    @tailrec
    def sum(i: Int, acc: Int, bound: Int): Int = {
      if (i >= bound) acc
      else if (i % 3 == 0 || i % 5 == 0) sum(i + 1, acc + i, bound)
      else sum(i + 1, acc, bound)
    }

    sum(3, 0, bound)
  }

}
