package problems.maps;

import java.util.Map;

public class Solution
{

    // 13. Roman to Integer
    public int romanToInt(String s) {

        Map<String, Integer> romanLetters = Map.of("I", 1,
                                                   "V", 5,
                                                   "X", 10,
                                                   "L", 50,
                                                   "C", 100,
                                                   "D", 500,
                                                   "M", 1000);

        int result = 0;
        int temporal = 0;
        int previous = 0;

        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);

            int value = romanLetters.get(String.valueOf(letter));

            if (value == previous) {
                temporal += value;
            } else if (value > previous) {
                temporal = value - previous;
            } else {
                result += temporal;
                temporal = value;
            }

            previous = value;
        }

        result += temporal;

        return result;
    }
}
