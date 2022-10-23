import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
       	int T;
	    long i,j,num,x,M;
	    T=input.nextInt();
	    for(i=0;i<T;i++){
	        num=input.nextLong();
	        x=(int)Math.sqrt(num);
	        M=x*x;
	        if(M==num){
	        
	               int ck=0;
	        if(x<2){
	            ck++;
	        }
	        for(j=2;j<=Math.sqrt(x);j++){
	            if(x%j==0){
	                ck++;
	                break;
	            }
	        }if(ck==0){
	            System.out.println("YES.");
	        }else{
	            System.out.println("NO.");
	        }
	        }else{
				System.out.println("NO.");
			}
	    }

}
}
