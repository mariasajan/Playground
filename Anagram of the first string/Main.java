s1=input()
s2=input()
f=0
if(len(s1)==len(s2)):
  n=len(s1)
  for i in range(n):
    if(s2[i] in s1):
      continue
    else:
      f=1
      break
else:
  f=1
print("Anagram") if(f==0) else print("Not anagrams")
    