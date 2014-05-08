package com.github.pedrovgs.time

/**
 *
 * Contains some util methods used to measure the time spent to execute one function.
 *
 * @author Pedro Vicente Gómez Sánchez.
 */
object Time {

  def measure(f: => Unit) = {
    val start = System.nanoTime()
    f
    println("Time spent: " + (System.nanoTime() - start) + " ns")
  }

}
