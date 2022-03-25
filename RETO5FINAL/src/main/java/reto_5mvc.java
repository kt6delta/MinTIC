
import Controlador.Controlador;
import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.formProducto;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jafet
 */
public class reto_5mvc {
    public static void main(String[] args){
        Producto mod = new Producto();
        ConsultasProducto modc = new ConsultasProducto();
        formProducto frm = new formProducto();
        
        Controlador ctrl = new Controlador(mod,modc,frm);
        ctrl.iniciar();
        frm.setVisible(true);
    }
}
