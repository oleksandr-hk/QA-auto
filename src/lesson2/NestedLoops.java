package lesson2;

public class NestedLoops {

    /**
     * 1 x 1 = 1
     * 1 x 2 = 2
     * ...
     * 10 x 10 = 100
     */
    public static void printMultiplicationTable() {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%d * %d = %d%n", i, j, i*j);
            }
        }
    }

    /**
     * ****
     * ****
     * ****
     */
    public static void printSquare(int length) {
        for (int i = 1; i <= length; i++) {
            for (int j = 1; j <= length; j++) {
                System.out.print("*");
                if (length == j) System.out.println();
            }
        }
    }

    public static void printOddNumbers(int input) {
        for (int i = 2; i <= input; i++) {
            boolean isOdd = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isOdd = false;
                    break;
                }
            }
            if (isOdd) {
                System.out.println(i);
            }
        }
    }

    public static void printChessBoard(int boardSize) {
        for (int i = 1; i <= boardSize; i++) {
            for (int j = 1; j <= boardSize; j++) {
                System.out.print("#");
                if (boardSize == j) System.out.println();
            }
        }
    }
}
