import java.util.Scanner;

public class Solution{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int i,j,sum,sum2,result,M,N,x;
        N=input.nextInt();
        M=input.nextInt();
        sum=0;
        for(i=1;i<=N;i++){
             sum+=i;
        }
       
        sum2=0;
        for(j=1;j<=M;j++){
            x=input.nextInt();
            sum2+=x;
        }
        result=sum-sum2;
        System.out.println(result);
        
        
    }
}
