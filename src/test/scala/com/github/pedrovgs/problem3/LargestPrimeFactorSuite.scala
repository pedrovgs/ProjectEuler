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

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class LargestPrimeFactorSuite extends FunSuite {

  test("Largest prime factor of 2 is 2") {
    assert(2 === LargestPrimeFactor.getLargestPrimeFactor(2))
  }

  test("Largest prime factor of 4 is 2") {
    assert(2 === LargestPrimeFactor.getLargestPrimeFactor(4))
  }

  test("Largest prime factor of 15 is 5") {
    assert(5 === LargestPrimeFactor.getLargestPrimeFactor(15))
  }

  test("Largest prime factor of 33 is 11") {
    assert(11 === LargestPrimeFactor.getLargestPrimeFactor(33))
  }

  test("Largest prime factor of 111 is 37") {
    assert(37 === LargestPrimeFactor.getLargestPrimeFactor(111))
  }

  test("Largest prime factor of 13195 is 29") {
    assert(29 === LargestPrimeFactor.getLargestPrimeFactor(13195))
  }

  test("Largest prime factor of 600851475143 is 6857") {
    assert(6857 === LargestPrimeFactor.getLargestPrimeFactor(BigInt("600851475143")))
  }

}
