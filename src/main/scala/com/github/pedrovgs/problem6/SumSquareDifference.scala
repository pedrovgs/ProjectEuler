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

package com.github.pedrovgs.problem6

import com.github.pedrovgs.time.Time

/**
 * The sum of the squares of the first ten natural numbers is, 12 + 22 + ... + 102 = 385
 * The square of the sum of the first ten natural numbers is, (1 + 2 + ... + 10)2 = 552 = 3025
 *
 * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025 − 385 = 2640.
 *
 * Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object SumSquareDifference {

  def main(args: Array[String]) = {
    Time.measure(println("The difference between the sum of the squares of the first one hundred natural numbers and the " +
      "square of the sum is: " + getSumSquareDifference((1 to 100).toList)))
  }

  /**
   *
   * Calculates the difference between the sum of the squares of a range and the square of the sum of that range.
   *
   * @param range to evaluate
   * @return
   */
  def getSumSquareDifference(range: List[Int]): Int = {

    def square(a: Int) = a * a

    val sum = range.sum
    square(sum) - range.map(n => square(n)).sum
  }

}
