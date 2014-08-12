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

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
@RunWith(classOf[JUnitRunner])
class LargestPalindromeProductSuite extends FunSuite {

  // Iterative version

  test("Largest palindrome product of 3-digists number is 906609") {
    assert(906609 === LargestPalindromeProduct.getLargestPalindromeProduct())
  }

  // Iterative version based on functional combinators and view

  test("Largest palindrome product of 3-digists number is 906609 - functional combiator version -") {
    assert(906609 === LargestPalindromeProduct.getLargestPalindromeProductFunctionalCombinators())
  }
}

