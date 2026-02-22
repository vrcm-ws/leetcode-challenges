package quest;

public class ArrayI
{
    // Array I : Q1. Concatenation of Array
    public int[] getConcatenation(int[] nums)
    {
        int length = nums.length;
        int[] output = new int[length * 2];

        for (int i = 0; i < length; i++)
        {
            output[i] = nums[i];
            output[i + length] = nums[i];
        }

        return output;
    }

    // Array I : Q2. Shuffle the Array
    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[2 * n];

        for (int i = 0; i < n; i++) {

            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[i + n];
        }

        return result;
    }

    // Array I : Q3. Max Consecutive Ones
    public int findMaxConsecutiveOnes(int[] nums) {

        int result = 0;
        int currentCount = 0;

        for (int number : nums) {

            if (number == 1) {

                currentCount++;

                if (currentCount > result) {
                    result = currentCount;
                }
            }
            else {
                currentCount = 0;
            }
        }

        return result;
    }
}
