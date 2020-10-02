
package Ventanas;

import Ventanas.Menu;

import static Project.FuncionesArchivos.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Frael Campos
 */
public class Pedidos extends javax.swing.JFrame {

  
    public Pedidos() {
       
        setTitle("Ventas");
        initComponents();
        setLocationRelativeTo(null);
   
   
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        panel_datosclien = new javax.swing.JPanel();
        txtnom_clien = new javax.swing.JLabel();
        txtcedula_clien = new javax.swing.JLabel();
        cedula_clien = new javax.swing.JTextField();
        agregar_nuevo_cli = new javax.swing.JButton();
        fechadepedido = new javax.swing.JLabel();
        nom_clien1 = new javax.swing.JTextField();
        Día = new javax.swing.JComboBox<>();
        Mes = new javax.swing.JComboBox<>();
        Anio = new javax.swing.JComboBox<>();
        fechadeentrega = new javax.swing.JLabel();
        Día1 = new javax.swing.JComboBox<>();
        Mes1 = new javax.swing.JComboBox<>();
        Anio1 = new javax.swing.JComboBox<>();
        panel_detalleYventa = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        detalles_productos = new javax.swing.JTable();
        quitar_prod = new javax.swing.JButton();
        panel_buscaprod = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        busca_prod_por = new javax.swing.JComboBox<>();
        produ_a_buscar = new javax.swing.JTextField();
        cant_ve = new javax.swing.JTextField();
        volver_menu = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        productos = new javax.swing.JTable();
        mostrar_productos = new javax.swing.JButton();
        agregar_produc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel_base.setBackground(new java.awt.Color(255, 255, 255));

        panel_datosclien.setBackground(new java.awt.Color(204, 255, 255));
        panel_datosclien.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos Cliente", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        txtnom_clien.setText("Nombre:");

        txtcedula_clien.setText("Nº Cedula:");

        agregar_nuevo_cli.setText("Agregar Nuevo");
        agregar_nuevo_cli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_nuevo_cliActionPerformed(evt);
            }
        });

        fechadepedido.setText("Fecha de  Pedido");

        nom_clien1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nom_clien1ActionPerformed(evt);
            }
        });

        Día.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        Mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        Anio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024" }));

        fechadeentrega.setText("Fecha de Entrega");

        Día1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        Día1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Día1ActionPerformed(evt);
            }
        });

        Mes1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        Anio1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024" }));

        javax.swing.GroupLayout panel_datosclienLayout = new javax.swing.GroupLayout(panel_datosclien);
        panel_datosclien.setLayout(panel_datosclienLayout);
        panel_datosclienLayout.setHorizontalGroup(
            panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_datosclienLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_datosclienLayout.createSequentialGroup()
                        .addComponent(fechadepedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Día, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Mes, 0, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Anio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4))
                    .addGroup(panel_datosclienLayout.createSequentialGroup()
                        .addComponent(fechadeentrega)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Día1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Mes1, 0, 1, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(3, 3, 3))))
            .addGroup(panel_datosclienLayout.createSequentialGroup()
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nom_clien1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtnom_clien))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosclienLayout.createSequentialGroup()
                        .addComponent(agregar_nuevo_cli)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_datosclienLayout.createSequentialGroup()
                        .addComponent(cedula_clien, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))
                    .addGroup(panel_datosclienLayout.createSequentialGroup()
                        .addComponent(txtcedula_clien)
                        .addContainerGap())))
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
                    .addComponent(cedula_clien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nom_clien1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechadepedido)
                    .addComponent(Día, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_datosclienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fechadeentrega)
                    .addComponent(Día1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Mes1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Anio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(agregar_nuevo_cli))
        );

        panel_detalleYventa.setBackground(new java.awt.Color(204, 255, 255));
        panel_detalleYventa.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Detalle", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        detalles_productos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        detalles_productos.setBackground(new java.awt.Color(0, 102, 255));
        detalles_productos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(detalles_productos);

        quitar_prod.setText("Quitar Producto");
        quitar_prod.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quitar_prodActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_detalleYventaLayout = new javax.swing.GroupLayout(panel_detalleYventa);
        panel_detalleYventa.setLayout(panel_detalleYventaLayout);
        panel_detalleYventaLayout.setHorizontalGroup(
            panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 683, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_detalleYventaLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(quitar_prod)))
                .addContainerGap())
        );
        panel_detalleYventaLayout.setVerticalGroup(
            panel_detalleYventaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_detalleYventaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(quitar_prod)
                .addContainerGap())
        );

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addComponent(panel_datosclien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_detalleYventa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_datosclien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panel_detalleYventa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        panel_buscaprod.setBackground(new java.awt.Color(204, 255, 255));
        panel_buscaprod.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Book Antiqua", 2, 14))); // NOI18N

        jLabel1.setText("Buscar cajón");

        busca_prod_por.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Còdigo de cajòn", "Nombre de Producto" }));
        busca_prod_por.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busca_prod_porActionPerformed(evt);
            }
        });

        produ_a_buscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                produ_a_buscarActionPerformed(evt);
            }
        });

        volver_menu.setText("Volver");
        volver_menu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_menuActionPerformed(evt);
            }
        });

        productos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int columnIndex){
                return false;
            }
        };
        productos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        productos.setGridColor(new java.awt.Color(0, 51, 204));
        jScrollPane2.setViewportView(productos);

        mostrar_productos.setText("Mostrar Cajón");
        mostrar_productos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mostrar_productosActionPerformed(evt);
            }
        });

        agregar_produc.setText("Agregar");
        agregar_produc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_producActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_buscaprodLayout = new javax.swing.GroupLayout(panel_buscaprod);
        panel_buscaprod.setLayout(panel_buscaprodLayout);
        panel_buscaprodLayout.setHorizontalGroup(
            panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscaprodLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(busca_prod_por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(produ_a_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cant_ve, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(mostrar_productos)
                .addGap(69, 69, 69)
                .addComponent(agregar_produc)
                .addGap(132, 132, 132)
                .addComponent(volver_menu)
                .addContainerGap())
            .addGroup(panel_buscaprodLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        panel_buscaprodLayout.setVerticalGroup(
            panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_buscaprodLayout.createSequentialGroup()
                .addGroup(panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_buscaprodLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(panel_buscaprodLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(busca_prod_por, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(produ_a_buscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cant_ve, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mostrar_productos)
                            .addComponent(agregar_produc)))
                    .addComponent(volver_menu))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_base, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panel_buscaprod, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(panel_buscaprod, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(118, 118, 118))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    
   public void AgregarADetalle(){
   if(productos.getSelectedRow()!=-1){
        int cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad deseada: "));
         if (cantidad > Integer.parseInt(productos.getValueAt(productos.getSelectedRow(), 2).toString())) {
                JOptionPane.showMessageDialog(null, "No hay stock suficiente!", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
            } else {
     
   }
   }
    else {
            JOptionPane.showMessageDialog(null, "Porfavor, seleccione un producto para continuar!", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
   }
   }
    private void produ_a_buscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_produ_a_buscarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_produ_a_buscarActionPerformed

    private void agregar_nuevo_cliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_nuevo_cliActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_agregar_nuevo_cliActionPerformed

    private void volver_menuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_menuActionPerformed
      Menu ot=new Menu();
      ot.setVisible(true);
     dispose();  
    }//GEN-LAST:event_volver_menuActionPerformed

    private void mostrar_productosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mostrar_productosActionPerformed
    
    }//GEN-LAST:event_mostrar_productosActionPerformed

    private void agregar_producActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_producActionPerformed
       AgregarADetalle();
    }//GEN-LAST:event_agregar_producActionPerformed

    private void quitar_prodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quitar_prodActionPerformed
      int fila=detalles_productos.getSelectedRow();
      if(fila>-1){
      //
      }else{
          JOptionPane.showMessageDialog(null, "Porfavor, seleccione un producto para continuar!", "Informacion!", JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_quitar_prodActionPerformed

    private void busca_prod_porActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busca_prod_porActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_busca_prod_porActionPerformed

    private void nom_clien1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nom_clien1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nom_clien1ActionPerformed

    private void Día1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Día1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Día1ActionPerformed


    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Anio;
    private javax.swing.JComboBox<String> Anio1;
    private javax.swing.JComboBox<String> Día;
    private javax.swing.JComboBox<String> Día1;
    private javax.swing.JComboBox<String> Mes;
    private javax.swing.JComboBox<String> Mes1;
    private javax.swing.JButton agregar_nuevo_cli;
    private javax.swing.JButton agregar_produc;
    private javax.swing.JComboBox<String> busca_prod_por;
    private javax.swing.JTextField cant_ve;
    private javax.swing.JTextField cedula_clien;
    private javax.swing.JTable detalles_productos;
    private javax.swing.JLabel fechadeentrega;
    private javax.swing.JLabel fechadepedido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton mostrar_productos;
    private javax.swing.JTextField nom_clien1;
    private javax.swing.JPanel panel_base;
    private javax.swing.JPanel panel_buscaprod;
    private javax.swing.JPanel panel_datosclien;
    private javax.swing.JPanel panel_detalleYventa;
    private javax.swing.JTextField produ_a_buscar;
    private javax.swing.JTable productos;
    private javax.swing.JButton quitar_prod;
    private javax.swing.JLabel txtcedula_clien;
    private javax.swing.JLabel txtnom_clien;
    private javax.swing.JButton volver_menu;
    // End of variables declaration//GEN-END:variables
}
