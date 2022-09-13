#include<stdio.h>
#include<string.h>
int main(){
int i,sl,ca,number,total_count;
char ch[101];
while(scanf("%s",ch)!=EOF){
    sl=0,ca=0,number=0,total_count=0;
    for(i=0;i<strlen(ch);i++){

         if(ch[i]>='a' && ch[i]<='z'){
           sl++;
         }else if(ch[i]>='A' && ch[i]<='Z'){
            ca++;
         }else{
            number++;
         }
         if(sl>0 && ca>0 && number>0){
            ++total_count;
            ca=0;sl=0;number=0;

         }
    }
    printf("%d\n",total_count);
}



return 0;}
