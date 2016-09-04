/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package views;

import ctrl.CtrlProducto;
import entidades.Producto;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author wasp
 */
public class MenuProducto extends javax.swing.JFrame {
    CtrlProducto ctrlProducto= new CtrlProducto();
    
    public MenuProducto() {
        
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        DefaultTableModel modelo= (DefaultTableModel) listaProductos.getModel();
        TableColumn tableColumn = listaProductos.getColumn("ID");
        tableColumn.setPreferredWidth(0);
        tableColumn.setMinWidth(0);
        tableColumn.setMaxWidth(0);
        
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        
        listaProductos.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        listaProductos.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        listaProductos.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        listaProductos.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
        listaProductos.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
        
        int filas= modelo.getRowCount();
        for(int i=1;i<=filas;i++){
            modelo.removeRow(0);
        }
        this.repaint();
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelMenuCliente = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonAddProducto = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBuscarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaProductos = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Light", 0, 24)); // NOI18N
        jLabel1.setText("Menú de Productos");

        jLabel2.setText("Buscar  por Nombre:");

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        jLabel3.setText("Encontrados:");

        botonAddProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addProduct.png"))); // NOI18N
        botonAddProducto.setText("Agregar");
        botonAddProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddProductoActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volver.png"))); // NOI18N
        btnVolver.setText("Volver al Menú Principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscarProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnBuscarProducto.setText("Buscar");
        btnBuscarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarProductoActionPerformed(evt);
            }
        });

        listaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre Producto", "Precio Unitario", "Cantidad", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listaProductos.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        listaProductos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaProductosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaProductos);
        listaProductos.getAccessibleContext().setAccessibleParent(listaProductos);

        javax.swing.GroupLayout panelMenuClienteLayout = new javax.swing.GroupLayout(panelMenuCliente);
        panelMenuCliente.setLayout(panelMenuClienteLayout);
        panelMenuClienteLayout.setHorizontalGroup(
            panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuClienteLayout.createSequentialGroup()
                .addGap(0, 30, Short.MAX_VALUE)
                .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuClienteLayout.createSequentialGroup()
                        .addComponent(botonAddProducto)
                        .addGap(38, 38, 38))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(panelMenuClienteLayout.createSequentialGroup()
                .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuClienteLayout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelMenuClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnBuscarProducto))))
                    .addGroup(panelMenuClienteLayout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addComponent(jLabel3)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(panelMenuClienteLayout.createSequentialGroup()
                .addComponent(btnVolver)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panelMenuClienteLayout.setVerticalGroup(
            panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuClienteLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarProducto))
                .addGap(33, 33, 33)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50)
                .addComponent(botonAddProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnVolver)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelMenuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(panelMenuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
        Menu m=new Menu();
        m.setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_btnVolverActionPerformed

    private void botonAddProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddProductoActionPerformed
        Productos p= new Productos();
        p.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_botonAddProductoActionPerformed

    private void btnBuscarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarProductoActionPerformed
        
        try {
            
            if(txtBusqueda.getText().isEmpty() || txtBusqueda.getText()== null){
                JOptionPane.showMessageDialog (null, "Debe ingresar el nombre del producto", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else{
                DefaultTableModel modelo= (DefaultTableModel) listaProductos.getModel();
                
                int filas= modelo.getRowCount();
                for(int i=1;i<=filas;i++){
                    modelo.removeRow(0);
                }
                ArrayList<Producto> productos=ctrlProducto.buscarPorNombre(txtBusqueda.getText());
                String estadoProducto="";
                if(productos.size()>0){
                    for(Producto p: productos){
                        String[] fila = new String[5];
                        fila[0] = p.getIdProducto().toString();
                        fila[1] = p.getNombreProducto();
                        fila[2] = String.valueOf(p.getPrecioProducto());
                        fila[3] = String.valueOf(p.getCantidadProducto());
                        
                        if(p.isEstadoProducto()){
                            estadoProducto="ACTIVO";
                        }
                        else{
                            estadoProducto="INACTIVO";
                        }
                        fila[4] = estadoProducto;
                        
                        modelo.addRow(fila);
                    }
                    
                }
                else
                    JOptionPane.showMessageDialog (null, "No existen productos relacionados con la búsqueda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                
            }
        } catch (Exception ex) {
            Logger.getLogger(MenuProducto.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnBuscarProductoActionPerformed

    private void listaProductosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaProductosMouseClicked
        
        Productos viewProducto = new Productos();
        
        viewProducto.txtNombreProducto.setText((String) listaProductos.getValueAt(listaProductos.getSelectedRow(),1));
        viewProducto.txtPrecioProducto.setText((String) listaProductos.getValueAt(listaProductos.getSelectedRow(),2));
        viewProducto.txtCantidadProducto.setText((String) listaProductos.getValueAt(listaProductos.getSelectedRow(),3));
        viewProducto.txtID.setText((String) listaProductos.getValueAt(listaProductos.getSelectedRow(),0));
        viewProducto.cbEstado.setSelectedItem((String) listaProductos.getValueAt(listaProductos.getSelectedRow(),4));
        
        viewProducto.btnEditar.setVisible(true);
        viewProducto.txtNombreProducto.setEditable(false);
        viewProducto.txtPrecioProducto.setEditable(false);
        viewProducto.txtCantidadProducto.setEditable(false);
        viewProducto.cbEstado.setVisible(true);
        viewProducto.lblEstado.setVisible(true);
        viewProducto.cbEstado.setEnabled(false);
        this.setVisible(false);
        viewProducto.setVisible(true);
        
    }//GEN-LAST:event_listaProductosMouseClicked

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        char caracter  = evt.getKeyChar();
        if(Character.isDigit(caracter)){
            evt.consume();
        }
    }//GEN-LAST:event_txtBusquedaKeyTyped
    
    /**
     * @param args the command line arguments
     */
 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAddProducto;
    private javax.swing.JButton btnBuscarProducto;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable listaProductos;
    private javax.swing.JPanel panelMenuCliente;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
