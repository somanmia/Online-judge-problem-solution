#include<stdio.h>
int main(){
    int N,A,B,sum;
    scanf("%d %d %d",&N,&A,&B);
    int arr[N];
    for(int i=0;i<N;i++){
        scanf("%d",&arr[i]);
        
    }
    sum=0;
    for(int j=A;j<=B;j++){
        sum+=arr[j];
    }
    printf("%d\n",sum);
    return 0;
}
