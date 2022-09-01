import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int N,i,fact=1;
		N=input.nextInt();
			for(i=2;i<=N;i++){
			   fact=fact*i;
			   fact=fact%10000;
			}
		System.out.println(fact);
		
	}
}
