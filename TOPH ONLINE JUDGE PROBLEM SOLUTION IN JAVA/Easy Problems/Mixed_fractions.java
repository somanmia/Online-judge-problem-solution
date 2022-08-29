import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int num1,num2,x,y;
		num1=input.nextInt();
		num2=input.nextInt();
		x=num1/num2;
		y=num1%num2;
		System.out.printf("%d %d %d\n",x,y,num2);
	}
}
