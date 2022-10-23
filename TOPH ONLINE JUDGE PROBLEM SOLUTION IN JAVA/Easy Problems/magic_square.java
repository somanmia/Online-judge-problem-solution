import java.util.Scanner;
public class Main{
    static long magic_square(int num){
        int n=num;
        long result;
        result=n*(n*n+1)/2;
       return result;
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int T,num,ck=0;
        T=input.nextInt();
        for(int i=0;i<T;i++){
            num=input.nextInt();
           long result=  magic_square(num);
           ck++;
           System.out.printf("Case %d: %d\n",ck,result);
        }
    }
}
