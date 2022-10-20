import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) {
	   Scanner input=new Scanner(System.in);
	   int T,i,ck=0;
	   long sum,end;
	   T=input.nextInt();
	   for(i=0;i<T;i++){
	       end=input.nextInt();
	       sum=end*end;
	       ck++;
	       System.out.printf("Case %d: %d\n",ck,sum);
	   }
	}
}
