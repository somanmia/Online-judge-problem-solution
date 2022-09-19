#include <stdio.h>

int main() {
	int A,B,r,r2,count=0;
	scanf("%d %d",&A,&B);
	while(A!=0 || B!=0){
		r=A%10;//any number last digit found
		A=A/10;
		r2=B%10;//any number last digit found..
	    B=B/10;
		if(r+r2>9){ // carray count.....// 9 = carray 0, 11=carray=1//
			count++;// if carray found count++;
			
		}
	
		
	}
	if(count>0){ // if count 0<count, then carray number found and print Yes, if count==0, carray number not found than print No
			printf("Yes\n");
		}else{
			printf("No\n");
		}
	return 0;
}
