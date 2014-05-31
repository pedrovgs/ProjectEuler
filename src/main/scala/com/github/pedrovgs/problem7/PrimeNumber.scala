package com.github.pedrovgs.problem7

import com.github.pedrovgs.time.Time
import scala.annotation.tailrec
import com.github.pedrovgs.prime.PrimeUtil

/**
 *
 * By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
 *
 * What is the 10001st prime number?
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object PrimeNumber {

  def main(args: Array[String]) = {
    Time.measure(println("10001st prime is: " + getPrimeNumberAt(10001)))
  }

  /**
   * Tail recursive version of the algorithm. Too slow because checks if every number is prime.
   *
   * isPrime function has been implemented using functional combinators.
   *
   * @param position
   * @return
   */
  def getPrimeNumberAt(position: Int): Int = {

    @tailrec
    def getPrimeNumberAtInner(counter: Int, possiblePrime: Int, position: Int): Int = {
      if (PrimeUtil.isPrime(possiblePrime) && counter == position - 1) possiblePrime
      else if (PrimeUtil.isPrime(possiblePrime)) getPrimeNumberAtInner(counter + 1, possiblePrime + 1, position)
      else getPrimeNumberAtInner(counter, possiblePrime + 1, position)
    }

    getPrimeNumberAtInner(0, 2, position)

  }


}
