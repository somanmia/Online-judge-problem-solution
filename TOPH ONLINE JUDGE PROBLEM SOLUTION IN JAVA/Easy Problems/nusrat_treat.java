import java.util.Scanner;
public class Solution{
	public static void main(String[]args){
		Scanner input=new Scanner(System.in);
		int i,sum=0,N;
		N=input.nextInt();
		for(i=1;i<=N;i++){
			sum=sum+i;
		}
		System.out.println(sum);
	}
}
