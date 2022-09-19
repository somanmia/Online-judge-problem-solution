import java.util.Scanner;
public class Solution{
public static void main(String[]args){
	Scanner input=new Scanner(System.in);
	int A,B,count=0,r,r2;
A=input.nextInt();
	B=input.nextInt();
	while(A!=0 || B!=0){
		r=A%10;
		A=A/10;
		r2=B%10;
		B=B/10;
		if(r+r2>9){
			count++;
		}
		
	}
	if(count>0){
		System.out.println("Yes");
	}else{
		System.out.println("No");
	}
}
}
