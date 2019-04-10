#include<stdio.h>
int main()
{
 int length =6,breadth = 9,peri,area;
  peri = 2*(length+breadth);
  area = length*breadth;
  printf("The perimeter of the rectangle is: %d cm\nThe area of the rectangle is: %d sq cm",peri,area);
  return 0;
}