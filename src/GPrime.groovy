import groovy.transform.CompileStatic

/**
 * Created by pbartlett on 1/1/16.*/
@CompileStatic
class GPrime {
  int calculateHighestPrime(int max) {
    (max..3).find { int x -> (2..Math.sqrt(x)).every { x % it != 0 }  }
  }

  static List<Integer> getPrimes(int max) {
    (3..max).step(2).findAll {int x ->  (2..(int)Math.ceil(Math.sqrt(x))).every { int y -> x % y != 0 } }
  }
  // A version that doesn't use collections nor closures and is very like Java
  // This is the only way I have found to get Java speeds - no closures nor collections
  // Which isnt really Groovy
  static List<Integer> getPrimes2(int max) {

    def result = []

//    List<Integer> odds = (3..max).findAll { it % 2 }
//    List<Integer> odds = (3..max).step(2)

//    odds.each { x ->
//    (3..max).step(2).findAll {x ->
//    3.step(max, 2) { int x->
//    (3..max).step(2) { int x ->

    for (int x=3; x<=max; x+=2) {
      boolean isPrime = true
      for (int j = 2; j.doubleValue() <= Math.sqrt(x); j++) {
        if (x % j == 0) {
          isPrime = false
          break
        }
      }

      if (isPrime) {
        result << x
      }

//      isPrime

    }

    return result
  }

  // A version that doesn't use collections as much and is very like Java
  // This is the only way I have found to get Java speeds - no closures nor collections
  // Which isnt really Groovy
  static List<Integer> getPrimes3(int max) {

    (3..max).step(2).findAll { int x ->

      boolean isPrime = true
      for (int j = 2; j <= (Math.sqrt(x).intValue()); j++) {
        if (x % j == 0) {
          isPrime = false
          break
        }
      }

      isPrime
    }

  }


  }
