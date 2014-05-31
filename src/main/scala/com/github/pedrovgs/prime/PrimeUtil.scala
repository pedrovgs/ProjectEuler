package com.github.pedrovgs.prime

/**
 *
 * Utility class created to contains some interesting methods to work with prime numbers
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object PrimeUtil {

  /**
   * This algorithm to check if a number is prime or not is not the faster version but it's faster that check if every
   * number below the number can be multiple of the number.
   *
   * We can improve this function in the future using other algorithms like some described here:
   *
   * http://www.wikihow.com/Check-if-a-Number-Is-Prime
   *
   * @param value to check if is prime.
   * @return true if the value passed as parameter is prime.
   */
  def isPrime(value: Long): Boolean = {
    !(2L to math.sqrt(value).toInt).exists(value % _ == 0)
  }

}
