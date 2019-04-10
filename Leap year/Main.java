#include<stdio.h>
int main()
{
  int yr;
  scanf("%d",&yr);
  
  if(yr%4 ==0){
    printf("Leap year");
  }
  else{
    printf("Not Leap year");
  }
  
  return 0;
}