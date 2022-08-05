#include<stdio.h>
int main(){
  int i,SAS;
	scanf("%d",&SAS);
	for(i=1;i<=SAS;i++){
		if(SAS%i==0){
			printf("%d\n",i);
		}
	}

	return 0;
}