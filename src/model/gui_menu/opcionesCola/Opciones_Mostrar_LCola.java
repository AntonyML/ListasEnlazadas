/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.gui_menu.opcionesCola;

import java.awt.Font;
import javax.swing.JOptionPane;
import model.business.Cola;
import model.business.Logic;
import model.gui_menu.Menu;
import model.gui_menu.TextPrompt;

public final class Opciones_Mostrar_LCola extends javax.swing.JPanel {

    private final Logic logic;
    private final Menu menu;
    private final Cola c;
    private final String[] eti = {"ID", "Nombre", "Estado", "Carrera", "Edad"};
    private TextPrompt tp;

    /**
     * Creates new form NewJPanel
     *
     * @param menu
     * @param c
     */
    public Opciones_Mostrar_LCola(Menu menu, Cola c) {
        logic = new Logic();
        this.menu = menu;
        initComponents();
        this.c = c;
        editarTabla(logic.convertirMatrizMostrarAllDataCola(c));
        setTextPront();
    }

    private void setTextPront() {
        tp = new TextPrompt("Opcional", jTextField4);
        tp.changeAlpha(0.75f);
        tp.changeStyle(Font.ITALIC);
        tp.changeFontSize(11);

    }

    //tabla para editar
    public void editarTabla(Object[][] data) {

        table.setModel(new javax.swing.table.DefaultTableModel(
                data, eti
        ));
        jScrollPane1.setViewportView(table);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jTextCodigo = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        titu2 = new javax.swing.JLabel();
        titu1 = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 255, 153));
        jLabel1.setText("Nombre");
        jLabel1.setToolTipText("Nombre o dirección");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, -1, 30));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(102, 255, 153));
        jLabel2.setText("Carrera");
        jLabel2.setToolTipText("Nombre o dirección");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, -1, 30));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(102, 255, 153));
        jLabel3.setText("Edad");
        jLabel3.setToolTipText("Nombre o dirección");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, 30));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(102, 255, 153));
        jLabel4.setText("ID");
        jLabel4.setToolTipText("Nombre o dirección");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, 30));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(100, 255, 171));
        jCheckBox1.setText("Estudiante Activo");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 170, -1, -1));

        jTextCodigo.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextCodigo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextCodigo.setCaretColor(new java.awt.Color(51, 0, 51));
        jTextCodigo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextCodigoMouseClicked(evt);
            }
        });
        jTextCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextCodigoActionPerformed(evt);
            }
        });
        add(jTextCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 70, 30));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 120, 40));

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 170, 40));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 120, 40));

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Nombre", "Estado", "Carrera", "Edad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.setIntercellSpacing(new java.awt.Dimension(5, 1));
        table.setRowHeight(40);
        jScrollPane1.setViewportView(table);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 530, 490));

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(102, 255, 153));
        jLabel7.setText("Borrar");
        jLabel7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 480, -1, 20));

        jButton1.setBackground(new java.awt.Color(102, 255, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Buscar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 470, 120, 40));

        jCheckBox2.setBackground(new java.awt.Color(100, 255, 171));
        jCheckBox2.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setText("Buscar Todos");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 150, 30));

        jLabel5.setBackground(new java.awt.Color(0, 0, 0));
        jLabel5.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 153));
        jLabel5.setText("Posición ");
        jLabel5.setToolTipText("Nombre o dirección");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 350, -1, 20));

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, 100, 30));

        titu2.setBackground(new java.awt.Color(255, 0, 0));
        titu2.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        titu2.setText("Cola");
        add(titu2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 90, -1));

        titu1.setBackground(new java.awt.Color(0, 102, 102));
        titu1.setFont(new java.awt.Font("Dialog", 3, 24)); // NOI18N
        titu1.setText("Listas");
        add(titu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, -1, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/gui_menu/iconos/gradient (2).gif"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextCodigoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextCodigoMouseClicked
        // TODO add your handling code here:ID


    }//GEN-LAST:event_jTextCodigoMouseClicked

    private void jTextCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextCodigoActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:registrar

        if (jTextCodigo.getText().isEmpty() && jTextField1.getText().isEmpty() && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty() && jTextField4.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Coloca correctamente los datos");
        }
        //Mostrar todos los id 
        if (!jTextCodigo.getText().isEmpty() && jTextField1.getText().isEmpty()
                && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty()
                && jCheckBox2.isSelected()) {
            editarTabla(logic.MostrarIdAndNameCola(c, 2));

            //////////////////
            //falta agregar el numero de estudiantes
            menu.getjLabel4().setText("Estudiantes registrados :" + c.getTamano());

            jTextCodigo.setText("");
            jTextCodigo.setEnabled(true);
            jTextField1.setText("");
            jTextField2.setText("");
            jCheckBox1.setSelected(false);
            jTextField3.setText("");
        }
        //Mostrar todos los Nombres 
        if (jTextCodigo.getText().isEmpty() && !jTextField1.getText().isEmpty()
                && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty()
                && jCheckBox2.isSelected()) {
            editarTabla(logic.MostrarIdAndNameCola(c, 3));

            //////////////////
            //falta agregar el numero de estudiantes
            menu.getjLabel4().setText("Estudiantes registrados :" + c.getTamano());

            jTextCodigo.setText("");
            jTextCodigo.setEnabled(true);
            jTextField1.setText("");
            jTextField2.setText("");
            jCheckBox1.setSelected(false);
            jTextField3.setText("");
        }
        //Mostrar un id 
        if (!jTextCodigo.getText().isEmpty() && jTextField1.getText().isEmpty()
                && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty()
                && !jCheckBox2.isSelected()) {
             editarTabla(logic.buscarporID_Cola(c, Integer.parseInt(jTextCodigo.getText())));


            //////////////////
            //falta agregar el numero de estudiantes
            menu.getjLabel4().setText("Estudiantes registrados :" + c.getTamano());

            jTextCodigo.setText("");
            jTextCodigo.setEnabled(true);
            jTextField1.setText("");
            jTextField2.setText("");
            jCheckBox1.setSelected(false);
            jTextField3.setText("");
        }

        //Mostrar un Nombre
        if (jTextCodigo.getText().isEmpty() && !jTextField1.getText().isEmpty()
                && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty()
                && !jCheckBox2.isSelected()) {
            editarTabla(logic.buscarPorNombreCola(c,jTextField1.getText()));

            //////////////////
            //falta agregar el numero de estudiantes
            menu.getjLabel4().setText("Estudiantes registrados :" + c.getTamano());

            jTextCodigo.setText("");
            jTextCodigo.setEnabled(true);
            jTextField1.setText("");
            jTextField2.setText("");
            jCheckBox1.setSelected(false);
            jTextField3.setText("");
        }
        //Mostrar por pocision 
        if (jTextCodigo.getText().isEmpty() && jTextField1.getText().isEmpty()
                && jTextField2.getText().isEmpty() && jTextField3.getText().isEmpty()
                && !jTextField4.getText().isEmpty() && !jCheckBox2.isSelected()) {
            editarTabla(logic.buscarporPosicionCola(c, Integer.parseInt(jTextField4.getText())));

            //////////////////
            //falta agregar el numero de estudiantes
            menu.getjLabel4().setText("Estudiantes registrados :" + c.getTamano());

            jTextCodigo.setText("");
            jTextCodigo.setEnabled(true);
            jTextField1.setText("");
            jTextField2.setText("");
            jCheckBox1.setSelected(false);
            jTextField3.setText("");
        }

    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        // TODO add your handling code here://Borrar
        jTextCodigo.setText("");
        jTextCodigo.setEnabled(true);
        jTextField1.setText("");
        jTextField2.setText("");
        jCheckBox1.setSelected(false);
        jTextField3.setText("");

    }//GEN-LAST:event_jLabel7MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextCodigo;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTable table;
    private javax.swing.JLabel titu1;
    private javax.swing.JLabel titu2;
    // End of variables declaration//GEN-END:variables

//encapsulamiento
}
