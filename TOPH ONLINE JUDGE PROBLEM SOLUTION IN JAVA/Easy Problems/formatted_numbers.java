import java.util.ArrayList;
import java.util.Scanner;
public class Solution{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        String str=input.next();
        int ck=0,j=0;char k;
        ArrayList<Character>ch=new ArrayList<>();
        for(int i=str.length()-1 ;i>=0;i--){

            k=str.charAt(i);
                    if(j==3){
                     ch.add(ck++,',');
                     ch.add(ck++,k);
                   j=0;
          }else{
                  ch.add(ck++,k);
                    }
                    j++;
        }
        for(int m=ch.size()-1;m>=0;m--){
            System.out.print(ch.get(m));
        }
        System.out.println("");
        
    }
}
