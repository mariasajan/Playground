import math
n=int(input())
arr=list(map(int,input().split()))
b=[0]*n
avg=int(sum(arr)/n)
for i in range(0,n-1):
  b[i+1]=arr[i]+b[i]-avg
b.sort()
med=-b[int(n/2)]
val=0
for i in range(0,n):
  val=val+abs(b[i]+med)
print(val)