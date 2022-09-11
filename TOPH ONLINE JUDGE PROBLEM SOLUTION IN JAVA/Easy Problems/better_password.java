import java.util.ArrayList;
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            String x=input.next();
            String str=x.substring(0,1).toUpperCase()+x.substring(1);
            char []array=str.toCharArray();
            for(int i=0;i<array.length;i++){
                if(array[i]=='s'){
                    System.out.print("$");
                }else if(array[i]=='i'){
                    System.out.print("!");
                }else if(array[i]=='o'){
                   System.out.print("()");
            }else{
                    System.out.print(array[i]);
                }
            }
           
          System.out.print(".\n");
    }
   
}
