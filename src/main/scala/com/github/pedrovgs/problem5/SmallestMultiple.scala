package com.github.pedrovgs.problem5

import com.github.pedrovgs.time.Time
import scala.annotation.tailrec

/**
 *
 * 2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
 * What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object SmallestMultiple {

  def main(args: Array[String]) = {

    Time.measure(println("Smallest number multiple of 1 to 20 is: " +
      getSmallestMultipleOfFirst20()))
  }

  /**
   * Calculate the smallest number multiple of 1 to 20 using a tail recursive function.
   *
   * This algorithm is really slow because is going to check for every int if is multiple of 1 to 20
   *
   * @return
   */
  def getSmallestMultipleOfFirst20(): Int = {

    @tailrec
    def smallestMultipleInner(number: Int): Int = {
      if (isMultipleOf20First(number)) number
      else smallestMultipleInner(number - 1)
    }

    def isMultipleOf20First(number: Int): Boolean = {
      val results = (1 to 20).view.filter(number % _ == 0)
      results.size == 20
    }

    smallestMultipleInner(Int.MaxValue)
  }
}
