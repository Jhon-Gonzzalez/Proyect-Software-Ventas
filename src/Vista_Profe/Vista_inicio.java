package Vista_Profe;

import Clases.Inicio;
import Clases.Verificacion;
import javax.swing.JOptionPane;

public class Vista_inicio extends javax.swing.JFrame {

    Verificacion instancia_1 = new Verificacion();
    Inicio instancia_2 = new Inicio();

    
    public Vista_inicio() {
        initComponents();
        this.setLocationRelativeTo(null);
        txt_Usuario.setText("admin01");
        txt_Contraseña.setText("123");
    }

    public void validar() {
        String dni = txt_Contraseña.getText();
        String user = txt_Usuario.getText();
        if (txt_Usuario.getText().equals("") || txt_Contraseña.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "debe ingresar los datos");
            txt_Usuario.requestFocus();
        } else {
            instancia_2 = instancia_1.validar(dni, user);
            if (instancia_2.getNombre() != null && instancia_2.getDni() != null) {
                Principal ventana = new Principal();
                ventana.setVisible(true);
                dispose();

            } else {
                JOptionPane.showMessageDialog(this, "debe ingresar los datos validos");
                txt_Usuario.requestFocus();
            }
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem2 = new javax.swing.JMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        txt_Contraseña = new javax.swing.JPasswordField();
        txt_Usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_Contraseña.setText("jPasswordField1");
        getContentPane().add(txt_Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));
        getContentPane().add(txt_Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 110, -1));

        jButton1.setText("Iniciar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, -1, -1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 500, 490));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        validar();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField txt_Contraseña;
    private javax.swing.JTextField txt_Usuario;
    // End of variables declaration//GEN-END:variables
}
