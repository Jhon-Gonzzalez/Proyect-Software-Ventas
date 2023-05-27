package Clases;

import Vista_Profe.Conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class Verificacion {

    PreparedStatement ps;
    ResultSet rs;
    
    Inicio dato = new Inicio();
    Conexion enlazar = new Conexion();
    Connection acceso;

    public Inicio listar() {
        
        return dato;
    }
    
    
    
     public Inicio validar(String dni, String user) {
        String sql = "select * from inicio where Dni=? and User=?";
        try {

            acceso = enlazar.conectar();
            ps = acceso.prepareStatement(sql);
            ps.setString(1, dni);
            ps.setString(2, user);
            rs = ps.executeQuery();
            while (rs.next()) {
                dato.setId(rs.getInt(1));
                dato.setDni(rs.getString(2));
                dato.setNombre(rs.getString(3));

            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
        }
        return dato;
    }

}
