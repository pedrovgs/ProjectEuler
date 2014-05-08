package com.github.pedrovgs.problem3

/**
 *
 * The prime factors of 13195 are 5, 7, 13 and 29.
 *
 * What is the largest prime factor of the number 600851475143 ?
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object LargestPrimeFactor {

  def getLargestPrimeFactor(i: Int): Any = {

    def getPrimeFactors(i: Int): List[Int] = {
      List()
    }

    getPrimeFactors(i).max
  }

}
