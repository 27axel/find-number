package com.axel;

public class FindNumber {

    /**
     * Method to find the first missing number in a sequence.
     *
     * @param nums an array of sequential numbers with one missing number
     * @return the first missing number, or max + 1 if no numbers are missing
     */
    public static int findMissingNumber(int[] nums) {
        // Check if the input array is null or empty.
        // In such a case, return 0 as there are no numbers that could be missing.
        if (nums == null || nums.length == 0) {
            return 0;
        }

        // Variables to store the minimum and maximum values in the array.
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Iterate through the nums array to find the minimum and maximum values.
        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Search for the missing number in the range between the minimum and maximum values.
        for (int i = min; i < max; i++) {
            boolean found = false;  // Flag indicating whether the current number exists in the array

            // Inner loop to check if the number i is present in the nums array
            for (int num : nums) {
                if (num == i) {
                    found = true;  // If the number is found, mark it and break the inner loop
                    break;
                }
            }

            // If number i is not found, return it as the missing number
            if (!found) {
                return i;
            }
        }

        // If no missing number is found in the range min..max, return max + 1
        // This means the sequence of numbers was complete.
        return max + 1;
    }
}