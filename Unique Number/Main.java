#include <stdio.h>
#include<stdbool.h>
int main()
{
  int l,u,i,count=0;
  scanf("%d%d",&l,&u);
  for(i=l;i<=u;i++)
  {
    int n=i,f=0;
    bool var[10]={false};
    while(n!=0)
    {
      int r=n%10;
      n=n/10;
      if(var[r]==true)
      {
        f=1;
      	break;
      }
      var[r]=true;
    }
    if(f==0)
      count++;
  }
  count>0 ? printf("%d",count):printf("No Unique Number");
  return 0;
}