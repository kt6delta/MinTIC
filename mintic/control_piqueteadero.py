def pedidos (picadas): #def pedidos
    lista_tipo_picadas_clientes_pidieron =[]
 
    for ordenes in picadas:
        if ordenes not in lista_tipo_picadas_clientes_pidieron: # Ordenes pedidos
            lista_tipo_picadas_clientes_pidieron.append(ordenes)
 
    return lista_tipo_picadas_clientes_pidieron # Listo
 

    # print("PROBANDO RETO5 JLOO")

def alimentos_que_faltan_por_categoria (lista_cod_alim_falt_admin, lista_cate_all_alim, lista_cate_alim_neces):
  listacod_falt_cat_indico= []
 
  for elementos in lista_cod_alim_falt_admin:
    if lista_cate_all_alim [elementos] == lista_cate_alim_neces:
      listacod_falt_cat_indico.append(elementos)
 
  return listacod_falt_cat_indico
 
#print (alimentos_que_faltan_por_categoria([0,3,6,9], ['alto','bajo','bajo','bajo','bajo','bajo','bajo','bajo','bajo','alto','bajo','bajo'],'bajo'))
 
def alimentos_que_no_tengo_pero_otro_si_tiene (lista_cod_alim_otro_rest, lista_cod_alim_mi_rest):
    lista_cod_alim_client_interes_otro_rest = []
 
    for alimentos in lista_cod_alim_otro_rest:
        if alimentos not in lista_cod_alim_mi_rest:
            lista_cod_alim_client_interes_otro_rest.append (alimentos)
 
    return lista_cod_alim_client_interes_otro_rest
 
#print (alimentos_que_no_tengo_pero_otro_si_tiene([0,3,5,7,10], [4,10,5,8]))
 
 
def numero_de_alimentos_disponibles_para_intercambiar (lista_cod_alim_otro_rest, lista_cod_alim_admin):
    contador_otro_rest = 0
    contador_admin = 0
 
    for alimentos in lista_cod_alim_otro_rest:
        if alimentos not in lista_cod_alim_admin:
            contador_otro_rest += 1
 
    for alimentos in lista_cod_alim_admin:
        if alimentos not in lista_cod_alim_otro_rest:
            contador_admin += 1
 
    return (contador_otro_rest if contador_otro_rest < contador_admin else contador_admin)
 
#print (numero_de_alimentos_disponibles_para_intercambiar([0,3,5,7,10], [4,10,5,8]))