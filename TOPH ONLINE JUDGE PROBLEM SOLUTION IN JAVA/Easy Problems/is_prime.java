import java.math.*;
import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
      Scanner in=new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
     if(n.isProbablePrime(1)){
         System.out.println("Yes");
     }else{
         System.out.println("No");
     }
    }
}
