#include <stdio.h>
int main() {
	int n, r,t,sum,count = 0;
  scanf("%d",&n);
  t = n;
  r = t%10;
  while(t > 0)
  {
    t = t/10;
    count++;
  }
  while(count-1 > 0)
  {
    n = n/10;
    count--;
  }
  n = n%10;
  sum = r + n;
  printf("%d",sum);
	return 0;
}