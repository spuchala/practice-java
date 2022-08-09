package hashTables;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 * <p>
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 */

/**
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 */
public class GroupAnagrams {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getGroupedAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"})));
    }

    private static String[][] getGroupedAnagrams(String[] input) {
        Map<String, List<String>> map = new HashMap<>();

        for (String s : input) {
            String sorted = sort(s);
            var value = map.getOrDefault(sorted, new ArrayList<>());
            value.add(s);
            map.put(sorted, value);
        }
        return null;
    }

    private static String sort(String word) {
        char[] charArray = word.toCharArray();
        Arrays.sort(charArray);
        return Arrays.toString(charArray);
    }
}
