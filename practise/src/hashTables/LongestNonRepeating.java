package hashTables;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Given a string s, find the length of the longest substring without repeating characters.
 * Input: s = "abcabcbb"
 * Output: 3
 * Explanation: The answer is "abc", with the length of 3.
 */
public class LongestNonRepeating {
    public static void main(String[] args) {
        System.out.println(getLongestNonRepeatingSubstring("abcabcbb"));
    }

    private static int getLongestNonRepeatingSubstring(String input) {
        List<Integer> longestLengths = new ArrayList<>();
        int longestSequence = 0;
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j < input.length() - i; j++) {
                for (int k = i; k < j; k++) {
                    if (input.charAt(k) != input.charAt(j)) {
                        longestSequence++;
                    } else {
                        longestLengths.add(longestSequence);
                        break;
                    }
                }
            }
        }
        return Collections.max(longestLengths);
    }
}
