/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista_Profe;

// subido bien

import Clases.Materias;
import Clases.Profesores;
import Conexiones.ProfesoresDAO;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Vista_Profesor extends javax.swing.JInternalFrame {

    Profesores instancia = new Profesores();
    ProfesoresDAO dao = new ProfesoresDAO();
    DefaultTableModel modelo = new DefaultTableModel();
    int id;
  

    public Vista_Profesor() {
        initComponents();
        listar();
    }

    void listar() {
        List<Profesores> lista = dao.listar();
        modelo = (DefaultTableModel) Tabla_Profesores.getModel();
        Object[] a = new Object[7];

        for (int i = 0; i < lista.size(); i++) {

            a[0] = lista.get(i).getId();
            a[1] = lista.get(i).getNombre();
            a[2] = lista.get(i).getSexo();
            a[3] = lista.get(i).getEdad();
            a[4] = lista.get(i).getCurso();
            a[5] = lista.get(i).getTitulo();
            a[6] = lista.get(i).getHorario();

            modelo.addRow(a);

        }
        Tabla_Profesores.setModel(modelo);

    }

    void agregar() {
        String nombre = txt_Nombre.getText();
        String horario = txt_Horario.getText();
        String curso = cmb_Curso.getSelectedItem().toString();
        String titulo = cmb_Titulo.getSelectedItem().toString();
        String sexo = cmb_sexo1.getSelectedItem().toString();
        int edad = Integer.parseInt(spn_Edad.getValue().toString());

        Object x[] = new Object[6];
        x[0] = nombre;
        x[1] = sexo;
        x[2] = edad;
        x[3] = curso;
        x[4] = titulo;
        x[5] = horario;

        dao.add(x);
    }

    public void limpiar() {
        for (int i = 0; i < modelo.getRowCount(); i++) {
            modelo.removeRow(i);
            i = i - 1;
        }
    }

    public void eliminar() {
        int fila = Tabla_Profesores.getSelectedRow();
        int ids = Integer.parseInt(this.Tabla_Profesores.getValueAt(fila, 0).toString());
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "debe seleccionar un afila");
        } else {
            dao.eliminar(ids);
        }

    }

    public void actuallizar() {
        int fila = Tabla_Profesores.getSelectedRow();
        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "debe seleccionar un afila");
        } else {

            String nombre = txt_Nombre.getText();
              String sexo = cmb_sexo1.getSelectedItem().toString();
            String horario = txt_Horario.getText();
            String curso = cmb_Curso.getSelectedItem().toString();
            String titulo = cmb_Titulo.getSelectedItem().toString();
         
            int edad = Integer.parseInt(spn_Edad.getValue().toString());

            Object o[] = new Object[7];
            o[0] = nombre;
            o[1] = sexo;
            o[2] = edad;
            o[3] = curso;
            o[4] = titulo;
            o[5] = horario;
            o[6] = id;

            dao.actualizar(o);

        }
    }

    public void nuevo() {
        txt_Nombre.setText("");
        cmb_sexo1.setSelectedIndex(0);
        cmb_Curso.setSelectedIndex(0);
        spn_Edad.setValue(0);
        cmb_Curso.setSelectedItem(0);
        cmb_Titulo.setSelectedIndex(0);
        txt_Horario.setText("");
        txt_Nombre.requestFocus();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoSexo = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        txt_Nombre = new javax.swing.JTextField();
        rbt_SexoMasculino = new javax.swing.JRadioButton();
        rbt_SexoFemenino = new javax.swing.JRadioButton();
        spn_Edad = new javax.swing.JSpinner();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cmb_Curso = new javax.swing.JComboBox<>();
        cmb_Titulo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_Registrar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Profesores = new javax.swing.JTable();
        txt_Horario = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        cmb_sexo1 = new javax.swing.JComboBox<>();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Datos Docentes");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");

        TipoSexo.add(rbt_SexoMasculino);
        rbt_SexoMasculino.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_SexoMasculino.setText("Masculino");
        rbt_SexoMasculino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rbt_SexoMasculino.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);

        TipoSexo.add(rbt_SexoFemenino);
        rbt_SexoFemenino.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_SexoFemenino.setText("Femeino");

        spn_Edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo");

        cmb_Curso.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "m", "f" }));

        cmb_Titulo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Titulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ingeniero de Sistemas", "Fisico", "Lic Ingles", "Lic Matematico", "" }));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Titulo");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Curso");

        btn_Registrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_Registrar.setText("Registro");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });

        jButton1.setText("Actualizar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Tabla_Profesores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "NOMBRE", "SEXO", "EDAD", "CURSO", "TITULO", "HORARIO"
            }
        ));
        Tabla_Profesores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tabla_ProfesoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tabla_Profesores);

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Horario");

        jButton2.setText("Nuevo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Eliminar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        cmb_sexo1.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_sexo1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "m", "f" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmb_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_Registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1)
                            .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(77, 77, 77))
            .addGroup(layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 640, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(148, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 110, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(0, 0, 0)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                            .addGap(90, 90, 90)
                                            .addComponent(rbt_SexoMasculino))
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGap(7, 7, 7)
                                    .addComponent(rbt_SexoFemenino))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(90, 90, 90)
                                    .addComponent(spn_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGap(0, 508, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(248, 248, 248)
                    .addComponent(cmb_sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(503, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmb_Curso, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_Horario, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(cmb_Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btn_Registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1)
                        .addGap(19, 19, 19)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(92, 92, 92))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(40, 58, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(txt_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(rbt_SexoMasculino)
                                .addComponent(rbt_SexoFemenino))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(20, 20, 20)
                            .addComponent(spn_Edad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(0, 308, Short.MAX_VALUE)))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(cmb_sexo1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(356, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed

        agregar();
        limpiar();
        listar();
         nuevo();
        //  limpiar();
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        actuallizar();
        limpiar();
        listar();
         nuevo();

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        eliminar();
        limpiar();
        listar();
         nuevo();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        nuevo();
        

    }//GEN-LAST:event_jButton2ActionPerformed

    private void Tabla_ProfesoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tabla_ProfesoresMouseClicked
        int fila = Tabla_Profesores.getSelectedRow();

        if (fila == -1) {
            JOptionPane.showMessageDialog(this, "debe seleccionar un afila");
        } else {
            id = Integer.parseInt(Tabla_Profesores.getValueAt(fila, 0).toString());
            String nombre = Tabla_Profesores.getValueAt(fila, 1).toString();
            String sexo = Tabla_Profesores.getValueAt(fila, 2).toString();
            int edad = Integer.parseInt(Tabla_Profesores.getValueAt(fila, 3).toString());
            String curso = Tabla_Profesores.getValueAt(fila, 4).toString();
            String titulo = Tabla_Profesores.getValueAt(fila, 5).toString();
            String horario = Tabla_Profesores.getValueAt(fila, 6).toString();

            txt_Nombre.setText(nombre);
            cmb_sexo1.setSelectedItem(sexo);
            spn_Edad.setValue(edad);
            cmb_Curso.setSelectedItem(curso);
            cmb_Titulo.setSelectedItem(titulo);
            txt_Horario.setText(horario);

        }

    }//GEN-LAST:event_Tabla_ProfesoresMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tabla_Profesores;
    private javax.swing.ButtonGroup TipoSexo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cmb_Curso;
    private javax.swing.JComboBox<String> cmb_Titulo;
    private javax.swing.JComboBox<String> cmb_sexo1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbt_SexoFemenino;
    private javax.swing.JRadioButton rbt_SexoMasculino;
    private javax.swing.JSpinner spn_Edad;
    private javax.swing.JTextField txt_Horario;
    private javax.swing.JTextField txt_Nombre;
    // End of variables declaration//GEN-END:variables
}
