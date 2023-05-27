package Vista_Profe;

import Clases.Materias;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Vista_Materia extends javax.swing.JFrame {

    Materias instancia = new Materias();
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Materias> listaDatos = new ArrayList<Materias>();

    public Vista_Materia() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Regristo de Materias");

        modelo.addColumn("ID MATERIA");
        modelo.addColumn("ID HORARIO");
        modelo.addColumn("MATERIA");
        modelo.addColumn("SEMESTRE");
        modelo.addColumn("CALENDARIO");

        refrescarTabla();

    }

    public void refrescarTabla() {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Materias x : listaDatos) {
            Object a[] = new Object[7];

            a[0] = x.getId_Materia();
            a[1] = x.getId_Horario();
            a[2] = x.getMateria();
            a[3] = x.getSemestre();
            a[4] = x.getCalendario();
            a[5] = x.getHora_inicial();
            a[6] = x.getHora_Final();

            modelo.addRow(a);

        }
        Tabla_Materias.setModel(modelo);

    }
   
    public void limpiar(){
    txt_HoraFinal.setText("");
    txt_HoraInicial.setText("");
    txt_IdHorario.setText("");
    txt_IdMateria.setText("");
    
    cmb_Calendario.setSelectedIndex(0);
    cmb_Materia.setSelectedIndex(0);
    cmb_Semestre.setSelectedIndex(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fon = new javax.swing.JLabel();
        Panel = new javax.swing.JPanel();
        txt_HoraFinal = new javax.swing.JTextField();
        txt_IdMateria = new javax.swing.JTextField();
        txt_IdHorario = new javax.swing.JTextField();
        txt_HoraInicial = new javax.swing.JTextField();
        cmb_Calendario = new javax.swing.JComboBox<>();
        cmb_Materia = new javax.swing.JComboBox<>();
        cmb_Semestre = new javax.swing.JComboBox<>();
        Guardar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Bordes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Materias = new javax.swing.JTable();
        Fondo = new javax.swing.JLabel();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        fon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/JR (3) (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Panel.setBackground(new java.awt.Color(153, 0, 0));
        Panel.setForeground(new java.awt.Color(231, 26, 0));
        Panel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_HoraFinal.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Panel.add(txt_HoraFinal, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 170, 100, -1));

        txt_IdMateria.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Panel.add(txt_IdMateria, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 50, 100, 20));

        txt_IdHorario.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        txt_IdHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_IdHorarioActionPerformed(evt);
            }
        });
        Panel.add(txt_IdHorario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 100, 20));

        txt_HoraInicial.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Panel.add(txt_HoraInicial, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 120, 100, 20));

        cmb_Calendario.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cmb_Calendario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "2023_1", "2023_2" }));
        Panel.add(cmb_Calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 120, -1));

        cmb_Materia.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Panel.add(cmb_Materia, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, -1, -1));

        cmb_Semestre.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        cmb_Semestre.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Semestre 1", "Semestre 2" }));
        Panel.add(cmb_Semestre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, 120, -1));

        Guardar.setText("Guardar");
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });
        Panel.add(Guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel7.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Calendario Academico");
        Panel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 185, 50));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Materia");
        Panel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 30, 100, 50));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        Panel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 100, 50));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Hora Final");
        Panel.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 100, 50));

        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Semestre");
        Panel.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 100, 50));

        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Id Horario");
        Panel.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 100, 50));

        jLabel6.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Hora Inicial");
        Panel.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 100, 50));

        Bordes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Panel.add(Bordes, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 270, 690, 160));

        Tabla_Materias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID MATERIA", "ID HORARIO", "NOMBRE", "SEMESTRE", "CALENDARIO"
            }
        ));
        jScrollPane1.setViewportView(Tabla_Materias);

        Panel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 370, 640, 110));

        Fondo.setFont(new java.awt.Font("Times New Roman", 0, 16)); // NOI18N
        Fondo.setForeground(new java.awt.Color(255, 255, 255));
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/JR (3) (1).png"))); // NOI18N
        Panel.add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 590));

        jMenu1.setText("Inicio");

        jMenuItem3.setText("Materias");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Registro");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setText("Final");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        MenuBar.add(jMenu1);

        setJMenuBar(MenuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_IdHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_IdHorarioActionPerformed

    }//GEN-LAST:event_txt_IdHorarioActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Vista_Registro ventana = new Vista_Registro();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Vista_final ventana = new Vista_final();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Vista_Materia ventana = new Vista_Materia();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        Materias x = new Materias();
        x.setId_Materia(txt_IdMateria.getText());
        x.setMateria(cmb_Materia.getSelectedItem().toString());
        x.setId_Horario(txt_IdHorario.getText());
        x.setCalendario(cmb_Calendario.getSelectedItem().toString());
        x.setSemestre(cmb_Semestre.getSelectedItem().toString());
        x.setHora_inicial(txt_HoraInicial.getText());
        x.setHora_Final(txt_HoraFinal.getText());

        listaDatos.add(x);
        refrescarTabla();
        limpiar();


    }//GEN-LAST:event_GuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bordes;
    private javax.swing.JLabel Fondo;
    private javax.swing.JButton Guardar;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel Panel;
    private javax.swing.JTable Tabla_Materias;
    private javax.swing.JComboBox<String> cmb_Calendario;
    public static javax.swing.JComboBox<String> cmb_Materia;
    private javax.swing.JComboBox<String> cmb_Semestre;
    private javax.swing.JLabel fon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txt_HoraFinal;
    private javax.swing.JTextField txt_HoraInicial;
    private javax.swing.JTextField txt_IdHorario;
    private javax.swing.JTextField txt_IdMateria;
    // End of variables declaration//GEN-END:variables
}
