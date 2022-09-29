import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int T;
        double s,area,a,b,c;
        T=input.nextInt();
        for(int i=0;i<T;i++){
             a=input.nextDouble();
              b=input.nextDouble();
               c=input.nextDouble();
            if((a+b)>=c && (a+c)>=b && (b+c)>=a){   
                s=(a+b+c)/2;
                area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
                System.out.printf("%.2f\n",area);
        }else{
                System.out.println("Oh, No!");
            }
    }
}
}
