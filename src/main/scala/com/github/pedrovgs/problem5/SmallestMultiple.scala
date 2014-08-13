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

    Time.measure(println("Smallest number multiple of 1 to 20 with tail recursive implementation is: " +
      getSmallestMultipleOfFirst20()))
    Time.measure(println("Smallest number multiple of 1 to 20 with functional combinators implementation is: " +
      getSmallestMultipleOfFirst20UsingFunctionalCombinators()))
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
      else smallestMultipleInner(number + 20)
    }
    smallestMultipleInner(20)
  }

  /**
   * Calculate the smallest number multiple of 1 to 20 using functional combinators and view.
   *
   * This algorithm is faster because view lets you generate the range and evaluate the result
   * at the same time.
   *
   * This implementation is based because we are using a view to calculate the range between 20 and the Int.MaxValue.
   *
   * @return
   */
  def getSmallestMultipleOfFirst20UsingFunctionalCombinators(): Int = {
    (20 to Int.MaxValue by 20).view.find(isMultipleOf20First).get
  }

  def isMultipleOf20First(number: Int): Boolean = {
    (1 to 20).view.filter(number % _ == 0).size == 20
  }

}
