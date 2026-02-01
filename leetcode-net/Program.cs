using leetcode_net.Quest;
using System.Diagnostics;

namespace leetcode_net
{
    internal class Program
    {
        static void Main(string[] args)
        {
            Solution solution = new Solution();

            int[] nums = { 1, 2, 1 };

            Console.WriteLine(String.Join(" ", solution.GetConcatenation(nums)));
        }
    }
}
