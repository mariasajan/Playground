def value(num):
  a=5
  an=4*num+1
  s=(num/2)*(a+an)
  return int(s)+1

t=int(input())
n=[]
for i in range(t):
  n.append(int(input()))
for el in n:
  print((value(el-1))%1000000007)