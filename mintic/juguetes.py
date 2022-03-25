def Productos(A):#sin repetir
  A=dict(zip(A, range(len(A))))
  A=list(A.keys())
  return(A)

def Faltante (L, M, N):
  num=0
  L=[]
  for i in M:
    if(i==N):
      L.append(num)
    num+=1
  return(L)

def TeFaltan (L1, L2):
  L3=L1+L2
  L3=Productos(L3)
  for j in L2:
    L3.remove(j)
  return(L3)

def Intercambiemos(L1, L2):
  FaltaL2=TeFaltan(L1,L2)
  FaltaL1=TeFaltan(L2,L1)
  if len(FaltaL2)<len(FaltaL1):
    num=len(FaltaL2)
    l=0
    for i in FaltaL2:
      if(l<num):
        L2.append(i)
        l+=1
    l=0
    for i in FaltaL1:
      if(l<num):
        L1.append(i)
        l+=1
  else:
    num=len(FaltaL1)
    l=0
    for i in FaltaL2:
      if(l<num):
        L2.append(i)
        l+=1
    l=0
    for i in FaltaL1:
      if(l<num):
        L1.append(i)
        l+=1

