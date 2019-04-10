#include <stdio.h>
int main() {
	int n, r,t,count = 0;
  scanf("%d",&n);
  t = n;
  while(t > 0)
  {
    t = t/10;
    count++;
  }
  while(count-2 > 0)
  {
    n = n/10;
    count--;
  }
  n = n%10;
  printf("%d",n);
	return 0;
}