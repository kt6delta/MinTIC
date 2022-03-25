package logica;
import java.util.ArrayList;
public class InventarioLibros2 {
  
    public ArrayList <String> generos(ArrayList <String> datos){
    
            for (int i=1; i<datos.size(); i++){
                for (int j=0; j<datos.size(); j++){
                    if(datos.get(i)==datos.get(j) && j!=i){
                        datos.remove(i);
                    }
                }    
            }
            
            return datos;
        }
    
        public ArrayList <Integer> filtrar_por_genero(ArrayList <Integer> datos1,ArrayList <String> datos2,String filtrar){
            
            ArrayList <Integer> solu=new ArrayList();
            for (Integer index: datos1) {
                if(datos2.get(index)==filtrar){
                    solu.add(index);
                }
            }
    
            return solu;
        } 
        public ArrayList <String> comparar_inventarios(ArrayList <String> datos1, ArrayList <String> datos2){
            ArrayList <String> l1=generos(datos1);
            ArrayList <String> l2=generos(datos2);
            
            for (int j=0; j<l1.size();j++) {
                for (int i=0; i<l2.size();i++) {
                    if(l1.get(j)==l2.get(i)){
                        l1.remove(j);
                    }
                }
            }
            
            return l1;
        }
        public int se_pueden_mover(ArrayList <String> datos1, ArrayList <String> datos2){
            ArrayList <String>  l3=comparar_inventarios(datos1,datos2);
            ArrayList <String>  l4=comparar_inventarios(datos2,datos1);
            
            if(l3.size()>l4.size()){
                return l4.size();
            }else{
                return l3.size();
            }
        }
    }
    

