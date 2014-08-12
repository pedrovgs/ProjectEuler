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

package com.github.pedrovgs.problem1

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class MultipleOf3Or5Suite extends FunSuite {

  // Iterative version

  test("Multiples of 3 or 5 below 5 have to sum 3") {
    assert(3 === MultipleOf3Or5.sumMultiplesOf3Or5Below(5))
  }

  test("Multiples of 3 or 5 below 6 have to sum 8") {
    assert(8 === MultipleOf3Or5.sumMultiplesOf3Or5Below(6))
  }

  test("Multiples of 3 or 5 below 10 have to sum 23") {
    assert(23 === MultipleOf3Or5.sumMultiplesOf3Or5Below(10))
  }

  test("Multiples of 3 or 5 below 20 have to sum 78 because 15 is multiple of 3 and 5") {
    assert(78 === MultipleOf3Or5.sumMultiplesOf3Or5Below(20))
  }

  test("Multiple of 3 or 5 below 1000 have to sum 233168") {
    assert(233168 === MultipleOf3Or5.sumMultiplesOf3Or5Below(1000))
  }

  // Tail recursive version

  test("Multiples of 3 or 5 below 5 have to sum 3. Recursive algorithm") {
    assert(3 === MultipleOf3Or5.sumMultiplesOf3Or5BelowTailRecursive(5))
  }

  test("Multiples of 3 or 5 below 6 have to sum 8. Recursive algorithm") {
    assert(8 === MultipleOf3Or5.sumMultiplesOf3Or5BelowTailRecursive(6))
  }

  test("Multiples of 3 or 5 below 10 have to sum 23. Recursive algorithm") {
    assert(23 === MultipleOf3Or5.sumMultiplesOf3Or5BelowTailRecursive(10))
  }

  test("Multiples of 3 or 5 below 20 have to sum 78 because 15 is multiple of 3 and 5. Recursive algorithm") {
    assert(78 === MultipleOf3Or5.sumMultiplesOf3Or5BelowTailRecursive(20))
  }

  test("Multiple of 3 or 5 below 1000 have to sum 233168.Recursive algorithm ") {
    assert(233168 === MultipleOf3Or5.sumMultiplesOf3Or5BelowTailRecursive(1000))
  }

}
