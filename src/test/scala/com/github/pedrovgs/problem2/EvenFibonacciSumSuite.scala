package com.github.pedrovgs.problem2

import org.scalatest.FunSuite
import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class EvenFibonacciSumSuite extends FunSuite {


  test("Fibonacci even numbers sums with bound at 4 is 2") {
    assert(2 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursive(4))
  }

  test("Fibonacci even numbers sums with bound at 6 is 10") {
    assert(2 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursive(6))
  }

  test("Fibonacci even numbers sums with bound at 9 is 44") {
    assert(10 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursive(9))
  }

}
