using leetcode_net.Quest;
using System.Diagnostics;

namespace leetcode_net
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Solution solution = new Solution();

            int[] outputArray;
            int output;

            int[] nums = { 1, 1, 0, 1, 1, 1 };
            int n = 3;

            //A1 - Q1
            //outputArray = solution.GetConcatenation(nums);

            //A1 - Q2
            //outputArray = solution.Shuffle(nums, n);

            //A1 - Q3
            output = solution.FindMaxConsecutiveOnes(nums);

            //Console.WriteLine(string.Join(" ", outputArray));
            Console.WriteLine(output.ToString());
        }
    }
}
