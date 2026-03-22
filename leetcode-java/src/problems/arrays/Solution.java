package problems.arrays;

import java.util.HashMap;
import java.util.Map;

public class Solution
{
    // 283. Move Zeroes
    public void moveZeroes(int[] nums) {

        int j = 0;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (num != 0) {
                nums[i] = nums[j];
                nums[j] = num;
                j++;
            }
        }
    }
}
