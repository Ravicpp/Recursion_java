import java.util.*;
public class CalcFactorial {
    public static int calcFactorials(int n){
        if(n ==1 || n ==0){
            return 1;
        }
            int fact_nm1 = calcFactorials(n-1);
            int fact_n = n * fact_nm1;
            return fact_n;
        }
    
    public static void main(String arg[]){
   int n =5;
   int ans = calcFactorials(n);
   System.out.println(ans);
    }

}
