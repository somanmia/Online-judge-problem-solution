import java.util.Scanner;
public class Solution{
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int N,A,B,sum;
        N=input.nextInt();
        A=input.nextInt();
        B=input.nextInt();
        int array[]=new int[N];
        for(int i=0;i<N;i++){
            array[i]=input.nextInt();
        }
        sum=0;
        for(int j=A;j<=B;j++){
            sum+=array[j];
            
        }
        System.out.println(sum);
    }
}
