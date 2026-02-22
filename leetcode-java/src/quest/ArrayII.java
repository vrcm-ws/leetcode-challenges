package quest;

import java.util.*;

public class ArrayII
{
    // Array II : Q1. Set Mismatch
    public int[] findErrorNums(int[] nums) {

        int n = nums.length;
        int[] numbers = new int[n + 1];
        int[] result = new int[2];

        for (int i : nums) {
            numbers[i]++;
        }

        for (int i = 1; i <= n; i++) {
            if (numbers[i] == 1) {
                continue;
            }

            if (numbers[i] == 0) {
                result[1] = i;
            }

            if (numbers[i] == 2) {
                result[0] = i;
            }
        }

        return result;

//        // -------------------------------------------------------------------
//        int n = nums.length;
//        int expectedSum = (n * (n + 1)) / 2;
//        int setSum = 0;
//        int arraySum = 0;
//        Set<Integer> set = new HashSet<>();
//
//        for (int i : nums) {
//            arraySum += i;
//            set.add(i);
//        }
//
//        for (int i : set) {
//            setSum += i;
//        }
//
//        return new int[] {arraySum - setSum, expectedSum - setSum};
//        // -------------------------------------------------------------------
    }

    // Array II : Q2. How Many Numbers Are Smaller Than the Current Number
    public int[] smallerNumbersThanCurrent(int[] nums) {

        //Brute force
        int[] result = new int[nums.length];
        int currentNumber = 0;

        for (int i = 0; i < nums.length; i++) {
            currentNumber = nums[i];

            for (int num : nums)
            {
                if (num < currentNumber)
                {
                    result[i]++;
                }
            }
        }

        return result;
    }
}
