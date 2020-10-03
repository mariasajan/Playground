n=int(input())
lyr=input()
i,j=0,0
arr=[i for i in range(1,n+1)]
while(len(arr)>1):
  if(lyr[j]=='y'):
    arr.remove(arr[i])
    i=i-1
  i=(i+1)%len(arr)
  j=(j+1)%len(lyr)
print(arr[0])