#include<stdio.h>
int main()
{
  int n=365,d=4,q,r;
  q=n/d;
  r = n%d;
  printf("Quotient: %d\nRemainder: %d",q,r);
  return 0;
}