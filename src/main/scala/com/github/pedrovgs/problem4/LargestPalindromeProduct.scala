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

package com.github.pedrovgs.problem4

import com.github.pedrovgs.time.Time

import scala.collection.mutable.ListBuffer

/**
 *
 * A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers
 * is 9009 = 91 × 99. Find the largest palindrome made from the product of two 3-digit numbers.
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object LargestPalindromeProduct {

  def main(args: Array[String]) = {
    Time.measure(println("Time spent to get the largest palindrome product: " + getLargestPalindromeProduct()))
    Time.measure(println("Time spent to get the largest palindrome product using functional combinators: " +
      getLargestPalindromeProductFunctionalCombinators()))
  }

  /**
   * Iterative version based on keep every palindrome using an auxiliary version called isPalindrome and obtaining the
   * max palindrome.
   *
   * @return
   */
  def getLargestPalindromeProduct(): Int = {
    val palindromes = ListBuffer[Int]()
    for (i <- 100 to 999)
      for (j <- 100 to 999) {
        if (isPalindrome(i * j)) palindromes.+=(i * j)
      }
    palindromes.max
  }


  /**
   * Version based on functional combinators. Flat map functional combinator will generate a collection with
   * all the possible combinations that will be filtered using isPalindrome function. View method will let the algorithm
   * evaluate each element only when be used.
   *
   * This implementation is faster because the 100-999 range is generated using a view and this evaluates and generate
   * the range at the same time.
   *
   * @return
   */
  def getLargestPalindromeProductFunctionalCombinators(): Int = {
    (100 to 999).view
      .flatMap(i => (i to 999).map(i *))
      .filter(n => isPalindrome(n))
      .max
  }


  def isPalindrome(number: Int): Boolean = {
    val original = number.toString
    original == number.toString.reverse
  }


}
