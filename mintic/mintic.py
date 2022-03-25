genero= input("ingrese M o H: ")
genero=genero.strip()
genero=genero.split()
repit= len(genero)
guarda=0
conta=0
oneB=True
sol=""
solN=""
for i in range(repit):
  one=True
  if(genero[0]=="M"):
   	M = True
  else:
   	M = False

  for i in genero:
    if (not M):
      if(i == "H" and one):
        conta += 1
      if (i == "M" and one):
        sol=sol+"H "
        solN=solN+str(conta)+" "
        guarda=conta
        conta = 0
        one=False
        break

    if (M):
      if (i == "M" and one):
        conta += 1
      if (i == "H" and one):
        sol=sol+"M "
        solN=solN+str(conta)+" "
        guarda=conta
        conta=0
        one=False
        break
  
  for l in range(guarda):
    if len(genero)>1 and (not one):
      genero.pop(0)
    else:
      if genero.count("H")!=0 and oneB:
        sol=sol+"H"
        solN=solN+str(genero.count("H"))+" "
        oneB=False
      if genero.count("M")!=0 and oneB:
        sol=sol+"M"
        solN=solN+str(genero.count("M"))+" "
        oneB=False
print(sol)
print(solN)