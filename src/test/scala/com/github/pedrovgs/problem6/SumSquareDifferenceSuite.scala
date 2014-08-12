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

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class SumSquareDifferenceSuite extends FunSuite {

  test("The difference between the sum of the squares of the first ten natural numbers and the square of the sum is 2640") {
    assert(2640 === SumSquareDifference.getSumSquareDifference((1 to 10).toList))
  }


  test("The difference between the sum of the squares of the first one hundred natural numbers and the square of the sum is 25164150") {
    assert(25164150 === SumSquareDifference.getSumSquareDifference((1 to 100).toList))
  }

}
