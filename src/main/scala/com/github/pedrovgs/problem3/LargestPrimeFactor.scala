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

package com.github.pedrovgs.problem3

import com.github.pedrovgs.prime.PrimeUtil
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


    @tailrec
    def getLargestPrimeFactorInner(value: BigInt, candidate: BigInt): BigInt = {
      val prime: Boolean = PrimeUtil.isPrime(candidate.toLong)
      if (value % candidate == 0 && prime && value == candidate) candidate
      else if (value % candidate == 0 && prime) getLargestPrimeFactorInner(value / candidate, candidate)
      else getLargestPrimeFactorInner(value, candidate + 1)
    }

    getLargestPrimeFactorInner(value, 2)
  }

}
