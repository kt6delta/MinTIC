public class Celular extends Contacto {

    String operador;

    public Celular(String nombre,String tipo,String operador,String numero){
        super(nombre,tipo,operador,numero);
        this.operador=operador;
    }
    
}
