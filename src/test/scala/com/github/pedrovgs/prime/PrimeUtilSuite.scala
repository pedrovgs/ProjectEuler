package com.github.pedrovgs.prime

import org.scalatest.FunSuite

/**
 *
 * @author Pedro Vicente Gómez Sánchez
 */
class PrimeUtilSuite extends FunSuite {

  test("2 is prime") {
    assert(PrimeUtil.isPrime(2))
  }

  test("4 is not prime") {
    assert(!PrimeUtil.isPrime(4))
  }

  test("7 is prime") {
    assert(PrimeUtil.isPrime(7))
  }

  test("10 is not prime") {
    assert(!PrimeUtil.isPrime(10))
  }

  test("7919 is prime") {
    assert(PrimeUtil.isPrime(7919))
  }

  test("10472 is not prime") {
    assert(!PrimeUtil.isPrime(10472))
  }

  test("104729 is prime") {
    assert(PrimeUtil.isPrime(104729))
  }

}
