#include<stdio.h>

int main()
{
int num,c;
scanf("%d",&num);
while(num>=1)
{
c=num;
while(c>=1)
{
printf("%d",c);
c--;
}
num--;
printf("\n");
}

return 0;
} 