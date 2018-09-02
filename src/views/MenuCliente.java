/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package views;

import ctrl.CtrlAbono;
import ctrl.CtrlCliente;
import ctrl.CtrlProducto;
import ctrl.CtrlVenta;
import entidades.Abono;
import entidades.Cliente;
import entidades.Producto;
import entidades.Venta;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
/**
 *
 * @author wasp
 */
public class MenuCliente extends javax.swing.JFrame {
    CtrlCliente ctrlCliente= new CtrlCliente();
    /**
     * Creates new form SearchCliente
     */
    public MenuCliente() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
        this.repaint();
        cbBuscarCliente.removeAllItems();
        cbBuscarCliente.addItem("RUT");
        cbBuscarCliente.addItem("Nombre");
        cbBuscarCliente.addItem("Apellido");
        cbBuscarCliente.addItem("Número Cliente");
        DefaultTableModel modelo= (DefaultTableModel) tablaClientes.getModel();
        TableColumn tableColumn = tablaClientes.getColumn("ID");
        tableColumn.setPreferredWidth(0);
        tableColumn.setMinWidth(0);
        tableColumn.setMaxWidth(0);
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        
        tablaClientes.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        tablaClientes.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        tablaClientes.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        tablaClientes.getColumnModel().getColumn(3).setCellRenderer(modelocentrar);
        tablaClientes.getColumnModel().getColumn(4).setCellRenderer(modelocentrar);
        tablaClientes.getColumnModel().getColumn(5).setCellRenderer(modelocentrar);
        tablaClientes.getColumnModel().getColumn(6).setCellRenderer(modelocentrar);
        tablaClientes.getColumnModel().getColumn(7).setCellRenderer(modelocentrar);
        
        int filas= modelo.getRowCount();
        for(int i=1;i<=filas;i++){
            modelo.removeRow(0);
        }
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
        cbBuscarCliente = new javax.swing.JComboBox<>();
        txtBusqueda = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        botonAddCliente = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        btnBuscarCliente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaClientes = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Light", 0, 24)); // NOI18N
        jLabel1.setText("Menú de Clientes");

        jLabel2.setText("Buscar por :");

        cbBuscarCliente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cbBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbBuscarClienteActionPerformed(evt);
            }
        });

        txtBusqueda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBusquedaKeyTyped(evt);
            }
        });

        jLabel3.setText("Encontrados:");

        botonAddCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/addUser.png"))); // NOI18N
        botonAddCliente.setText("Agregar");
        botonAddCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAddClienteActionPerformed(evt);
            }
        });

        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/volver.png"))); // NOI18N
        btnVolver.setText("Volver al Menú Principal");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnBuscarCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/search.png"))); // NOI18N
        btnBuscarCliente.setText("Buscar");
        btnBuscarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarClienteActionPerformed(evt);
            }
        });

        tablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "N° Cliente", "Nombre ", "Apellido", "Rut", "Dirección", "Moroso", "Estado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaClientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaClientesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tablaClientes);

        javax.swing.GroupLayout panelMenuClienteLayout = new javax.swing.GroupLayout(panelMenuCliente);
        panelMenuCliente.setLayout(panelMenuClienteLayout);
        panelMenuClienteLayout.setHorizontalGroup(
            panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuClienteLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelMenuClienteLayout.createSequentialGroup()
                        .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(panelMenuClienteLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 265, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnBuscarCliente)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelMenuClienteLayout.createSequentialGroup()
                        .addComponent(btnVolver)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonAddCliente))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuClienteLayout.createSequentialGroup()
                .addGap(0, 52, Short.MAX_VALUE)
                .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuClienteLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(673, 673, 673))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelMenuClienteLayout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 748, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))))
        );
        panelMenuClienteLayout.setVerticalGroup(
            panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelMenuClienteLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(14, 14, 14)
                .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbBuscarCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscarCliente))
                .addGap(27, 27, 27)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(panelMenuClienteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAddCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(panelMenuCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
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
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icono.png"));
        
        
        return retValue;
    }
    private void botonAddClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAddClienteActionPerformed
        this.setEnabled(false);
        AddCliente ac= new AddCliente();
        ac.setVisible(true);
        this.setVisible(false);
        this.setEnabled(true);
    }//GEN-LAST:event_botonAddClienteActionPerformed

    private void cbBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbBuscarClienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbBuscarClienteActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setEnabled(false);
        this.setVisible(false);
        Menu m=new Menu();
        m.setVisible(true);
        this.setEnabled(true);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarClienteActionPerformed
        this.setEnabled(false);
        try{
            List<Cliente> listaClientes;
            if(cbBuscarCliente.getSelectedItem().toString().equals("RUT")){
                listaClientes= ctrlCliente.findByBusqueda(0, txtBusqueda.getText());
            }
            else if (cbBuscarCliente.getSelectedItem().toString().equals("Nombre")){
                listaClientes= ctrlCliente.findByBusqueda(1, txtBusqueda.getText());
            }
            else if (cbBuscarCliente.getSelectedItem().toString().equals("Apellido")){
                listaClientes= ctrlCliente.findByBusqueda(2, txtBusqueda.getText());
            }
            else{
                listaClientes=ctrlCliente.findByBusqueda(3, txtBusqueda.getText());
            }
            
            if(txtBusqueda.getText().isEmpty() || txtBusqueda.getText()== null){
                JOptionPane.showMessageDialog (null, "Debe ingresar el texto para la búsqueda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
            }
            else{
                
                DefaultTableModel modelo= (DefaultTableModel) tablaClientes.getModel();
                
                int filas= modelo.getRowCount();
                for(int i=1;i<=filas;i++){
                    modelo.removeRow(0);
                }
                if(listaClientes.size()>0){
                    String moroso="";
                    String estado="";
                    for(Cliente c: listaClientes){
                        String[] fila = new String[8];
                        fila[0] = c.getIdCliente().toString();
                        fila[1] = String.valueOf(c.getNumeroCliente());
                        fila[2] = c.getNombreCliente();
                        fila[3] = c.getApellidoCliente();
                        fila[4] = c.getRutCliente();
                        fila[5] = c.getDireccionCliente();
                        if(c.isMorosoCliente())
                            moroso="SI";
                        else
                            moroso="NO";
                        if(c.isActivoCliente())
                            estado="ACTIVO";
                        else
                            estado="INACTIVO";
                        fila[6] = moroso;
                        fila[7]=estado;
                        modelo.addRow(fila);
                    }
                    
                }
                else
                    JOptionPane.showMessageDialog (null, "No existen clientes relacionados con la búsqueda", "Aviso", JOptionPane.INFORMATION_MESSAGE);
                
                
            }
            
            
        }
        catch(Exception e){
            System.err.println(e.getMessage());
        }
        this.setEnabled(true);
    }//GEN-LAST:event_btnBuscarClienteActionPerformed

    private void tablaClientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaClientesMouseClicked
        try {
            Cliente c= new Cliente();
            Clientes viewCliente= new Clientes();
            CtrlCliente ctrlCliente= new CtrlCliente();
            CtrlAbono ctrlAbono= new CtrlAbono();
            CtrlProducto ctrlProducto= new CtrlProducto();
            CtrlVenta ctrlVenta = new CtrlVenta();
            
            c=ctrlCliente.findByID((String) tablaClientes.getValueAt(tablaClientes.getSelectedRow(),0));
            
            viewCliente.txtID.setText(c.getIdCliente().toString());
            viewCliente.txtNroCliente.setText(String.valueOf(c.getNumeroCliente()));
            viewCliente.txtNombre.setText(c.getNombreCliente());
            viewCliente.txtApellido.setText(c.getApellidoCliente());
            viewCliente.txtRut.setText(c.getRutCliente());
            viewCliente.txtDireccion.setText(c.getDireccionCliente());
            viewCliente.txtReferencia.setText(c.getReferenciaCliente());
            viewCliente.txtTelefono.setText(c.getTelefonoCliente());
            Integer saldo= c.getTotalcomprasCliente()-c.getTotalabonoCliente();
            viewCliente.txtSaldo.setText(saldo.toString());
            viewCliente.txtTotalCompras.setText(String.valueOf(c.getTotalcomprasCliente()));
            
            ArrayList <Venta> listaProductos= ctrlVenta.listByCliente(c.getIdCliente());
            DefaultTableModel modelo= (DefaultTableModel) viewCliente.tablaProductos.getModel();
            
            for(Venta v: listaProductos){
                Producto p=ctrlProducto.buscarPorID(v.getProducto().getIdProducto());
                String[] fila = new String[6];
                fila[0] = p.getIdProducto().toString();
                fila[1] = p.getNombreProducto();
                fila[2] = String.valueOf(v.getCantidadVenta());
                fila[3] = "$"+String.valueOf(p.getPrecioProducto());
                fila[4] = "$"+String.valueOf(v.getMontoVenta());
                fila[5] = Integer.toString(v.getIdVenta());
                
                modelo.addRow(fila);
            }
            
            viewCliente.tablaProductos.setModel(modelo);
            
            if(c.isActivoCliente()){
                viewCliente.cbEstado.setSelectedItem("ACTIVO");
            }
            else{
                viewCliente.cbEstado.setSelectedItem("INACTIVO");
                viewCliente.btnAddProducto.setEnabled(false);
                viewCliente.btnAddAbono.setEnabled(false);
            }
            
            if(c.isMorosoCliente()){
                viewCliente.cbMoroso.setSelectedItem("SI");
                viewCliente.btnAddProducto.setEnabled(false);
            }
            else{
                viewCliente.cbMoroso.setSelectedItem("NO");
            }
            
            
            Abono abono= ctrlAbono.ultimoAbonoCliente(c.getIdCliente());
            if(abono!=null){
                SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
                viewCliente.fechaUAbono.setText(sdf.format(abono.getFechaAbono()));
                viewCliente.montoUAbono.setText("$"+abono.getMontoAbono());
            }
            this.setVisible(false);
            viewCliente.setVisible(true);
        } catch (Exception ex) {
            Logger.getLogger(MenuCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tablaClientesMouseClicked

    private void txtBusquedaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBusquedaKeyTyped
        if(cbBuscarCliente.getSelectedItem().equals("RUT")){
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)&& (caracter!='k')&& (caracter!='.')&& (caracter!='-')) {
                evt.consume(); // ignorar el evento de teclado
            }
        }else if (cbBuscarCliente.getSelectedItem().equals("Nombre")){
            char caracter  = evt.getKeyChar();
            if(Character.isDigit(caracter)){
                evt.consume();
            }
        }else if (cbBuscarCliente.getSelectedItem().equals("Apellido")){
            char caracter  = evt.getKeyChar();
            if(Character.isDigit(caracter)){
                evt.consume();
            }
        }else if (cbBuscarCliente.getSelectedItem().equals("Número Cliente")){
            char caracter = evt.getKeyChar();
            if (((caracter < '0') || (caracter > '9')) && (caracter != '\b' /*corresponde a BACK_SPACE*/)) {
                evt.consume(); // ignorar el evento de teclado
            }
        }
    }//GEN-LAST:event_txtBusquedaKeyTyped
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAddCliente;
    private javax.swing.JButton btnBuscarCliente;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbBuscarCliente;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panelMenuCliente;
    private javax.swing.JTable tablaClientes;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
