import java.util.Scanner;
public class Main{
    static void raju_age(int x,int y){
        
      int  age=(y-x)/2+x;
        System.out.println(age);
        
    }
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        int x,y;
        x=input.nextInt();
        y=input.nextInt();
        raju_age(x,y);
    }
}
