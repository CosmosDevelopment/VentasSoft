/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package views;

import ctrl.BackUp;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author wasp
 */
public class Menu extends javax.swing.JFrame {
    
    /**
     * Creates new form Menu
     */
    public Menu() {
        
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.repaint();
        this.setResizable(false);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenu = new javax.swing.JPanel();
        btnAreaCliente = new javax.swing.JButton();
        btnAreaProducto = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        botonCerrarSesion = new javax.swing.JButton();
        btnBackUp = new javax.swing.JButton();
        btnCambiarContraseña = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 204));
        setIconImage(getIconImage());
        setUndecorated(true);

        panelMenu.setName("panelMenu"); // NOI18N

        btnAreaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cliente.png"))); // NOI18N
        btnAreaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaClienteActionPerformed(evt);
            }
        });

        btnAreaProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/producto.png"))); // NOI18N
        btnAreaProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaProductoActionPerformed(evt);
            }
        });

        jLabel1.setText("Seleccione una opción para entrar al sistema:");

        jLabel2.setText("Área Clientes");

        jLabel3.setText("Área Productos");

        botonCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/logout.png"))); // NOI18N
        botonCerrarSesion.setText("Cerrar Sesión");
        botonCerrarSesion.setName("botonCerrarSesion"); // NOI18N
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        btnBackUp.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/backup.png"))); // NOI18N
        btnBackUp.setText("Respaldo");
        btnBackUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackUpActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelMenuLayout = new javax.swing.GroupLayout(panelMenu);
        panelMenu.setLayout(panelMenuLayout);
        panelMenuLayout.setHorizontalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 143, Short.MAX_VALUE)
                                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnAreaCliente)
                                    .addGroup(panelMenuLayout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jLabel2)))
                                .addGap(162, 162, 162))
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(btnBackUp, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelMenuLayout.createSequentialGroup()
                                .addComponent(btnAreaProducto)
                                .addGap(151, 151, 151))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(189, 189, 189))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                                .addComponent(botonCerrarSesion)
                                .addGap(25, 25, 25))))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap())))
        );
        panelMenuLayout.setVerticalGroup(
            panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(btnAreaProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3))
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addComponent(btnAreaCliente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)))
                .addGroup(panelMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(botonCerrarSesion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBackUp)
                        .addGap(28, 28, 28))))
        );

        btnCambiarContraseña.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/pass.png"))); // NOI18N
        btnCambiarContraseña.setText("Cambiar contraseña");
        btnCambiarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(panelMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCambiarContraseña)
                .addGap(44, 44, 44))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(btnCambiarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icono.png"));
        
        
        return retValue;
    }
    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        this.setEnabled(false);
        this.setVisible(false);
        Login log=new  Login();
        log.setVisible(true);
        this.setEnabled(true);
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void btnAreaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaClienteActionPerformed
        this.setEnabled(false);
        
        MenuCliente m= new MenuCliente();
        m.setVisible(true);
        this.setVisible(false);
        this.setEnabled(true);
    }//GEN-LAST:event_btnAreaClienteActionPerformed

    private void btnAreaProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaProductoActionPerformed
        
        this.setEnabled(false);
        MenuProducto mp= new MenuProducto();
        mp.setVisible(true);
        this.setVisible(false);
        this.setEnabled(true);
    }//GEN-LAST:event_btnAreaProductoActionPerformed

    private void btnBackUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackUpActionPerformed
        this.setEnabled(false);
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        Date fecha= new Date();
        String fechaConvert= sdf.format(fecha);
        
        
        new BackUp().CrearBackup("localhost", "3306", "root", "root", "softventas","C:\\CuotaSoft\\Dumps\\dump-"+fechaConvert  +".sql");
        JOptionPane.showMessageDialog (null, "Respaldo generado exitosamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
        
        this.setEnabled(true);
    }//GEN-LAST:event_btnBackUpActionPerformed

    private void btnCambiarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarContraseñaActionPerformed
        this.setEnabled(false);
        cambiarContraseña cambiarPass = new cambiarContraseña();
        cambiarPass.setVisible(true);
        this.setVisible(false);
        this.setEnabled(true);
    }//GEN-LAST:event_btnCambiarContraseñaActionPerformed
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton btnAreaCliente;
    private javax.swing.JButton btnAreaProducto;
    private javax.swing.JButton btnBackUp;
    private javax.swing.JButton btnCambiarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel panelMenu;
    // End of variables declaration//GEN-END:variables
}
