import java.util.Scanner;
public class Solution
{
	public static void main(String[] args) {
	      Scanner input=new Scanner(System.in);
	      int start,end,total_odd_number;
	      start=input.nextInt();
	      end=input.nextInt();
	      if(start%2==0) start++;
	      if(end%2==0) end--;
	      total_odd_number=(end-start)/2+1;
	      System.out.println(total_odd_number);
	      
	}
}
