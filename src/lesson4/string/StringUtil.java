package lesson4.string;

import java.util.Arrays;

public class StringUtil {


    public static String reverseString(String input) {
        char stringArray[] = input.toCharArray();
        for (int i = 0; i < stringArray.length / 2; i++) {
            char tmp = stringArray[i];
            stringArray[i] = stringArray[stringArray.length - 1 - i];
            stringArray[stringArray.length - 1 - i] = tmp;
        }
        return String.valueOf(stringArray);
    }
}
