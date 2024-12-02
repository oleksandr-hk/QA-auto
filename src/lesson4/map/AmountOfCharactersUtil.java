package lesson4.map;

import java.util.HashMap;
import java.util.Map;

public class AmountOfCharactersUtil {

    public static Map<Character, Integer> amountOfCharacters(String input) {
        Map<Character, Integer> amountOfCharacters = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            if (amountOfCharacters.containsKey(input.charAt(i))) {
                amountOfCharacters.put(input.charAt(i), amountOfCharacters.get(input.charAt(i)) + 1);
            } else {
                amountOfCharacters.put(input.charAt(i), 1);
            }
        }
        return amountOfCharacters;
    }
}
