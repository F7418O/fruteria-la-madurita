
package Ventanas;

import Clases.Empleado;
import java.awt.Image;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Frael Campos
 * 
 */
public class Menu extends javax.swing.JFrame {

ImageIcon icc=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon logouu;

ImageIcon icc1=  new ImageIcon(getClass().getResource("/Imagenes/inventario.png"));
ImageIcon inven;

ImageIcon icc3=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon vent;

ImageIcon icc4=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon provee;

ImageIcon icc5=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon client;

ImageIcon icc6=  new ImageIcon(getClass().getResource("/Imagenes/logut2.png"));
ImageIcon factura;

 
private Empleado emp ;

    private Menu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setEmpleado(Empleado emp){
        this.emp=emp;
    }
     public  Empleado getEmpleado(){
        return this.emp;
    }

    public Menu(Empleado emp) {
        setTitle("Fruteria la Madurita.");
        initComponents();
        setResizable(false);
        setLocationRelativeTo(null);
        setEmpleado(emp);
        
        String a=null;
        if(emp.getId_rol()== 1){
        a="Administrador";
        }else{
        a="Vendedor";
        }
        
        txtname.setText(emp.getNombre());
        txtrol.setText(emp.getApellido());
        txtapellido.setText(a);
        
    }
   
    
   
   
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_base = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtname = new javax.swing.JLabel();
        txtrol = new javax.swing.JLabel();
        salir = new javax.swing.JButton();
        txtapellido = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        inventario = new javax.swing.JMenu();
        inventario_win = new javax.swing.JMenuItem();
        agregarprouctos = new javax.swing.JMenuItem();
        clientes = new javax.swing.JMenu();
        r_clientes_win = new javax.swing.JMenuItem();
        ventas = new javax.swing.JMenu();
        venta_win = new javax.swing.JMenuItem();
        compras = new javax.swing.JMenu();
        productos_v = new javax.swing.JMenuItem();
        provee_win = new javax.swing.JMenuItem();
        factura_win = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        usuarioss = new javax.swing.JMenu();
        re_usuario = new javax.swing.JMenuItem();
        ver_usuarios = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        panel_base.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FRUTERIA LA MADURITA.PNG"))); // NOI18N

        txtname.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        txtname.setText("UserName");

        txtrol.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        txtrol.setText("RolUser");

        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/SalirSesion.png"))); // NOI18N
        salir.setText("Cerrar Sesión");
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        txtapellido.setFont(new java.awt.Font("Georgia", 2, 18)); // NOI18N
        txtapellido.setText("Apellido");

        javax.swing.GroupLayout panel_baseLayout = new javax.swing.GroupLayout(panel_base);
        panel_base.setLayout(panel_baseLayout);
        panel_baseLayout.setHorizontalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_baseLayout.createSequentialGroup()
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panel_baseLayout.createSequentialGroup()
                                .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addComponent(txtapellido, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtrol, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGap(234, 234, 234)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panel_baseLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 473, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        panel_baseLayout.setVerticalGroup(
            panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_baseLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(panel_baseLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname)
                    .addComponent(txtapellido))
                .addGap(26, 26, 26)
                .addComponent(txtrol)
                .addGap(36, 36, 36)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(salir)
                .addGap(24, 24, 24))
        );

        jMenuBar1.setBackground(new java.awt.Color(0, 153, 153));
        jMenuBar1.setForeground(new java.awt.Color(204, 255, 255));
        jMenuBar1.setAlignmentY(1.0F);
        jMenuBar1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        inventario.setText("Productos");
        inventario.setFont(new java.awt.Font("Sitka Banner", 2, 18)); // NOI18N

        inventario_win.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        inventario_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/Productos.png"))); // NOI18N
        inventario_win.setText("Cajones");
        inventario_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inventario_winActionPerformed(evt);
            }
        });
        inventario.add(inventario_win);

        agregarprouctos.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        agregarprouctos.setText("Agregar Productos a Cajon");
        agregarprouctos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarprouctosActionPerformed(evt);
            }
        });
        inventario.add(agregarprouctos);

        jMenuBar1.add(inventario);

        clientes.setText("Clientes");
        clientes.setFont(new java.awt.Font("Sitka Display", 2, 18)); // NOI18N

        r_clientes_win.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        r_clientes_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Files/usuario.png"))); // NOI18N
        r_clientes_win.setText("Registrar Clientes");
        r_clientes_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                r_clientes_winActionPerformed(evt);
            }
        });
        clientes.add(r_clientes_win);

        jMenuBar1.add(clientes);

        ventas.setText("Ventas");
        ventas.setFont(new java.awt.Font("Sitka Banner", 2, 18)); // NOI18N

        venta_win.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        venta_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/archivo24x24.png"))); // NOI18N
        venta_win.setText("Pedidos");
        venta_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                venta_winActionPerformed(evt);
            }
        });
        ventas.add(venta_win);

        jMenuBar1.add(ventas);

        compras.setText("Compra");
        compras.setFont(new java.awt.Font("Sitka Banner", 2, 18)); // NOI18N

        productos_v.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        productos_v.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/movimientos24x24.png"))); // NOI18N
        productos_v.setText("Productos");
        productos_v.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                productos_vActionPerformed(evt);
            }
        });
        compras.add(productos_v);

        provee_win.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        provee_win.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/clientes24x24.png"))); // NOI18N
        provee_win.setText("Proveedores");
        provee_win.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                provee_winActionPerformed(evt);
            }
        });
        compras.add(provee_win);

        jMenuBar1.add(compras);

        factura_win.setText("Facturación");
        factura_win.setFocusable(false);
        factura_win.setFont(new java.awt.Font("Sitka Banner", 2, 18)); // NOI18N

        jMenuItem1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        jMenuItem1.setText("Factura");
        factura_win.add(jMenuItem1);

        jMenuBar1.add(factura_win);

        usuarioss.setText("Usuarios");
        usuarioss.setFont(new java.awt.Font("Sitka Banner", 2, 18)); // NOI18N

        re_usuario.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        re_usuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/usuarioCambio24x24.png"))); // NOI18N
        re_usuario.setText("Registar Usuario");
        re_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                re_usuarioActionPerformed(evt);
            }
        });
        usuarioss.add(re_usuario);

        ver_usuarios.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        ver_usuarios.setText("Ver Usuarios");
        ver_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_usuariosActionPerformed(evt);
            }
        });
        usuarioss.add(ver_usuarios);

        jMenuBar1.add(usuarioss);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel_base, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void venta_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_venta_winActionPerformed
      Pedidosv ot;
      
    try {
      ot = new Pedidosv(this.emp);  
      ot.setVisible(true);
    } catch (SQLException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
     dispose();  
    }//GEN-LAST:event_venta_winActionPerformed

    private void inventario_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inventario_winActionPerformed
        Cajon ot;
    try {
        ot = new Cajon(this.emp);
        ot.setVisible(true);
        dispose();
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    } catch (SQLException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
        
        
    }//GEN-LAST:event_inventario_winActionPerformed

    private void r_clientes_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_r_clientes_winActionPerformed
       Clientesv ot = new Clientesv(this.emp);
       ot.setVisible(true);
       dispose();
    }//GEN-LAST:event_r_clientes_winActionPerformed

    private void re_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_re_usuarioActionPerformed
        RegistrarUsuario ot= new RegistrarUsuario(this.emp);
        ot.setVisible(true);
        dispose();
    }//GEN-LAST:event_re_usuarioActionPerformed

    private void productos_vActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productos_vActionPerformed
        Productov ot= new Productov(emp);
        ot.setVisible(true);
        dispose();
    }//GEN-LAST:event_productos_vActionPerformed

    private void ver_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_usuariosActionPerformed
       Users ot = new Users(emp);
       ot.setVisible(true);
       dispose();
    }//GEN-LAST:event_ver_usuariosActionPerformed

    private void agregarprouctosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarprouctosActionPerformed
        AgregarProductoaCajon ot;
    try {
        ot = new AgregarProductoaCajon(emp);
        ot.setVisible(true);
        dispose();
    } catch (SQLException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
       
    }//GEN-LAST:event_agregarprouctosActionPerformed

    private void provee_winActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_provee_winActionPerformed
    try {
        Proveedor ot=new Proveedor(emp);
        ot.setVisible(true);
        dispose();
    } catch (SQLException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    } catch (ClassNotFoundException ex) {
        Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
    }
    }//GEN-LAST:event_provee_winActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
       Login ot=new Login();
       ot.setVisible(true);
       dispose();
    }//GEN-LAST:event_salirActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem agregarprouctos;
    public javax.swing.JMenu clientes;
    public javax.swing.JMenu compras;
    public javax.swing.JMenu factura_win;
    public javax.swing.JMenu inventario;
    private javax.swing.JMenuItem inventario_win;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel panel_base;
    private javax.swing.JMenuItem productos_v;
    private javax.swing.JMenuItem provee_win;
    private javax.swing.JMenuItem r_clientes_win;
    private javax.swing.JMenuItem re_usuario;
    private javax.swing.JButton salir;
    private javax.swing.JLabel txtapellido;
    private javax.swing.JLabel txtname;
    private javax.swing.JLabel txtrol;
    public javax.swing.JMenu usuarioss;
    private javax.swing.JMenuItem venta_win;
    public javax.swing.JMenu ventas;
    private javax.swing.JMenuItem ver_usuarios;
    // End of variables declaration//GEN-END:variables
}
