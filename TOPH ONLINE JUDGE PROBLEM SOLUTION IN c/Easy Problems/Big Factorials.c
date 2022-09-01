#include<stdio.h>
int main(){
    int N,i,fact=1;
	scanf("%d",&N);
	for(i=2;i<=N;i++){
		fact=fact*i;
		fact=fact%10000;
	}
	 printf("%d\n",fact);
	return 0;
}
