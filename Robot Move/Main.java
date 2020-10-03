#include <stdio.h>
int total(int cr,int cc,int r,int c)
{
  if(cr==r && cc==c)
    return 1;
  else if(cr>r || cc>c)
    return 0;
  else
    return(total(cr,cc+1,r,c)+total(cr+1,cc,r,c));
}

int main()
{
  int m,n;
  scanf("%d%d",&m,&n);
  printf("%d",total(0,0,m-1,n-1));
}