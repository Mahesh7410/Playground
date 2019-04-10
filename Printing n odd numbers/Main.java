#include <stdio.h>
int main() {
	int n,i,c = 0;
  scanf("%d",&n);
  for(i=0;i<=2*n;i++)
  {
    if(i%2 != 0)
    printf("%d\n",i);
  }
	return 0;
}