package quest;

public class Solution
{
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
}
