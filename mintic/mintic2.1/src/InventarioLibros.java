import java.util.ArrayList;
public class InventarioLibros {

    public String[] generos(ArrayList <String> datos){
        String [] generos= new String [datos.size()];
        generos=datos.toArray(generos);
        int conta=0;
        for(int i=1; i<generos.length; i++){
            for (int j=0; j<generos.length; j++){
                if(generos[i]==generos[j] && j!=i){
                    generos[i]="0";
                    conta=conta+1;
                }
            }    
        }
        String [] Cgeneros=new String[generos.length-conta+1];
        conta=0;
        for (int i=0; i<generos.length; i++) {
            if(generos[i]!="0"){
                Cgeneros[conta]=generos[i];
                conta=conta+1;
            }
        }
        return Cgeneros;
    }

    public int[] filtrar_por_genero(ArrayList <Integer> datos1,ArrayList <String> datos2,String filtrar){
        Integer[] libros= new Integer [datos1.size()];
        libros=datos1.toArray(libros);

        String [] generos= new String [datos2.size()];
        generos=datos2.toArray(generos);

        int conta=0;
        for (int index: libros) {
            if(generos[index]==filtrar){
                conta+=1;
            }
        }
        int [] solu=new int[conta];
        conta=0;
        for (int i=0; i<libros.length;i++){
            if(generos[libros[i]]==filtrar){
                solu[conta]=libros[i];
                conta+=1;
            }
        }
        return solu;
    } 
    public String [] comparar_inventarios(ArrayList <String> datos1, ArrayList <String> datos2){
        String[] l1=generos(datos1);
        String[] l2=generos(datos2);
        int conta=0;
        for (int j=0; j<l1.length;j++) {
            for (int i=0; i<l2.length;i++) {
                if(l1[j]==l2[i]){
                    l1[j]="n";
                    conta+=1;  
                }
            }
        }
        String [] l3;
        if(l2.length>l1.length){
            l3 =new String[conta-1];
        }else{
            l3=new String[conta];
        }
        conta=0;
        for (String j : l1) {
            if(j != "n" && j!=null){
                l3[conta]=j;
                conta+=1; 
            }
        }
        return l3;
    }
    public Integer se_pueden_mover(ArrayList <String> datos1, ArrayList <String> datos2){
        String [] l3=comparar_inventarios(datos1,datos2);
        String [] l4=comparar_inventarios(datos2,datos1);
        if(l3.length>l4.length){
            return l4.length;
        }else{
            return l3.length;
        }
    }
}

