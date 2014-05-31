package com.github.pedrovgs.problem10

import com.github.pedrovgs.time.Time
import com.github.pedrovgs.prime.PrimeUtil

/**
 *
 * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
 *
 * Find the sum of all the primes below two million.
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object SummationOfPrimes {

  def main(args: Array[String]) {
    Time.measure(println("The fum of all the primes below two million is: " + getSummationOfPrimesBelow(2000000)))
  }

  /**
   * Implementation based on generate a range from 2 to the bound, filter the prime values and sum every prime number
   * below the bound. This solution is not too much slow because we have used a isPrime function faster than the easier
   * version where you search a multiple of the value that is not the value.
   *
   * I've improved part of the algorithm generating a initial range of numbers to be evaluated without even numbers
   * except 2 -> 2 + (3L to bound by 2). With this part of the algorithm we avoid check if even numbers are prime or not.
   *
   * @param bound
   * @return
   */
  def getSummationOfPrimesBelow(bound: Long): Long = {

    2 + (3L to bound by 2).filter(PrimeUtil.isPrime).sum
  }

}
