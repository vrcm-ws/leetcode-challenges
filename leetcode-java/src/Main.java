import quest.Solution;
import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        Solution solution = new Solution();

        int[] nums = { 1,1,0,1,1,1 };
        int n = 3;

        //System.out.println(Arrays.toString(solution.getConcatenation(nums)));
        //System.out.println(Arrays.toString(solution.shuffle(nums, n)));

        System.out.println(solution.findMaxConsecutiveOnes(nums));
    }
}
