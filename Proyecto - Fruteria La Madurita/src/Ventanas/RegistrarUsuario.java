package Ventanas;

import Clases.Empleado;
import Project.Conexion;
import Project.FuncionesArchivos;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import placeH.TextPrompt;

/**
 *
 * @author Frael Campos
 */
public class RegistrarUsuario extends javax.swing.JFrame {

    public Empleado emp;

    private RegistrarUsuario() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public void setEmpleado(Empleado emp){
        this.emp=emp;
    }

    public RegistrarUsuario(Empleado emp) {
        setResizable(false);
        setTitle("Registro");
        initComponents();
        this.setIconImage(new ImageIcon(getClass().getResource("/Imagenes/icono.jpg")).getImage());
        this.setLocationRelativeTo(null);
        TextPrompt nom = new TextPrompt("Nombres", nombre_r);

        TextPrompt apell = new TextPrompt("Apellidos", apellido_r);

        TextPrompt pass = new TextPrompt("Contraseña", contra_r);
        TextPrompt cedula = new TextPrompt("Cedula", cedula_r);

        // TextPrompt fecha= new TextPrompt("Fecha de Nacimiento", fecha_na_r);
        TextPrompt telef = new TextPrompt("Telefono", telefono_r);

        String[] roles = {"------", "Administrador - 1", "Vendedor - 2"};
        rol.setModel(new javax.swing.DefaultComboBoxModel(roles));
        rol.setSelectedIndex(0);
        
        setEmpleado(emp);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        registrar_usr = new javax.swing.JButton();
        nombre_r = new javax.swing.JTextField();
        apellido_r = new javax.swing.JTextField();
        cedula_r = new javax.swing.JTextField();
        telefono_r = new javax.swing.JTextField();
        contra_r = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        rol = new javax.swing.JComboBox<>();
        volver = new javax.swing.JButton();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Registrar", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Georgia", 2, 18))); // NOI18N
        jPanel1.setForeground(new java.awt.Color(51, 153, 255));
        jPanel1.setPreferredSize(new java.awt.Dimension(555, 500));

        txtnombre.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        txtnombre.setText("Nombres");

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel2.setText("Apellidos");

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel4.setText("Cedúla");

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel5.setText("Contraseña");

        jLabel8.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel8.setText("Telefono");

        registrar_usr.setText("Registrar");
        registrar_usr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrar_usrActionPerformed(evt);
            }
        });

        nombre_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_rActionPerformed(evt);
            }
        });
        nombre_r.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombre_rKeyTyped(evt);
            }
        });

        apellido_r.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                apellido_rKeyTyped(evt);
            }
        });

        cedula_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cedula_rActionPerformed(evt);
            }
        });
        cedula_r.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedula_rKeyTyped(evt);
            }
        });

        telefono_r.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                telefono_rKeyTyped(evt);
            }
        });

        contra_r.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                contra_rKeyTyped(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Book Antiqua", 3, 14)); // NOI18N
        jLabel11.setText("Tipo de Usuario");

        rol.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-----", "Administrador", "Vendedor", "Comprador", "Facturador" }));
        rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rolActionPerformed(evt);
            }
        });

        volver.setText("Atrás");
        volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel2)
                    .addComponent(jLabel8)
                    .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(contra_r, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                        .addComponent(cedula_r, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(apellido_r, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(nombre_r, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(telefono_r, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 141, Short.MAX_VALUE)
                .addComponent(volver, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addComponent(registrar_usr, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtnombre)
                            .addComponent(nombre_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(volver)))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apellido_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cedula_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(contra_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(telefono_r, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 88, Short.MAX_VALUE)
                .addComponent(registrar_usr)
                .addGap(61, 61, 61))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 619, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 516, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrar_usrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrar_usrActionPerformed

        if ((nombre_r.getText().isEmpty() || apellido_r.getText().isEmpty() || cedula_r.getText().isEmpty()
                || contra_r.getText().isEmpty()) || rol.getSelectedIndex() == 0) {
            JOptionPane.showMessageDialog(this, "Complete todos los campos");
        } else {

            emp = new Empleado(rol.getSelectedIndex(), Integer.parseInt(cedula_r.getText()), nombre_r.getText(), apellido_r.getText(),
                     Integer.parseInt(telefono_r.getText()), contra_r.getText());

            Connection con;
            try {
                con = Conexion.getConnection();
                FuncionesArchivos.crearEmpleado(con, emp);
                con.close();
                JOptionPane.showMessageDialog(null, "Usuario ingresado correctamente");
            } catch (SQLException ex) {
                Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(RegistrarUsuario.class.getName()).log(Level.SEVERE, null, ex);
            }

            nombre_r.setText("");
            apellido_r.setText("");
            cedula_r.setText("");
            contra_r.setText("");
            telefono_r.setText("");

        }
    }//GEN-LAST:event_registrar_usrActionPerformed


    private void nombre_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_rActionPerformed

    }//GEN-LAST:event_nombre_rActionPerformed

    private void volverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volverActionPerformed
        Menu ot = new Menu(emp);
        ot.setVisible(true);
        dispose();

    }//GEN-LAST:event_volverActionPerformed

    private void cedula_rKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedula_rKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isLetter(Val)) {
            evt.consume();
        }
        if (cedula_r.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_cedula_rKeyTyped

    private void telefono_rKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_telefono_rKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isLetter(Val)) {
            evt.consume();
        }
        if (telefono_r.getText().length() > 10) {
            evt.consume();
        }
    }//GEN-LAST:event_telefono_rKeyTyped

    private void nombre_rKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombre_rKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isDigit(Val)) {
            evt.consume();
        }
        if (nombre_r.getText().length() > 29) {
            evt.consume();
        }
    }//GEN-LAST:event_nombre_rKeyTyped

    private void apellido_rKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_apellido_rKeyTyped
        char Val = evt.getKeyChar();

        if (Character.isDigit(Val)) {
            evt.consume();
        }
        if (apellido_r.getText().length() > 30) {
            evt.consume();
        }
    }//GEN-LAST:event_apellido_rKeyTyped

    private void rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rolActionPerformed

    private void cedula_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cedula_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cedula_rActionPerformed

    private void contra_rKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contra_rKeyTyped
        if (contra_r.getText().length() > 15) {
            evt.consume();
        }
    }//GEN-LAST:event_contra_rKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellido_r;
    private javax.swing.JTextField cedula_r;
    private javax.swing.JPasswordField contra_r;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nombre_r;
    private javax.swing.JButton registrar_usr;
    private javax.swing.JComboBox<String> rol;
    private javax.swing.JTextField telefono_r;
    private javax.swing.JLabel txtnombre;
    private javax.swing.JButton volver;
    // End of variables declaration//GEN-END:variables
}
