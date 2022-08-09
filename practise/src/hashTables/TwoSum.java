package hashTables;

import java.util.Arrays;

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 * Input: nums = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
 */
public class TwoSum {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getTwoSum(new int[]{2, 7, 11, 15}, 9)));
    }

    public static int[] getTwoSum(int[] input, int target) {
        int[] map = new int[256];
        for (int i = 0; i < 256; i++) {
            map[i] = -1;
        }
        for (int i = 0; i < input.length; i++) {
            map[input[i]] = i;
        }

        for (int i = 0; i < input.length; i++) {
            int leftOver = target - input[i];
            if (map[leftOver] != -1) {
                return new int[]{i, map[leftOver]};
            }
        }
        return null;
    }
}
