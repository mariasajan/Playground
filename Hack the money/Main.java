#include <stdio.h>
int check(int tar,int curr)
{
  if(tar<curr)
    return 0;
  else if(tar==curr)
    return 1;
  else
  {
   if(check(tar,curr*10))
      return 1;
   else
      check(tar,curr*20);
  }
}

int main()
{
  int i,j,t;
  scanf("%d",&t);
  int n[t];
  for(i=0;i<t;i++)
  {
    scanf("%d",&n[i]);
  }
  for(i=0;i<t;i++)
  {
    j=check(n[i],1);
    (j==1) ? printf("Yes\n") : printf("No\n");
  }
  return 0;
}