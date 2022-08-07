import java.util.Scanner;
class Solution {
    public static void main(String[] args) {
       Scanner input=new Scanner(System.in);
       int row,col,n;
       n=input.nextInt();
       for(row=1;row<=n;row++){
           for(col=1;col<=n-row;col++){
               System.out.print(" ");
           }
           for(col=1;col<=row;col++){
               if(row==col){
                   System.out.print("*");
               }else{
                   System.out.print("* ");
               }
              
           } System.out.print("\n");
       }
    }
}
