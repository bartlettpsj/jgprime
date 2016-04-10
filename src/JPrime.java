import java.util.ArrayList;

/**
 * Created by pbartlett on 1/1/16.
 */
public class JPrime {
  public int calculateHighestPrime(int max) {

    // Is even the make lower odd so we can go down in 2's
    if (max % 2 == 0) max--;

    for (int i=max; i>2; i-=2) {
      boolean isPrime = true;

      for (int j=2; j<=Math.sqrt(i); j++) {
        if (i % j == 0 ) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        return i;
      }
    }

    return 0;
  }

  public ArrayList<Integer> getPrimes(int max) {
    ArrayList<Integer> result = new ArrayList<>();

    for (int i=3; i<= max; i+=2) {
      boolean isPrime = true;
      for (int j=2; j<=Math.sqrt(i); j++) {
        if (i % j == 0 ) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        result.add(i);
      }
    }

    return result;
  }


}
