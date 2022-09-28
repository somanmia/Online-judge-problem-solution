import java.util.Scanner;
public class Solution{
static long result(int n){
  long sum=0,i;
   
  for(i=1;i<=n;i++){
           sum+=i*i;
  }
  return sum;
}
public static void main(String[]args){
  Scanner input=new Scanner(System.in);
  int n=input.nextInt();
 long finalresult=result(n);
 System.out.println(finalresult);
}
}
