import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int n,sum=0;
        while(input.hasNextInt()){
            n=input.nextInt();
            sum+=n;
        }
        System.out.println(sum);
    }
}
