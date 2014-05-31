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


  def isPalindrome(number: Int): Boolean = {
    val original = number.toString
    original == number.toString.reverse
  }


}
