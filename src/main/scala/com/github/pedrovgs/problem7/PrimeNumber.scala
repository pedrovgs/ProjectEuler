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
