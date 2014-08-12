/*
 * Copyright (C) 2014 Pedro Vicente Gómez Sánchez.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.pedrovgs.problem10

import com.github.pedrovgs.prime.PrimeUtil
import com.github.pedrovgs.time.Time

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
