def prime(l,u):
  arr=[]
  for var in range(l,u+1):
    f=0
    for i in range(2,int(var/2+1)):
      if(var%i==0):
        f=1
        break
      i+=1
    if(f==0):
      arr.append(var)
  return(arr)

l=int(input())
u=int(input())
count=0
p=prime(l,u)
for var in (p):
  if((var+6) in p):
    count+=1
print(count) if count>0 else print("No Prime Pairs")