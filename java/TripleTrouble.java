/**
 *
 * @author liron
 */
public class TripleTrouble {
    
    public static int TripleDouble(long num1, long num2) {
        String str1 = String.valueOf(num1);
        String str2 = String.valueOf(num2);
        
        for(int i = 0; i < str1.length(); i++){
            char ch = str1.charAt(i);
            if(str1.contains(new String(new char[]{ch, ch, ch})) &&
                    str2.contains(new String(new char[]{ch, ch})))
                return 1;
        }
        return 0;
    } 
    
}
