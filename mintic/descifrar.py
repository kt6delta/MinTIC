llave1=input()
llave2=input()
mensaje=input()
result=""


l1=0
l2=0
for men in mensaje:
  for L1 in llave1:
    if(L1==men):
      l1+=1
  for L2 in llave2:
    if(L2==men):
      l2+=1
  if(l1>l2):
    result=result+"-"
  if (l1==l2):
    result=result+"x"
  if (l1<l2):
    result=result+"."
print(result)