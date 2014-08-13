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

package com.github.pedrovgs.problem11

import com.github.pedrovgs.time.Time

import scala.collection.mutable.ListBuffer

/**
 *
 * In the 20×20 grid below, four numbers along a diagonal line have been marked in red.
 *
 * 08 02 22 97 38 15 00 40 00 75 04 05 07 78 52 12 50 77 91 08
 * 49 49 99 40 17 81 18 57 60 87 17 40 98 43 69 48 04 56 62 00
 * 81 49 31 73 55 79 14 29 93 71 40 67 53 88 30 03 49 13 36 65
 * 52 70 95 23 04 60 11 42 69 24 68 56 01 32 56 71 37 02 36 91
 * 22 31 16 71 51 67 63 89 41 92 36 54 22 40 40 28 66 33 13 80
 * 24 47 32 60 99 03 45 02 44 75 33 53 78 36 84 20 35 17 12 50
 * 32 98 81 28 64 23 67 10 26 38 40 67 59 54 70 66 18 38 64 70
 * 67 26 20 68 02 62 12 20 95 63 94 39 63 08 40 91 66 49 94 21
 * 24 55 58 05 66 73 99 26 97 17 78 78 96 83 14 88 34 89 63 72
 * 21 36 23 09 75 00 76 44 20 45 35 14 00 61 33 97 34 31 33 95
 * 78 17 53 28 22 75 31 67 15 94 03 80 04 62 16 14 09 53 56 92
 * 16 39 05 42 96 35 31 47 55 58 88 24 00 17 54 24 36 29 85 57
 * 86 56 00 48 35 71 89 07 05 44 44 37 44 60 21 58 51 54 17 58
 * 19 80 81 68 05 94 47 69 28 73 92 13 86 52 17 77 04 89 55 40
 * 04 52 08 83 97 35 99 16 07 97 57 32 16 26 26 79 33 27 98 66
 * 88 36 68 87 57 62 20 72 03 46 33 67 46 55 12 32 63 93 53 69
 * 04 42 16 73 38 25 39 11 24 94 72 18 08 46 29 32 40 62 76 36
 * 20 69 36 41 72 30 23 88 34 62 99 69 82 67 59 85 74 04 36 16
 * 20 73 35 29 78 31 90 01 74 31 49 71 48 86 81 16 23 57 05 54
 * 01 70 54 71 83 51 54 69 16 92 33 48 61 43 52 01 89 19 67 48
 *
 * The product of these numbers is 26 × 63 × 78 × 14 = 1788696.
 *
 * What is the greatest product of four adjacent numbers in the same direction (up, down, left, right, or diagonally) in the 20×20 grid?
 *
 * @author Pedro Vicente Gómez Sánchez
 */
object LargestProductInAGrid {

  private val DIGIT_SIZE = 2

  def main(args: Array[String]) {
    Time.measure(println("Largest product in the grid is: " + getLargestProduct()))
  }

  private val numbers = "08022297381500400075040507785212507791084949994017811857608717409843694804566200814931735579142993714067538830034913366552709523046011426924685601325671370236912231167151676389419236542240402866331380244732609903450244753353783684203517125032988128642367102638406759547066183864706726206802621220956394396308409166499421245558056673992697177878968314883489637221362309750076442045351400613397343133957817532822753167159403800462161409535692163905429635314755588824001754243629855786560048357189070544443744602158515417581980816805944769287392138652177704895540045208839735991607975732162626793327986688366887576220720346336746551232639353690442167338253911249472180846293240627636206936417230238834629969826759857404361620733529783190017431497148868116235705540170547183515469169233486143520189196748"


  /**
   *
   * This method uses the grouped method to split the number sequence in a list of numbers of two digits mapped to Int after the group method.
   *
   * Once it has a list of numbers is going to generate a List[Int] of List[Int] that is going to act as matrix.
   *
   * @return largest product in the grid using any valid direction (|, -, /, \)
   */
  def getLargestProduct(): Int = {

    val listOfNumbers = numbers.grouped(2).map(_.toInt).toList
    val matrix = listOfNumbers.grouped(20).toList
    val products = new ListBuffer[Int]
    for (x <- 0 until 20; y <- 0 until 20) {
      products += getHorizontalProduct(matrix, x, y);
      products += getVerticalProduct(matrix, x, y);
      products += getDiagonalProductUp(matrix, x, y);
      products += getDiagonalProductBottom(matrix, x, y);
    }

    def getValueAt(matrix: List[List[Int]], x: Int, y: Int): Int = {
      if (matrix.isDefinedAt(x) && matrix(x).isDefinedAt(y)) matrix(x)(y)
      else 0
    }

    def getHorizontalProduct(matrix: List[List[Int]], x: Int, y: Int) = {
      val a = getValueAt(matrix, x, y)
      val b = getValueAt(matrix, x + 1, y)
      val c = getValueAt(matrix, x + 2, y)
      val d = getValueAt(matrix, x + 3, y)
      a * b * c * d
    }

    def getVerticalProduct(matrix: List[List[Int]], x: Int, y: Int) = {
      val a = getValueAt(matrix, x, y)
      val b = getValueAt(matrix, x, y + 1)
      val c = getValueAt(matrix, x, y + 2)
      val d = getValueAt(matrix, x, y + 3)
      a * b * c * d
    }

    def getDiagonalProductUp(matrix: List[List[Int]], x: Int, y: Int) = {
      val a = getValueAt(matrix, x, y)
      val b = getValueAt(matrix, x - 1, y - 1)
      val c = getValueAt(matrix, x - 2, y - 2)
      val d = getValueAt(matrix, x - 3, y - 3)
      a * b * c * d
    }

    def getDiagonalProductBottom(matrix: List[List[Int]], x: Int, y: Int) = {
      val a = getValueAt(matrix, x, y)
      val b = getValueAt(matrix, x + 1, y - 1)
      val c = getValueAt(matrix, x + 2, y - 2)
      val d = getValueAt(matrix, x + 3, y - 3)
      a * b * c * d
    }

    products.max
  }
}
