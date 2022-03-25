import java.util.ArrayList;
import java.util.Scanner; 
public class Agenda {

    ArrayList<Contacto> personas = new ArrayList();
    public static void main(String[] args) throws Exception {
        Agenda contactos= new Agenda();
    }
    Agenda(){
        procesar_comandos();
    }

    public void agregar_contacto(Contacto persona){
        personas.add(persona);
    }

   public void mostrar_contactos(){
        System.out.println("***Agenda de contactos***");
        if(personas!=null){
            for (int i=0; i<personas.size(); i++){
                if(personas.get(i).tipo.equals("celular")){
                    System.out.println("\n"+"Nombre:"+personas.get(i).nombre+"\n\n"+"Numero:"+personas.get(i).numero+"\n\n"+"Tipo:"+personas.get(i).tipo+"\n\n"+"Operador:"+personas.get(i).operador);
                }else{
                    System.out.println("\n"+"Nombre:"+personas.get(i).nombre+"\n\n"+"Numero:"+personas.get(i).numero+"\n\n"+"Tipo:"+personas.get(i).tipo+"\n\n"+"Indicativo:"+personas.get(i).operador);    
                }
            }
        }
   }
  
  
   public void procesar_comandos(){//main
    Scanner sc = new Scanner (System.in);
    Celular personac=null;
    Fijo personaf=null;
    String[] datos;
    do{
        System.out.println("ingrese datos");
        String input= sc.nextLine ();
        datos = input.split("&");
        switch (Integer.parseInt(datos[0])){

            case 1:
                if(datos[2].equals("celular")){
                    personac = new Celular(datos[1],datos[2],datos[3],datos[4]);
                    agregar_contacto(personac);
                }
                if(datos[2].equals("fijo")){
                    personaf = new Fijo(datos[1],datos[2],datos[3],datos[4]);
                    agregar_contacto(personaf);
                }
                break;
            case 2:
                mostrar_contactos();
                break;
            case 3:
                System.exit(0);
        }
    }while(true);
   }
}