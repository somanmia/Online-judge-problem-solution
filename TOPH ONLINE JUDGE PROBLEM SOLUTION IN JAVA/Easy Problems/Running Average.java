import java.util.Scanner;
public class Solution{
public static void main(String[] args){
	Scanner input=new Scanner(System.in);
	int i, T,num;
	double sum,avg;
	T=input.nextInt();
	sum=0;
	for(i=1;i<=T;i++){
		num=input.nextInt();
		sum=sum+num;
		avg=sum/i;
		System.out.println(avg);
	}
}
}
