/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_Profe;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class Conexion {
    
    Connection enlazar;
    String url="jdbc:mysql://localhost:3306/datos";
        String user="root";
        String pass="";
    public Connection conectar(){
        
        try {
             
           //Cargamos el Driver MySQL
           Class.forName("com.mysql.jdbc.Driver");
           enlazar = DriverManager.getConnection(url,user,pass);
           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Error "+e);
        }
        return enlazar;
    
    }
}
