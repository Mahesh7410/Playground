#include <stdio.h>
int main() {
	int n,n1,d,i,sum=0,pf;
  scanf("%d",&n);
  d = n;
  while(n!=0)
  {
    n1 = n%10;
    pf = 1;
    for(i = 1;i<=n1;i++)
  	{
     pf= pf*i;
  	}
    sum += pf;
    n = n/10;
  }
  if(sum == d)
  {
    printf("Yes");
  }
  else
  {
   printf("No");
  }
  return 0;
}