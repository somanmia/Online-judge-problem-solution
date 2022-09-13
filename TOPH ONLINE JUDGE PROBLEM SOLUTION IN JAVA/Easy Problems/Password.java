import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int sl,cl,number,total_count,i;
        char ch;
        String str="";
        while(input.hasNext()){
            
            str=input.nextLine();
               sl=0;cl=0;total_count=0;number=0;
                for(i=0;i<str.length();i++){
                    ch=str.charAt(i);
                    if(ch>='a' && ch<='z'){
                        sl++;
                   
                    }else if(ch>='A' && ch<='Z'){
                        cl++;
                           
                    }else{
                          
                        number++;
                         
                    }
                    if(sl>0 && cl>0 && number>0){
                        total_count++;
                        
                        sl=0;cl=0;number=0;
                    }
                }
                System.out.println(total_count);
        }
    }
}
