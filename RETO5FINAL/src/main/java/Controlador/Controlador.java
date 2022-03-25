/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.ConsultasProducto;
import Modelo.Producto;
import Vista.formProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;


/**
 *
 * @author jafet
 */
public class Controlador implements ActionListener {

    private Producto mod;
    private ConsultasProducto modC;
    private formProducto frm;

    public Controlador(Producto mod, ConsultasProducto modC, formProducto frm) {
        this.mod = mod;
        this.modC = modC;
        this.frm = frm;
        this.frm.btnBuscar.addActionListener(this);
        this.frm.btnEliminar.addActionListener(this);
        this.frm.btnGuardar.addActionListener(this);
        this.frm.btnLimpiar.addActionListener(this);
        this.frm.btnModificar.addActionListener(this);
    }

    public void iniciar() {
        frm.setTitle("Productos");
        frm.setLocationRelativeTo(null);
        frm.setVisible(false);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == frm.btnGuardar) {
            mod.setNombre(frm.txtNombre.getText());
            mod.setIdProducto(Integer.parseInt(frm.txtId.getText()));
            mod.setPrecio(Float.parseFloat(frm.txtPrecio.getText()));
            if (modC.registrar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro agregado");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error al guardar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnModificar) {
            
            mod.setIdProducto(Integer.parseInt(frm.txtId.getText()));
            mod.setNombre(frm.txtNombre.getText());
            mod.setPrecio(Float.parseFloat(frm.txtPrecio.getText()));
            if (modC.modificar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro modificado");
                limpiar();
            } else {
                JOptionPane.showMessageDialog(null, "Error al modificar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnEliminar) {
            mod.setIdProducto(Integer.parseInt(frm.txtId.getText()));
            if (modC.eliminar(mod)) {
                JOptionPane.showMessageDialog(null, "Registro Eliminado");
                limpiar();

            } else {
                JOptionPane.showMessageDialog(null, "Error al eliminar");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnBuscar) {
            mod.setIdProducto(Integer.parseInt(frm.txtId.getText()));
            if (modC.buscar(mod)) {
                frm.txtId.setText(String.valueOf(mod.getIdProducto()));
                frm.txtNombre.setText(mod.getNombre());
                frm.txtPrecio.setText(String.valueOf(mod.getPrecio()));
            } else {
                JOptionPane.showMessageDialog(null, "No se encontró registro");
                limpiar();
            }
        }
        if (e.getSource() == frm.btnLimpiar) {
            limpiar();
        }
    }

    public void limpiar() {
        frm.txtId.setText(null);
        frm.txtPrecio.setText(null);
        frm.txtNombre.setText(null);
    }
    
    
}
