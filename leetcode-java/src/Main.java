import quest.ArrayI;
import quest.ArrayII;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
        ArrayII solution = new ArrayII();

        int[] nums = { 1,1 };
        int n = 3;

        //System.out.println(Arrays.toString(solution.getConcatenation(nums)));
        //System.out.println(Arrays.toString(solution.shuffle(nums, n)));
        //System.out.println(Arrays.toString(solution.findErrorNums(nums)));
        //System.out.println(Arrays.toString(solution.smallerNumbersThanCurrent(nums)));
        System.out.println(solution.findDisappearedNumbers(nums));
    }
}
