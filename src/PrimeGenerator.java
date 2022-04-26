import java.util.ArrayList;

public class PrimeGenerator {

  boolean checkPrime(int x) {
    int end = x;
    int factors = 0;
    for (int i = 1; i <= end; i++) {
      if (end % i == 0) {
        factors++;
      }
    }
    if (factors <= 2) {
      return true;
    } else {
      return false;
    }
  }

  ArrayList<Integer> primeList(int min, int max) {
    ArrayList<Integer> primes = new ArrayList<Integer>();

    for (min++; min < max; min++) {
      if (checkPrime(min) == true) {
        primes.add(min);
      }
    }
    return primes;
  }
}
