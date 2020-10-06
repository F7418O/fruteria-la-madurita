
package Ventanas;

import Clases.Empleado;
import Project.Conexion;
import Project.FuncionesArchivos;
import Ventanas.Menu;
import java.sql.Connection;
import Clases.Pedidos;
import static Project.FuncionesArchivos.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Frael Campos
 */
public class Pedidosv extends javax.swing.JFrame {

    Empleado emp;

    private Pedidosv() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public void setEmpleado(Empleado emp){
        this.emp= emp;
    }
    public Pedidosv(Empleado emp) throws SQLException, ClassNotFoundException {
       
        setTitle("Pedidos");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
   
        String []fp= {"----","Efectivo","Tarjeta"};
        forma_pago.setModel(new javax.swing.DefaultComboBoxModel(fp));
        
        setEmpleado(emp);
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        panel_detalleYventa = new javax.swing.JPanel();
        eliminar_pedido = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_pedido = new javax.swing.JTable();
        listar_pedido = new javax.swing.JButton();
        volver = new javax.swing.JButton();
        panel_datosclien = new javax.swing.JPanel();
        txtnom_clien = new javax.swing.JLabel();
        txtcedula_clien = new javax.swing.JLabel();
        cod_pedido = new javax.swing.JTextField();
        agregar_pedido = new javax.swing.JButton();
        fechadepedido = new javax.swing.JLabel();
        id_cliente = new javax.swing.JTextField();
        dia = new javax.swing.JComboBox<>();
        mes = new javax.swing.JComboBox<>();
        anio1 = new javax.swing.JComboBox<>();
        fechadeentrega = new javax.swing.JLabel();
        dia1 = new javax.swing.JComboBox<>();
        mes1 = new javax.swing.JComboBox<>();
        anio = new javax.swing.JComboBox<>();
        descripcion = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        forma_pago = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panel_base.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        panel_detalleYventa.setBackground(new java.awt.Color(204, 255, 255));
        panel_detalleYventa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        eliminar_pedido.setText("Eliminar Pedido");
        eliminar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_pedidoActionPerformed(evt);
            }
        });

        tabla_pedido.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_pedido);

        listar_pedido.setText("Listar Pedidos");
        listar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_pedidoActionPerformed(evt);
            }
        });

        volver.setText("Volver");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_detalleYventaLayout = new javax.swing.GroupLayout(panel_detalleYventa);
        panel_detalleYventa.setLayout(panel_detalleYventaLayout);
        panel_detalleYventaLayout.setHorizontalGroup(
            panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                .addGroup(panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar_pedido)
                            .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                                .addComponent(listar_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(volver))))
                    .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                        .addContainerGap(12, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        panel_detalleYventaLayout.setVerticalGroup(
            panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_detalleYventaLayout.createSequentialGroup()
                .addGroup(panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(listar_pedido)
                    .addComponent(volver))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 261, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(eliminar_pedido))
        );

        panel_datosclien.setBackground(new java.awt.Color(204, 255, 255));
        panel_datosclien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        txtnom_clien.setText("Cliente");

        txtcedula_clien.setText("Codigo Pedido");

        cod_pedido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cod_pedidoKeyTyped(evt);
            }
        });

        agregar_pedido.setText("Agregar Pedido");
        agregar_pedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_pedidoActionPerformed(evt);
            }
        });

        fechadepedido.setText("Fecha de  Pedido");

        id_cliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                id_clienteActionPerformed(evt);
            }
        });
        id_cliente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                id_clienteKeyTyped(evt);
            }
        });

        dia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        anio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024" }));

        fechadeentrega.setText("Fecha de Entrega");

        dia1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dia1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dia1ActionPerformed(evt);
            }
        });

        mes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024" }));
        anio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anioActionPerformed(evt);
            }
        });

        descripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionActionPerformed(evt);
            }
        });

        jLabel1.setText("Descripcion");

        jLabel2.setText("Forma de Pago");

        forma_pago.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----" }));
        forma_pago.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                forma_pagoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_datosclienLayout = new javax.swing.GroupLayout(panel_datosclien);
        panel_datosclien.setLayout(panel_datosclienLayout);
        panel_datosclienLayout.setHorizontalGroup(
            panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosclienLayout.createSequentialGroup()
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnom_clien)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(agregar_pedido)
                .addContainerGap())
            .addGroup(panel_datosclienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosclienLayout.createSequentialGroup()
                        .addComponent(fechadeentrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(mes1, 0, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(anio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))
                    .addGroup(panel_datosclienLayout.createSequentialGroup()
                        .addComponent(fechadepedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosclienLayout.createSequentialGroup()
                                .addComponent(txtcedula_clien)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panel_datosclienLayout.createSequentialGroup()
                                .addComponent(cod_pedido)
                                .addContainerGap())
                            .addGroup(panel_datosclienLayout.createSequentialGroup()
                                .addComponent(mes, 0, 1, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4))))
                    .addGroup(panel_datosclienLayout.createSequentialGroup()
                        .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_datosclienLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18)
                                .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panel_datosclienLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(forma_pago, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 51, Short.MAX_VALUE))))
        );
        panel_datosclienLayout.setVerticalGroup(
            panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosclienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtnom_clien)
                    .addComponent(txtcedula_clien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cod_pedido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(id_cliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechadepedido)
                    .addComponent(dia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechadeentrega)
                    .addComponent(dia1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(anio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(forma_pago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(58, 58, 58)
                .addComponent(agregar_pedido))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_datosclien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panel_detalleYventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panel_detalleYventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_datosclien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void mostrar() throws SQLException, ClassNotFoundException {
        
        Connection con = Conexion.getConnection();
        FuncionesArchivos.mostrarPedidos(con, tabla_pedido);
        con.close();
    }

    
   
    private void agregar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_pedidoActionPerformed
      if(cod_pedido.getText().isEmpty() || descripcion.getText().isEmpty() || id_cliente.getText().isEmpty() || forma_pago.getSelectedIndex()==0){
          JOptionPane.showMessageDialog(null," Llene todos los campos");
      }else{
        int pago = forma_pago.getSelectedIndex();
        String fecha_ped = dia.getSelectedItem().toString()
           +"/"+mes.getSelectedItem().toString()+"/"+ anio.getSelectedItem().toString();
             String fecha_sal = dia1.getSelectedItem().toString()
           +"/"+mes1.getSelectedItem().toString()+"/"+ anio1.getSelectedItem().toString();
             Pedidos ped= new Pedidos(Integer.parseInt(cod_pedido.getText()), Integer.parseInt(id_cliente.getText()),
             fecha_ped, fecha_sal , pago, descripcion.getText());
             Connection con;
          try {
              con = Conexion.getConnection();
              FuncionesArchivos.crearPedido(con, ped);
          } catch (ClassNotFoundException ex) {
              Logger.getLogger(Pedidosv.class.getName()).log(Level.SEVERE, null, ex);
          } catch (SQLException ex) {
              Logger.getLogger(Pedidosv.class.getName()).log(Level.SEVERE, null, ex);
          }
            
      }       
    }//GEN-LAST:event_agregar_pedidoActionPerformed

    private void id_clienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_id_clienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_id_clienteActionPerformed

    private void dia1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dia1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dia1ActionPerformed

    private void anioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anioActionPerformed

    private void descripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_descripcionActionPerformed

    private void eliminar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_pedidoActionPerformed
       int fila = tabla_pedido.getSelectedRow();
        
        if(fila > -1){
           try {
            Connection con= Conexion.getConnection();
            String id= tabla_pedido.getValueAt(fila, 0).toString();
            FuncionesArchivos.eliminarPedido(con, Integer.parseInt(id));
            
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            } catch (SQLException ex) {
                Logger.getLogger(Users.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }else{
            JOptionPane.showMessageDialog(null,"Selecione un pedido");
        }
    }//GEN-LAST:event_eliminar_pedidoActionPerformed

    private void forma_pagoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_forma_pagoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_forma_pagoActionPerformed

    private void listar_pedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_pedidoActionPerformed
        try {
            mostrar();// TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(Pedidosv.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Pedidosv.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_listar_pedidoActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Menu ot= new Menu(this.emp);
       ot.setVisible(true);
       if(this.emp.getId_rol() == 1){
                      ot.inventario.setEnabled(true);
                      ot.factura_win.setEnabled(true);
                      ot.clientes.setEnabled(true);
                      ot.usuarioss.setEnabled(true);
                      ot.ventas.setEnabled(true);
                      ot.compras.setEnabled(true);
                    }
                    else if( this.emp.getId_rol() == 2){
                       ot.inventario.setEnabled(false);
                      ot.factura_win.setEnabled(false);
                      ot.clientes.setEnabled(true);
                      ot.usuarioss.setEnabled(false);
                      ot.ventas.setEnabled(true);
                      ot.compras.setEnabled(true);}
       dispose();
    }//GEN-LAST:event_volverActionPerformed

    private void id_clienteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_id_clienteKeyTyped
    char Val=evt.getKeyChar();
     
     if(Character.isLetter(Val)){
     evt.consume();
     }  
    }//GEN-LAST:event_id_clienteKeyTyped

    private void cod_pedidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cod_pedidoKeyTyped
     char Val=evt.getKeyChar();
     
     if(Character.isLetter(Val)){
     evt.consume();
     }  
    }//GEN-LAST:event_cod_pedidoKeyTyped


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidosv().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar_pedido;
    private javax.swing.JComboBox<String> anio;
    private javax.swing.JComboBox<String> anio1;
    private javax.swing.JTextField cod_pedido;
    private javax.swing.JTextField descripcion;
    private javax.swing.JComboBox<String> dia;
    private javax.swing.JComboBox<String> dia1;
    private javax.swing.JButton eliminar_pedido;
    private javax.swing.JLabel fechadeentrega;
    private javax.swing.JLabel fechadepedido;
    private javax.swing.JComboBox<String> forma_pago;
    private javax.swing.JTextField id_cliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton listar_pedido;
    private javax.swing.JComboBox<String> mes;
    private javax.swing.JComboBox<String> mes1;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPanel panel_datosclien;
    private javax.swing.JPanel panel_detalleYventa;
    private javax.swing.JTable tabla_pedido;
    private javax.swing.JLabel txtcedula_clien;
    private javax.swing.JLabel txtnom_clien;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
