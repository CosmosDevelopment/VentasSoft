/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package views;

import ctrl.CtrlAbono;
import ctrl.CtrlCliente;
import entidades.Abono;
import entidades.Cliente;
import java.awt.Image;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
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
public class HistorialAbonos extends javax.swing.JFrame {
    
    //instancia ctrls y views
    CtrlAbono ctrlAbono= new CtrlAbono();
    CtrlCliente ctrlCliente= new CtrlCliente();
    public Abono ab;
    String abono1="";
    public Clientes clientes;
    
    public HistorialAbonos(Clientes viewClientes) {
        clientes=viewClientes;
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        btnDelAbono.setVisible(false);
        
        DefaultTableModel modelo= (DefaultTableModel) tablaAbonos.getModel();
        TableColumn tableColumn = tablaAbonos.getColumn("ID");
        tableColumn.setPreferredWidth(0);
        tableColumn.setMinWidth(0);
        tableColumn.setMaxWidth(0);
        DefaultTableCellRenderer modelocentrar = new DefaultTableCellRenderer();
        modelocentrar.setHorizontalAlignment(SwingConstants.CENTER);
        
        
        tablaAbonos.getColumnModel().getColumn(0).setCellRenderer(modelocentrar);
        tablaAbonos.getColumnModel().getColumn(1).setCellRenderer(modelocentrar);
        tablaAbonos.getColumnModel().getColumn(2).setCellRenderer(modelocentrar);
        
        int columnas= modelo.getColumnCount();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaAbonos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnDelAbono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setUndecorated(true);

        jLabel1.setFont(new java.awt.Font("DejaVu Sans Light", 0, 24)); // NOI18N
        jLabel1.setText("Historial de abonos");

        tablaAbonos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Fecha", "Monto", "Saldo", "ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaAbonos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaAbonosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaAbonos);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        jButton1.setText("Cerrar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnDelAbono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/delete.png"))); // NOI18N
        btnDelAbono.setText("Eliminar Abono");
        btnDelAbono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDelAbonoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDelAbono)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 445, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 37, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnDelAbono)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    @Override
    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("images/icono.png"));
        
        
        return retValue;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDelAbonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDelAbonoActionPerformed
        ab= new Abono();
        Cliente cliente= new Cliente();
        boolean resultado;
        try {
            ab=ctrlAbono.findByID(abono1);
            
            cliente= ctrlCliente.findByID(clientes.idCliente);
            int totalCompras= cliente.getTotalcomprasCliente();
            int totalAbonos=cliente.getTotalabonoCliente();
            int montoAbono= ab.getMontoAbono();
            int totalAbonoAct= totalAbonos-montoAbono;
            int saldoAct=totalCompras-totalAbonoAct;
            cliente.setTotalabonoCliente(totalAbonoAct);
            ctrlCliente.actualizarCliente(cliente);
            
            
            resultado= ctrlAbono.eliminarAbono(abono1);
            
            if(ctrlAbono.listByCliente(Integer.toString(Integer.parseInt(clientes.idCliente))).isEmpty()){
                ab.setCliente(cliente);
                ab.setFechaAbono(new Date());
                ab.setMontoAbono(0);
                ab.setSaldoAbono(totalCompras);
                ctrlAbono.agregarAbono(ab);
            }
            
            clientes.txtSaldo.setText("$"+Integer.toString(saldoAct));
            clientes.montoUAbono.setText("$"+Integer.toString(ctrlAbono.ultimoAbonoCliente(cliente.getIdCliente()).getMontoAbono()));
            
            
            
            JOptionPane.showMessageDialog (null, "Abono eliminado exitosamente", "Aviso", JOptionPane.INFORMATION_MESSAGE);
            
            
            
            DefaultTableModel modelo= (DefaultTableModel) this.tablaAbonos.getModel();
            
            int filas = modelo.getRowCount();
            for (int i = 1; i <= filas; i++) {
                modelo.removeRow(0);
            }
            
            ArrayList<Abono> listaAbonos= ctrlAbono.listByCliente(Integer.toString(cliente.getIdCliente()));
            SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
            
            if(listaAbonos.size()>0){
                for(Abono a: listaAbonos){
                    String[] fila = new String[4] ;
                    fila[0] = sdf.format(a.getFechaAbono());
                    fila[1] = "$"+String.valueOf(a.getMontoAbono());
                    fila[2] = "$"+String.valueOf(a.getSaldoAbono());
                    fila[3] =  String.valueOf(a.getIdAbono());
                    
                    modelo.addRow(fila);
                }
            }
            
            
            this.tablaAbonos.setModel(modelo);
            this.setVisible(true);
            btnDelAbono.setVisible(false);
                    //setEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(HistorialAbonos.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnDelAbonoActionPerformed

    private void tablaAbonosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaAbonosMouseClicked
        
        abono1= (String)tablaAbonos.getValueAt(tablaAbonos.getSelectedRow(),3);
        btnDelAbono.setVisible(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_tablaAbonosMouseClicked
    
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelAbono;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tablaAbonos;
    // End of variables declaration//GEN-END:variables
}
