s=input()
p=int(input())
d=input()
p=p%len(s)
r=""
if(d=='L'):
  r=r+s[p:]+s[:p]
else:
  r=r+s[-p:]+s[0:-p]
print(r)
    