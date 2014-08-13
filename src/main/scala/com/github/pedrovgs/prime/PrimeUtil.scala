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

package com.github.pedrovgs.prime

/**
 *
 * Utility class created to contains some interesting methods to work with prime numbers.
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object PrimeUtil {

  /**
   * This algorithm to check if a number is prime or not is not the faster version but it's faster that check if every
   * number below the number can be multiple of the number. This algorithm generates a range between e and the sqrt of
   * the value to check if not exists a value to divide the value and get a module 0.
   *
   * We can improve this function in the future using other algorithms like some described here:
   *
   * http://www.wikihow.com/Check-if-a-Number-Is-Prime
   *
   * @param value to check if is prime.
   * @return true if the value passed as parameter is prime.
   */
  def isPrime(value: Long): Boolean = {
    !(2L to math.sqrt(value).toInt).exists(value % _ == 0)
  }

}
