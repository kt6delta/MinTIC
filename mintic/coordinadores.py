import json as js
data=input("key coordinador , #ventas")
data= js.loads(data)
key=input("coordinadores ")
key=key.split()
keysdata=[]
for i in data.keys():
  keysdata.append(i)
soluL=""
soluN=0
for i in key:
  for j in keysdata:
    if(i==j):
      soluL+=i+" "
      soluN+=data.pop(i)

print(soluN,"\n")
print(soluL)