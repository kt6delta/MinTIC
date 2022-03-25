r=int(input("ingrese numero de gotas de ron:"))
a=2*r+4
j=int((a+r)/5)
print(r,a,j)
print()
if(j<=20):
  print("uno")
if(20<j and j<=30):
  print("dos")
if(30<j and j<=50):
  print("tres")
if(j>50):
  print("cuatro")