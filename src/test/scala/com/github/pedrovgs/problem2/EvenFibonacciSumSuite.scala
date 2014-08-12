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

package com.github.pedrovgs.problem2

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class EvenFibonacciSumSuite extends FunSuite {

  // Iterative version

  test("Fibonacci even numbers sums with bound at 4 is 2") {
    assert(2 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursive(4))
  }

  test("Fibonacci even numbers sums with bound at 6 is 10") {
    assert(10 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursive(6))
  }

  test("Fibonacci even numbers sums with bound at 25 is 44") {
    assert(44 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursive(35))
  }

  test("Fibonacci even numbers sums with bound at 4000000 is 4613732") {
    assert(4613732 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursive(4000000))
  }

  // Tail recursive version

  test("Fibonacci even numbers sums with bound at 4 is 2 linear performance version") {
    assert(2 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursiveLinearPerformance(4))
  }

  test("Fibonacci even numbers sums with bound at 6 is 10 linear performance version") {
    assert(10 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursiveLinearPerformance(6))
  }

  test("Fibonacci even numbers sums with bound at 25 is 44 linear performance version") {
    assert(44 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursiveLinearPerformance(35))
  }

  test("Fibonacci even numbers sums with bound at 4000000 is 4613732 linear performance version") {
    assert(4613732 === EvenFibonacciSum.sumFibonacciEvenNumbersRecursiveLinearPerformance(4000000))
  }

}
