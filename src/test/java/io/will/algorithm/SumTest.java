package io.will.algorithm;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
    // input: nums = [2,7,11,15], target = 9
    // output: [0, 1]
    @Test
    public void testFourElements() {
        int[] nums = {2,7,11,15};
        int target = 9;

        int[] results = sum(nums, target);
        assertEquals(0, results[0]);
        assertEquals(1, results[1]);
    }

    // input: nums = [3,2,4], target = 6
    // output: [1, 2]
    @Test
    public void testThreeElements() {
        int[] nums = {3, 2, 4};
        int target = 6;

        int[] results = sum(nums, target);
        assertEquals(1, results[0]);
        assertEquals(2, results[1]);
    }

    // input: nums = [3,3], target = 6
    // output: [0, 1]
    @Test
    public void testStart() {
        int[] nums = {3, 3};
        int target = 6;

        int[] results = sum(nums, target);
        assertEquals(0, results[0]);
        assertEquals(1, results[1]);
    }

    private int[] sum(int[] nums, int target) {
        for (int firstIndex = 0; firstIndex < nums.length - 1; firstIndex++) {
            for (int secondIndex = firstIndex + 1; secondIndex < nums.length; secondIndex++) {
                if (nums[firstIndex] + nums[secondIndex] == target) {
                    return new int[]{firstIndex, secondIndex};
                }
            }
        }
        return null;
    }
}
