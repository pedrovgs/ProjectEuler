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

package com.github.pedrovgs.problem8

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class LargestProductSuite extends FunSuite {

  test("Largest product of 4 digits adjacent numbers in the exercise attached number is 5832") {
    assert(5832 === LargestProduct.getLargestProduct(4))
  }

  test("Largest product of 13 digits adjacent numbers in the exercise attached number is 23514624000") {
    assert(BigInt("23514624000") === LargestProduct.getLargestProduct(13))
  }

}
