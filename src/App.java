import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        PrimeGenerator primeGen = new PrimeGenerator();
        var primes = primeGen.primeList(100, 500);
        System.out.println(primes);

        var semirp = new int[primes.size()];
        // reverse
        for (int i = 0; i < primes.size(); i++) {

            semirp[i] = primes.get(semirp.length - i - 1);
        }

        System.out.println(Arrays.toString(semirp));

        MultiplicationTable table = new MultiplicationTable();
        table.print();
        System.out.println("");
        table.print(40);

        System.out.println("");
        table.print(7, 30);
        System.out.println("");
        table.print(99, 60, 80);

    }
}