namespace leetcode_net.Quest
{
    public class Solution
    {
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
    }
}
