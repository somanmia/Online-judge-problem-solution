import java.util.Scanner;
public class Solution{
   public static void main(String[]args){
          Scanner input=new Scanner(System.in);
          int T,num,i,result,x;
          T=input.nextInt();
            for(i=0;i<T;i++){
                num=input.nextInt();
                x=num/4;
                result=x*x;
                System.out.println(result);
			}
   }
}
