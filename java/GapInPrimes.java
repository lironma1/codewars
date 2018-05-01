import java.util.Arrays;

/**
 *
 * @author liron
 */
public class GapInPrimes {
    
    public static long[] gap(int g, long m, long n) {
        boolean flag = false;
        for(long i = m; i < n - g; i++){
            if(isPrime(i) && isPrime(i + g)){
                for(long j = i + 1; j < i + g; j++)
                    if(isPrime(j)){
                        flag = !flag;
                        break;
                     }
                if(!flag)
                    return new long[]{i, i + g };
            }
           flag = false;
        }
        return null;
    }
    
    private static boolean isPrime(long n) {
        if (n > 2 && n%2==0) return false;
        long end = (long)Math.sqrt(n) + 1;
        for (long i = 3; i < end; i+=2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
