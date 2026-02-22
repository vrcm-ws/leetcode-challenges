import quest.ArrayI;
import quest.ArrayII;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayII solution = new ArrayII();

        int[] nums = { 6,5,4,8 };
        int n = 3;

        //System.out.println(Arrays.toString(solution.getConcatenation(nums)));
        //System.out.println(Arrays.toString(solution.shuffle(nums, n)));
        //System.out.println(Arrays.toString(solution.findErrorNums(nums)));
        System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums)));
    }
}
