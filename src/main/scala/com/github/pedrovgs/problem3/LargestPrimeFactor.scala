package com.github.pedrovgs.problem3

import com.github.pedrovgs.time.Time
import scala.annotation.tailrec

/**
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object LargestPrimeFactor {

  def main(args: Array[String]) = {
    Time.measure(println("The largest prime factor of 600851475143 is: " + getLargestPrimeFactor(BigInt("600851475143"))))
  }


  /**
   * Calculate the largest prime factor of a given parameter.
   *
   * This implementation is based on search the first prime less than the given parameter multiple of that value.
   *
   * Tail recursive implementation.
   *
   * @param value
   */
  def getLargestPrimeFactor(value: BigInt): BigInt = {

    /**
     * Given a number to analyze, calculate if it's prime using a tail recursive function.
     * @param number
     * @return true if the number is prime
     */
    def isPrime(number: BigInt): Boolean = {

      @tailrec
      def isPrimeInner(number: BigInt, counter: BigInt): Boolean = {
        if (number == counter) true
        else if (number % counter == 0) false
        else isPrimeInner(number, counter + 1)
      }

      isPrimeInner(number, 2)
    }

    @tailrec
    def getLargestPrimeFactorInner(value: BigInt, candidate: BigInt): BigInt = {
      val prime: Boolean = isPrime(candidate)
      if (value % candidate == 0 && prime && value == candidate) candidate
      else if (value % candidate == 0 && prime) getLargestPrimeFactorInner(value / candidate, candidate + 1)
      else getLargestPrimeFactorInner(value, candidate + 1)
    }

    getLargestPrimeFactorInner(value, 2)
  }

}
