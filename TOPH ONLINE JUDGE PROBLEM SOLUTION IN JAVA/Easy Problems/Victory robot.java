import java.util.Scanner;
public class robot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int T,num;
        T=input.nextInt();
        for(int i=0;i<T;i++){
            num=input.nextInt();
            if(num==1971){
                System.out.println("Joy Bangla");
            }else{
                if(num%2==0){
                    System.out.println("Bangla");
                }else{
                    System.out.println("Joy");
                }
            }
        }
    }
}
