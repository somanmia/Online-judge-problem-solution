import java.util.Scanner;
public class Solution{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int T,n1,n2,n3,n4,n5,n6,m1,m2,m3,m4,m5,m6,r_bill,payment,total_bill,count=0,a=1;
        T=input.nextInt();
        while(a<=T){
                n1=input.nextInt();
                n2=input.nextInt();
                n3=input.nextInt();
                n4=input.nextInt();
                n5=input.nextInt();
                n6=input.nextInt();
               r_bill=n1+n2+n3+n4+n5+n6;
               payment=input.nextInt();
              
               m1=input.nextInt();
               m2=input.nextInt();
               m3=input.nextInt();
               m4=input.nextInt();
               m5=input.nextInt();
               m6=input.nextInt();
            
               
               
               total_bill=(m1+m2+m3+m4+m5+m6)-(payment-r_bill);
              count++;
			if(total_bill>0){
              System.out.printf("Case %d: %d\n",count,total_bill);
			}else{
				System.out.printf("Case %d: 0\n",count);
			}
				a++;
            
        }
    }
}
