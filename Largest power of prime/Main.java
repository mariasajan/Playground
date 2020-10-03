
t=int(input())
for i in range(t):
  n,p=input().split()
  n=int(n)
  p=int(p)
  x=0
  while(n!=0):
    n=n//p
    x+=n
  print(x)
  
      