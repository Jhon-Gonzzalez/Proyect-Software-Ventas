package Vista_Profe;

import Clases.Profesores;
import static Vista_Profe.Vista_Materia.cmb_Materia;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class Vista_Registro extends javax.swing.JFrame {

    Profesores instancia = new Profesores();
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList< Profesores> listaDatos = new ArrayList< Profesores>();

    public Vista_Registro() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setLocationRelativeTo(null);
        this.setTitle("Regristo de Materias");

        modelo.addColumn("ID");
        modelo.addColumn("NOMBRE");
        modelo.addColumn("SEXO");
        modelo.addColumn("EDAD");
        modelo.addColumn("CURSO");
        modelo.addColumn("TITULO");

        refrescarTabla();
    }

    public void refrescarTabla() {

        while (modelo.getRowCount() > 0) {
            modelo.removeRow(0);
        }

        for (Profesores x : listaDatos) {
            Object a[] = new Object[6];

            a[0] = x.getId();
            a[1] = x.getNombre();
            a[2] = x.getSexo();
            a[3] = x.getEdad();
            a[4] = x.getCurso();
            a[5] = x.getTitulo();

            modelo.addRow(a);

        }
        Tabla_Profesores.setModel(modelo);

    }

    public void limpiar() {
        txt_Nombre.setText("");
        txt_Id.setText("");
        cmb_Curso.setSelectedIndex(0);
        cmb_Titulo.setSelectedIndex(0);
        TipoSexo.clearSelection();
        spn_Edad.setValue(0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TipoSexo = new javax.swing.ButtonGroup();
        fon = new javax.swing.JLabel();
        Panel_1 = new javax.swing.JPanel();
        txt_Nombre = new javax.swing.JTextField();
        rbt_SexoFemenino = new javax.swing.JRadioButton();
        rbt_SexoMasculino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        spn_Edad = new javax.swing.JSpinner();
        cmb_Curso = new javax.swing.JComboBox<>();
        cmb_Titulo = new javax.swing.JComboBox<>();
        btn_Registrar = new javax.swing.JButton();
        txt_Id = new javax.swing.JTextField();
        Bordes = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Tabla_Profesores = new javax.swing.JTable();
        Bordes1 = new javax.swing.JLabel();
        Bordes2 = new javax.swing.JLabel();
        vista2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        MenuBar = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();

        fon.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        fon.setForeground(new java.awt.Color(255, 255, 255));
        fon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/JR (3) (1).png"))); // NOI18N

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Panel_1.setBackground(new java.awt.Color(153, 0, 0));
        Panel_1.setForeground(new java.awt.Color(231, 26, 0));
        Panel_1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        Panel_1.add(txt_Nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, 30));

        TipoSexo.add(rbt_SexoFemenino);
        rbt_SexoFemenino.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_SexoFemenino.setText("Femeino");
        Panel_1.add(rbt_SexoFemenino, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, -1, -1));

        TipoSexo.add(rbt_SexoMasculino);
        rbt_SexoMasculino.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        rbt_SexoMasculino.setText("Masculino");
        rbt_SexoMasculino.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        rbt_SexoMasculino.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        Panel_1.add(rbt_SexoMasculino, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 170, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Id Profesor");
        Panel_1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 60, 100, 50));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre");
        Panel_1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 100, 50));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Sexo");
        Panel_1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 100, 50));

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Edad");
        Panel_1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 200, 100, 50));

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Curso");
        Panel_1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, 100, 50));

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Titulo");
        Panel_1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 110, 100, 50));

        spn_Edad.setModel(new javax.swing.SpinnerNumberModel(0, 0, 120, 1));
        Panel_1.add(spn_Edad, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, -1, -1));

        cmb_Curso.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Curso.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "A1", "A2", "A3", "A4", "A5" }));
        Panel_1.add(cmb_Curso, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 170, 130, 30));

        cmb_Titulo.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        cmb_Titulo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Ingeniero de Sistemas", "Fisico", "Lic Ingles", "Lic Matematico", "" }));
        Panel_1.add(cmb_Titulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 140, 30));

        btn_Registrar.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        btn_Registrar.setText("Registro");
        btn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_RegistrarActionPerformed(evt);
            }
        });
        Panel_1.add(btn_Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 310, 130, 50));
        Panel_1.add(txt_Id, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 70, 100, 30));

        Bordes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, " Datos Profesionles", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Panel_1.add(Bordes, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 40, 310, 250));

        Tabla_Profesores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(Tabla_Profesores);

        Panel_1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 430, 640, 110));

        Bordes1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Panel_1.add(Bordes1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 400, 690, 160));

        Bordes2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Personales", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        Panel_1.add(Bordes2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 310, 250));
        Panel_1.add(vista2, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 240, 130, 140));

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        Panel_1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 340, -1, -1));

        getContentPane().add(Panel_1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 920, 590));

        jMenu1.setText("Inicio");

        jMenuItem3.setText("Registro");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem1.setText("Materia");
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

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        Vista_Materia ventana = new Vista_Materia();
        
        ventana.setVisible(true);
//        String nada =xx.getNombre();
//        cmb_Materia.addItem(nada);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        Vista_final ventana = new Vista_final();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        Vista_Registro ventana = new Vista_Registro();
        ventana.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void btn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_RegistrarActionPerformed
        Profesores x = new Profesores();
        x.setId(txt_Id.getText());
        x.setNombre(txt_Nombre.getText());
        x.setEdad(Integer.parseInt(spn_Edad.getValue().toString()));
        x.setCurso(cmb_Curso.getSelectedItem().toString());
        x.setTitulo(cmb_Titulo.getSelectedItem().toString());

        if (rbt_SexoFemenino.isSelected()) {
            x.setSexo("Femenina");
        } else if (rbt_SexoMasculino.isSelected()) {
            x.setSexo("Masculino");
        }
       
        listaDatos.add(x);
        refrescarTabla();
 
        limpiar();
    }//GEN-LAST:event_btn_RegistrarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        vista2.setVisible(true);
        Panel_1.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bordes;
    private javax.swing.JLabel Bordes1;
    private javax.swing.JLabel Bordes2;
    private javax.swing.JMenuBar MenuBar;
    private javax.swing.JPanel Panel_1;
    private javax.swing.JTable Tabla_Profesores;
    private javax.swing.ButtonGroup TipoSexo;
    private javax.swing.JButton btn_Registrar;
    private javax.swing.JComboBox<String> cmb_Curso;
    private javax.swing.JComboBox<String> cmb_Titulo;
    private javax.swing.JLabel fon;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbt_SexoFemenino;
    private javax.swing.JRadioButton rbt_SexoMasculino;
    private javax.swing.JSpinner spn_Edad;
    private javax.swing.JTextField txt_Id;
    private javax.swing.JTextField txt_Nombre;
    private javax.swing.JPanel vista2;
    // End of variables declaration//GEN-END:variables
}
