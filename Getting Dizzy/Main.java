import math
n=int(input())
r=math.ceil(n/2)
x=[]
for i in range(n):
  s=list(map(int,input().split()))
  x.append(s)
for i in range(r):
  for j in range(i,n-i):
    print(x[i][j],end=" ")
  for j in range(i+1,n-i):
    print(x[j][n-i-1],end=" ")
  for j in range(n-i-2,i-1,-1):
    print(x[n-i-1][j],end=" ")
  for j in range(n-i-2,i,-1):
    print(x[j][i],end=" ")