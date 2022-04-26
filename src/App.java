import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        PrimeGenerator primeGen = new PrimeGenerator();
        var primes = primeGen.primeList(100, 500);
        System.out.println(primes);

        var semirp = new int[primes.size()];
        // reverse ArrayList
        for (int i = 0; i < primes.size(); i++) {

            semirp[i] = primes.get(semirp.length - i - 1);
        }

        System.out.println(Arrays.toString(semirp));
    }
}