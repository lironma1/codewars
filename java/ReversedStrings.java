/**
 *
 * @author liron
 * ReversedStrings: reverses the string value passed into it.
 */
public class ReversedStrings {
    
    public static String solution(String str) {
        String temp= "";
        for(int i = str.length() - 1; i >= 0; i--)
        {
            temp += str.charAt(i);
        }
        return temp;
    }
    
    public static String solution2(String str)
    {
        StringBuilder input1 = new StringBuilder();
        input1.append(str);
        input1.reverse();
        return input1.toString();
    }
}
