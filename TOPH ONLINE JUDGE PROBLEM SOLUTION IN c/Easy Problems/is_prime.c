#include <stdio.h>
#include<math.h>
int main() {
	int SNS,ck=0,i,j,root;
	scanf("%d",&SNS);
	root=sqrt(SNS);
	for(i=2;i<=root;i++){
	    if(SNS%i==0){
	        ck++;
	    }
	}if(ck==0){
	    printf("Yes\n");
	}else{
	    printf("No\n");
	}
	return 0;
}
