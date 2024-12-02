package lesson4.array;

public class ArraysUtil {
    public static int total(int [] input) {
        int total = 0;
        for (int i: input) {
            total = total + i;
        }
        return total;
    }
}
