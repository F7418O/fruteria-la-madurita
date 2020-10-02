package Ventanas;
import Clases.Proveedores;
import Project.Conexion;
import Project.FuncionesArchivos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author Frael Campos
 */
public class Proveedor extends javax.swing.JFrame {
    private Connection con;
    
    public Proveedor() throws SQLException, ClassNotFoundException {
        setTitle("Proveedores");
        initComponents();
        setLocationRelativeTo(null);
        
        mostrar();
    }
    public void mostrar() throws SQLException, ClassNotFoundException {
        this.con= Conexion.getConnection();
        FuncionesArchivos.mostrarProveedores(con, tabla_proveedores);
        con.close();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        empre_prov = new javax.swing.JTextField();
        id_prov = new javax.swing.JTextField();
        dir_prov = new javax.swing.JTextField();
        ciud_prov = new javax.swing.JTextField();
        contac_prov = new javax.swing.JTextField();
        telef_prov = new javax.swing.JTextField();
        eliminar = new javax.swing.JButton();
        modificar = new javax.swing.JButton();
        registrar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_proveedores = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar Proveedor", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Book Antiqua", 3, 18))); // NOI18N

        jLabel1.setText("Nombre de la Empresa u Organización");

        jLabel2.setText("Nombre del Contacto");

        jLabel3.setText("Direccion de la Empresa");

        jLabel4.setText("Telefono");

        jLabel5.setText("Numero de Proveedor");

        jLabel6.setText("Ciudad/Provincia");

        empre_prov.setText(" ");
        empre_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                empre_provActionPerformed(evt);
            }
        });

        id_prov.setText(" ");
        id_prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_provKeyTyped(evt);
            }
        });

        dir_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dir_provActionPerformed(evt);
            }
        });

        contac_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contac_provActionPerformed(evt);
            }
        });
        contac_prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contac_provKeyTyped(evt);
            }
        });

        telef_prov.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telef_provActionPerformed(evt);
            }
        });
        telef_prov.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telef_provKeyTyped(evt);
            }
        });

        eliminar.setText("Eliminar Proveedor");
        eliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarActionPerformed(evt);
            }
        });

        modificar.setText("Modificar Proveedor");
        modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                modificarActionPerformed(evt);
            }
        });

        registrar.setText("Registar Proveedor");
        registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        tabla_proveedores.setBackground(new java.awt.Color(204, 255, 255));
        tabla_proveedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tabla_proveedores.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_proveedoresMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_proveedores);

        jLabel7.setBackground(new java.awt.Color(102, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Proveedores Registrados");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addGap(186, 186, 186))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(empre_prov)
                            .addGap(133, 133, 133)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dir_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel2)
                                    .addComponent(ciud_prov)
                                    .addComponent(telef_prov, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(133, 133, 133)
                                        .addComponent(registrar))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(eliminar))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(contac_prov, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(modificar)))
                        .addGap(361, 361, 361))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(empre_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ciud_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(registrar))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2))
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(modificar)
                    .addComponent(id_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contac_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dir_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(telef_prov, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(eliminar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 776, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void empre_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_empre_provActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_empre_provActionPerformed

    private void telef_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telef_provActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_telef_provActionPerformed

    private void eliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarActionPerformed
   
        if(contac_prov.getText().isEmpty() || empre_prov.getText().isEmpty() || dir_prov.getText().isEmpty()
                || telef_prov.getText().isEmpty() || id_prov.getText().isEmpty() || ciud_prov.getText().isEmpty()){
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor");
        }
        else{
            try {
                this.con= Conexion.getConnection();
                FuncionesArchivos.eliminarProveedor(con, id_prov.getText());
                con.close();
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
            }
          
        
        }
    }//GEN-LAST:event_eliminarActionPerformed

    private void id_provKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_provKeyTyped
     char Val=evt.getKeyChar();
     
     if(Character.isLetter(Val)){
     evt.consume();
     }
    }//GEN-LAST:event_id_provKeyTyped

    private void telef_provKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telef_provKeyTyped
     char Val=evt.getKeyChar();
     
     if(Character.isLetter(Val)){
     evt.consume();
     }   
    }//GEN-LAST:event_telef_provKeyTyped

    private void contac_provKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contac_provKeyTyped
     char Val=evt.getKeyChar();
     
     if(Character.isDigit(Val)){
     evt.consume();
     }   
    }//GEN-LAST:event_contac_provKeyTyped

    private void contac_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contac_provActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contac_provActionPerformed

    private void modificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_modificarActionPerformed
      
    }//GEN-LAST:event_modificarActionPerformed

    private void registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarActionPerformed
        Proveedores prov= null;       
        if(empre_prov.getText().isEmpty() || id_prov.getText().isEmpty() || ciud_prov.getText().isEmpty() || 
                        dir_prov.getText().isEmpty() || contac_prov.getText().isEmpty() || telef_prov.getText().isEmpty()){
                    
                    
                    JOptionPane.showMessageDialog(null, "Llene todos los campos");
                    
                }
                    else{
                            
                    try {
                        this.con = Conexion.getConnection();
                        prov= new Proveedores(Integer.parseInt(id_prov.getText()),empre_prov.getText(),contac_prov.getText()
                        ,dir_prov.getText(), Integer.parseInt(telef_prov.getText()),ciud_prov.getText() );
                        FuncionesArchivos.ingresarProveedor(con, prov);
                    } catch (ClassNotFoundException ex) {
                        Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (SQLException ex) {
                        Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                    }         

                                         

            }
        
        
    }//GEN-LAST:event_registrarActionPerformed

    private void dir_provActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dir_provActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dir_provActionPerformed

    private void tabla_proveedoresMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_proveedoresMouseClicked
       int seleccion= tabla_proveedores.rowAtPoint(evt.getPoint());
       
       id_prov.setText(tabla_proveedores.getValueAt(seleccion, 0)+"");
       empre_prov.setText(tabla_proveedores.getValueAt(seleccion, 1)+"");
       contac_prov.setText(tabla_proveedores.getValueAt(seleccion, 2)+"");
       dir_prov.setText(tabla_proveedores.getValueAt(seleccion, 3)+"");
       telef_prov.setText(tabla_proveedores.getValueAt(seleccion, 4)+"");
       ciud_prov.setText(tabla_proveedores.getValueAt(seleccion, 5)+"");
  
       
    }//GEN-LAST:event_tabla_proveedoresMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Proveedor().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(Proveedor.class.getName()).log(Level.SEVERE, null, ex);
                }   
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ciud_prov;
    private javax.swing.JTextField contac_prov;
    private javax.swing.JTextField dir_prov;
    private javax.swing.JButton eliminar;
    private javax.swing.JTextField empre_prov;
    private javax.swing.JTextField id_prov;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton modificar;
    private javax.swing.JButton registrar;
    private javax.swing.JTable tabla_proveedores;
    private javax.swing.JTextField telef_prov;
    // End of variables declaration//GEN-END:variables
}
