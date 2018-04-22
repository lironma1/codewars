/**
 *
 * @author liron
 * Given an array of numbers, determine whether the sum of all the numbers is 
 * odd or even.
 */
public class OddOrEven {
    public static String oddOrEven(int[] array)
    {
        int sum = 0;
        for(int num : array)
            sum +=num;
        return sum%2 == 0 ? "even" : "odd";
    }
}
