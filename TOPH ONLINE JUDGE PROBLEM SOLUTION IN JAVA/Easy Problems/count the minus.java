import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str="";char ch;
        int count=0;  
      
        while(input.hasNext()){
              str=input.next();
              
        for(int i=0;i<str.length();i++){
                 ch=str.charAt(i);
                  if(ch=='m'){
                      count++;
     
  
        }
        }
    }
            System.out.println(count);
            
    }
}
