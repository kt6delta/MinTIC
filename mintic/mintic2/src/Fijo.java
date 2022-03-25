public class Fijo extends Contacto  {

    String indicativo_ciudad;

    Fijo(String nombre,String tipo,String indicativo_ciudad,String numero){
        super(nombre,tipo,indicativo_ciudad,numero);
        this.indicativo_ciudad=indicativo_ciudad;
    }
}
