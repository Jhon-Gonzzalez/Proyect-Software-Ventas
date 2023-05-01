/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwareventas;

import java.text.NumberFormat;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author WIN-10
 */
public class Modelo {

    private String nombre;
    private String apellido;
    private String direccion;
    private int cedula;
    private int celular;
    private String email;
    private int dato;
    
    DefaultTableModel listaDatos = new DefaultTableModel();
    ArrayList lista = new ArrayList();

    
    public Modelo() {
    }

    public Modelo(String nombre, String apellido, String direccion, int cedula, int celular, String email,int dato) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.cedula = cedula;
        this.celular = celular;
        this.email = email;
        this.dato=dato;
    }


   
    public void CabeceraTabla(JTable TablaCliente) {

        listaDatos.addColumn("Nombre");
        listaDatos.addColumn("Apellido");
        listaDatos.addColumn("Cedula");
        listaDatos.addColumn("Direccion");
        listaDatos.addColumn("Celular");
        listaDatos.addColumn("Email");
        listaDatos.addColumn("Dato");

        TablaCliente.setModel(listaDatos);

    }

    public void AgregarClientes(JTextField nombre, JTextField apellido,JTextField cedula, JTextField direccion,  JTextField celular, JTextField email,JTextField dato) {

        this.nombre = nombre.getText();
        this.apellido =apellido.getText();
        this.cedula = Integer.parseInt(cedula.getText());
        this.direccion =direccion.getText();
        this.celular = Integer.parseInt(celular.getText());
        this.email = email.getText();
        this.dato=Integer.parseInt(dato.getText());
        listaDatos.addRow(new Object[]{this.nombre, this.apellido, this.cedula, this.direccion, this.celular, this.email, this.dato});

    }
    
    public int calcular(JTextField mostrar,JTable tabla){
      int p = 0;
    int t = 0;
    
        if (tabla.getRowCount()>0) {
             for (int i = 0; i < tabla.getRowCount(); i++) {
            p=Integer.parseInt(tabla.getValueAt(i, 6).toString());
            t=t+p;
        }
        }
       
        return t;
    }
    
  
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public int getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
}
