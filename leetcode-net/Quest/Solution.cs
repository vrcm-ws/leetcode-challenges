namespace leetcode_net.Quest
{
    public class Solution
    {
        //Array I - Q1. Concatenation of Array
        public int[] GetConcatenation(int[] nums)
        {
            int listLength = nums.Length;
            int[] output = new int[listLength * 2];

            for(int i = 0; i < listLength; i++)
            {
                output[i] = nums[i];
                output[listLength + i] = nums[i];
            }

            return output;
        }

        //Array I - Q2. Shuffle the Array
        public int[] Shuffle(int[] nums, int n)
        {
            int[] output = new int[n * 2];

            for (int i = 0; i < n; i++)
            {
                output[i * 2] = nums[i];
                output[i * 2 + 1] = nums[i + n];
            }

            return output;
        }

        //Array I - Q3. Max Consecutive Ones
        public int FindMaxConsecutiveOnes(int[] nums)
        {
            int max_ocurrence = 0;
            int current_ocurrence = 0;

            foreach(int num in nums)
            {
                if (num == 1)
                {
                    current_ocurrence += 1;
                }
                else
                {
                    if (current_ocurrence > max_ocurrence)
                    {
                        max_ocurrence = current_ocurrence;
                    }

                    current_ocurrence = 0;
                }
            }

            return Math.Max(max_ocurrence, current_ocurrence);
        }
    }
}
