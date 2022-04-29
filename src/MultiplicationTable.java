public class MultiplicationTable {
    void print() {
        print(5);
    }

    void print(int table) {
        print(5, 1, 10);
    }

    void print(int table, int min) {
        print(table, min, 10);
    }

    void print(int table, int min, int max) {
        for (int i = min; i < max; i++) {
            System.out.printf("%d times %d equals %d", table, i, table * i).println();
        }
    }
}