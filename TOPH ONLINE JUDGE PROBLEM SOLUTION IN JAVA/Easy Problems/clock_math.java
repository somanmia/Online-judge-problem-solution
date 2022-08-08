import java.util.Scanner;
public class Solution {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int H,M,A,B;
		double sub_result,final_result;
		H=input.nextInt();
		M=input.nextInt();
		A=H*60;
		B=M*11;
		if(A>B){
			sub_result=(A-B)/2.0;
		}else{
			sub_result=(B-A)/2.0;
		}
		if(sub_result>180){
			final_result=360-sub_result;
				System.out.println(final_result);
		}else{
			final_result=sub_result;
			System.out.println(final_result);
		}
	}
}
