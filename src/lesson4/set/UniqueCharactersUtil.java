package lesson4.set;

import java.util.HashSet;
import java.util.Set;

public class UniqueCharactersUtil {

    public static int amountOfUniqueDigits(int input[]) {
        Set<Integer> uniqueDigits = new HashSet<>();
        for (int j : input) {
            uniqueDigits.add(j);
        }
        return uniqueDigits.size();
    }
}
