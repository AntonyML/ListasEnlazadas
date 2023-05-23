/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.gui_menu.opciones_otros_metodos;

import javax.swing.JOptionPane;
import model.business.Cola;
import model.business.ListaCircular;
import model.business.ListaDoble;
import model.business.ListaSimple;

import model.business.Logic;
import model.business.Ordenamiento;
import model.business.Pila;

import model.gui_menu.Menu;
import model.gui_menu.TextPrompt;

public final class Opciones_Metodo_Burbuja extends javax.swing.JPanel {

    protected ListaSimple l;
    protected ListaDoble lD;
    protected ListaCircular lC;
    protected Pila p;
    protected Cola c;
    private final Ordenamiento o;
    private final Logic logic;
    private final Menu menu;
    private final String[] eti = {"ID", "Nombre", "Estado", "Carrera", "Edad"};
    private TextPrompt tp;
    private int cont;
    private final boolean[] check;

    /**
     * Creates new form NewJPanel
     *
     * @param menu
     * @param l
     * @param lD
     * @param lC
     * @param p
     * @param c
     */
    public Opciones_Metodo_Burbuja(Menu menu, ListaSimple l, ListaDoble lD, ListaCircular lC, Pila p, Cola c) {
        this.check = new boolean[3];
        logic = new Logic();
        this.menu = menu;
        initComponents();
        this.o = new Ordenamiento();
        this.c = c;
        this.p = p;
        this.l = l;
        this.lD = lD;
        this.lC = lC;
        editarTabla(logic.convertirMatrizMostrarAllDataListaSimple(l));
        jTextNameList.setText("Lista Simple");
        cont = 1;

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

        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        jTextNameList = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMinimumSize(new java.awt.Dimension(780, 540));
        setPreferredSize(new java.awt.Dimension(780, 540));
        setRequestFocusEnabled(false);
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, 530, 340));

        jButton1.setBackground(new java.awt.Color(102, 255, 153));
        jButton1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Ordenar");
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
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 460, 120, 40));

        jLabel4.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(204, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("0000");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 300, 170, 36));

        jLabel5.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.foreground"));
        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 255, 255));
        jLabel5.setText("Total de Estudiantes ");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 170, 60));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(100, 255, 171));
        jCheckBox1.setText("Mayor a menor");
        jCheckBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox2.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(100, 255, 171));
        jCheckBox2.setText("Menor a mayor");
        jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox2ActionPerformed(evt);
            }
        });
        add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, -1, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        jCheckBox3.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(100, 255, 171));
        jCheckBox3.setText("Alfabeticamente");
        jCheckBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCheckBox3ActionPerformed(evt);
            }
        });
        add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, -1, -1));

        jLabel6.setBackground(new java.awt.Color(0, 0, 0));
        jLabel6.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 153));
        jLabel6.setText("Tipos de Lista");
        jLabel6.setToolTipText("Nombre o dirección");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 380, -1, 30));

        jTextNameList.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jTextNameList.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextNameList.setCaretColor(new java.awt.Color(51, 0, 51));
        jTextNameList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextNameListMouseClicked(evt);
            }
        });
        jTextNameList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextNameListActionPerformed(evt);
            }
        });
        add(jTextNameList, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 420, 230, 40));

        jLabel10.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(102, 255, 153));
        jLabel10.setText("Anterior");
        jLabel10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
        });
        add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 490, -1, 20));

        jButton2.setBackground(new java.awt.Color(102, 255, 153));
        jButton2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Siguiente");
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 480, 120, 40));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/model/gui_menu/iconos/gradient (2).gif"))); // NOI18N
        add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 790, 540));
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:Ordenar

        check[0] = jCheckBox1.isSelected();
        check[1] = jCheckBox2.isSelected();
        check[2] = jCheckBox3.isSelected();
        if (!check[0] && !check[1] && !check[2]) {
            JOptionPane.showMessageDialog(null, "Seleciona una opcion");
        }

        switch (cont) {
            case 1:
                jLabel4.setText(String.valueOf(l.getTamano()));
                //Modificar la lista para acomodarala diferente con burbuja
                if (check[0]) {
                    // option = "Mayor";
                    l.ordenarBurbuja_MayoraMenor();
                }
                if (check[1]) {
                    // option = "Menor";
                      l.ordenarBurbuja_MenoraMayor();
                }
                if (check[2]) {
                    //  option = "Alfabetico";
                }

                editarTabla(logic.convertirMatrizMostrarAllDataListaSimple(l));
                System.err.println("Lista Ordenada");
                break;
            case 2:

                jLabel4.setText(String.valueOf(lD.getTamano()));
                  //Modificar la lista para acomodarala diferente con burbuja
                if (check[0]) {
                    // option = "Mayor";
                    lD.ordenarBurbuja_MayoraMenor();
                }
                if (check[1]) {
                    // option = "Menor";
                      lD.ordenarBurbuja_MenoraMayor();
                }
                if (check[2]) {
                    //  option = "Alfabetico";
                }
                editarTabla(logic.convertirMatrizMostrarAllDataLDoble(lD));
                break;
            case 3:
                jLabel4.setText(String.valueOf(lC.getTamano()));
                editarTabla(logic.convertirMatrizMostrarAllDataLCircular(lC));
                break;
        }
        //Volvemos a la normalidad las acciones
        jCheckBox1.setEnabled(true);
        jCheckBox2.setEnabled(true);
        jCheckBox3.setEnabled(true);
        jCheckBox1.setSelected(false);
        jCheckBox2.setSelected(false);
        jCheckBox3.setSelected(false);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jCheckBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox1ActionPerformed
        // TODO add your handling code here:
        jCheckBox2.setEnabled(false);
        jCheckBox3.setEnabled(false);
    }//GEN-LAST:event_jCheckBox1ActionPerformed

    private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
        // TODO add your handling code here:
        jCheckBox1.setEnabled(false);
        jCheckBox3.setEnabled(false);
    }//GEN-LAST:event_jCheckBox2ActionPerformed

    private void jCheckBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox3ActionPerformed
        // TODO add your handling code here:
        jCheckBox1.setEnabled(false);
        jCheckBox3.setEnabled(false);
    }//GEN-LAST:event_jCheckBox3ActionPerformed

    private void jTextNameListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextNameListMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameListMouseClicked

    private void jTextNameListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextNameListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextNameListActionPerformed

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
        //Anterior

        if (1 < cont && cont < 4) {
            cont--;
        } else {
            JOptionPane.showMessageDialog(null, "No hay mas Listas");
        }

        if (l != null || lD != null || lC != null || p != null || c != null) {
            switch (cont) {
                case 1:
                    jTextNameList.setText("Lista Simple");
                    editarTabla(logic.convertirMatrizMostrarAllDataListaSimple(l));
                    break;
                case 2:
                    jTextNameList.setText("Lista Doble");
                    editarTabla(logic.convertirMatrizMostrarAllDataLDoble(lD));
                    break;
                case 3:
                    jTextNameList.setText("Lista Circular");
                    editarTabla(logic.convertirMatrizMostrarAllDataLCircular(lC));
                    break;
            }

            System.err.println(cont);
        }
    }//GEN-LAST:event_jLabel10MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
        //siguiente
        if (0 < cont && cont < 3) {
            cont++;
        } else {
            JOptionPane.showMessageDialog(null, "No hay mas Listas");
        }

        if (l != null || lD != null || lC != null || p != null || c != null) {
            switch (cont) {
                case 1:
                    jTextNameList.setText("Lista Simple");
                    editarTabla(logic.convertirMatrizMostrarAllDataListaSimple(l));
                    break;
                case 2:
                    jTextNameList.setText("Lista Doble");
                    editarTabla(logic.convertirMatrizMostrarAllDataLDoble(lD));
                    break;
                case 3:
                    jTextNameList.setText("Lista Circular");
                    editarTabla(logic.convertirMatrizMostrarAllDataLCircular(lC));
                    break;
            }
            System.err.println(cont);
        }

    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fondo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextNameList;
    private javax.swing.JTable table;
    // End of variables declaration//GEN-END:variables

//encapsulamiento
}