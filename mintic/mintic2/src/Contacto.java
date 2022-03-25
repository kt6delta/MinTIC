public class Contacto {
    protected String nombre;
    protected String numero;
    protected String operador;
    protected String tipo;

    Contacto(String nombre,String tipo,String operador,String numero){
        this.nombre=nombre;
        this.numero=numero;
        this.tipo=tipo;
        this.operador=operador;
    }
}
