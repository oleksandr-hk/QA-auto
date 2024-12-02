package lesson4.list;

import java.util.List;

public class ListUtil {

    public static List<Integer> getEvenNumbers(List<Integer> numbers) {
        return numbers.stream().filter(number -> number / 2 != 0).toList();
    }
}
