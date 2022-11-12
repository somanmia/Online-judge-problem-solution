
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
public class union_problem_solve {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int N,M;
       N=input.nextInt();
       M=input.nextInt();
       HashSet s = new HashSet();
 
       int arr[]=new int[M];
       int arr2[]=new int[N];
       
       for(int i=0;i<M;i++){
           arr[i]=input.nextInt();
       }
       for(int j=0;j<N;j++){
           arr2[j]=input.nextInt();
           
       }
     for(int i=0;i<arr.length;i++){
         s.add(arr[i]);
     }
     for(int j=0;j<arr2.length;j++){
          s.add(arr2[j]);
     }
         
     
    ArrayList<Integer>list=new ArrayList<>();
    list.addAll(s);
    Collections.sort(list);
    System.out.print(list.get(0));
    for(int i=1;i<list.size();i++){
        System.out.print(" "+list.get(i));
    }
        System.out.println("");
    }
    
}
