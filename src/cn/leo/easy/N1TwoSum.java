package cn.leo.easy;

import java.util.HashMap;
import java.util.Map;

public class N1TwoSum {

    public static void main(String[] args) {
        // [-1,-2,-3,-4,-5]
        // -8
        int[] nums = { -3, -2, -1, -5, -4 };
        int target = -8;

        int[] results = twoSum(nums, target);
        if (results == null||results.length<2) {
            System.out.println("can't find...");
            return;
        }
        System.out.println(String.format("(%d)+(%d)=%d", nums[results[0]],
                nums[results[1]], target));

    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.get(nums[i]) != null) {
                int[] result = { map.get(nums[i]), i };
                return result;
            }
            map.put(target - nums[i], i);
        }

        return new int[] {};
    }

}
