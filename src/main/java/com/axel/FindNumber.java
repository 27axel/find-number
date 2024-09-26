package com.axel;

public class FindNumber {
    public static int findMissingNumber(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        for (int i = min; i < max; i++) {
            boolean found = false;
            for (int num : nums) {
                if (num == i) {
                    found = true;
                }
            }
            if (!found) {
                return i;
            }
        }

        return max + 1;
    }
}