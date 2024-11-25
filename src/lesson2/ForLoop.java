package lesson2;

public class ForLoop {
    /**
     * 3 x 1 = 3
     * 3 x 2 = 6
     * ...
     * 3 x 10 = 30
     */
    public static void printMultiplicationTable (int multiplier) {
        for (int i = 1; i <= multiplier; i++) {
            System.out.printf("%d * %d = %d", multiplier, i, multiplier * i);
            System.out.println();
        }
    }

    public static long factorial(int factorial) {
        long result = 1;
        for (int i = 1; i <= factorial; i++) {
            result = result * i;
        }
        return result;
    }

    public static void printEvenNumbers(int limit) {
        for (int i = 1; i <= limit; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
