#include <stdio.h>

int main() {
	int T,i,num;
	double avg,sum;
	
		scanf("%d",&T);
sum=0;
	for(i=1;i<=T;i++){
		scanf("%d",&num);
		sum=sum+num;
		avg=sum/i;
	   printf("%lf\n",avg);
	}
	return 0;
}
