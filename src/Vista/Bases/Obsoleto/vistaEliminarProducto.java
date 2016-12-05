/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Bases.Obsoleto;



import Negocio.Entidades.Producto;
import Negocio.Operaciones.AdminProductos;
import java.awt.Color;
import java.sql.*;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class vistaEliminarProducto extends javax.swing.JFrame {
        AdminProductos adminProductos = new AdminProductos();
        List<String> nombresProdsDisp = adminProductos.getNombresTodosProductos();
    
    

    /**
     * Creates new form FrmEliminarProducto
     */
    public vistaEliminarProducto() {
        this.getContentPane().setBackground(Color.white);
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);       
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbTitulo = new javax.swing.JLabel();
        btCancelar = new javax.swing.JButton();
        btAceptar = new javax.swing.JButton();
        lbNombreProducto = new javax.swing.JLabel();
        comboProductos = new javax.swing.JComboBox<String>();
        campoCantidad = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbTitulo.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(0, 0, 255));
        lbTitulo.setText("Eliminar Producto");

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btAceptar.setText("Aceptar");
        btAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAceptarActionPerformed(evt);
            }
        });

        lbNombreProducto.setText("Nombre del Producto:");

        comboProductos.setModel(new DefaultComboBoxModel(nombresProdsDisp.toArray()));
        comboProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboProductosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                        .addComponent(btAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(120, 120, 120))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboProductos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(31, 31, 31)
                        .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50))))
            .addGroup(layout.createSequentialGroup()
                .addGap(127, 127, 127)
                .addComponent(lbTitulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lbTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(comboProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAceptarActionPerformed
        String nombreProducto = objectToString(this.comboProductos.getSelectedItem());
        int precioProducto=0;
        
                        try {
        Producto producto = new Producto(nombreProducto, precioProducto);
        adminProductos.BorrarProductos(producto);
        JOptionPane.showMessageDialog(null, "Producto eliminado satisfactoriamente");
        //Actualiza de nuevo el combo
        nombresProdsDisp = adminProductos.getNombresTodosProductos();
        
                } catch (Exception e) {
           
            JOptionPane.showMessageDialog(null, "ERROR");
        }
        
    }//GEN-LAST:event_btAceptarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        this.dispose();
        new vistaProductos().setVisible(true);
    }//GEN-LAST:event_btCancelarActionPerformed

    private void comboProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboProductosActionPerformed

    }//GEN-LAST:event_comboProductosActionPerformed

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
            java.util.logging.Logger.getLogger(vistaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaEliminarProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaEliminarProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAceptar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JTextField campoCantidad;
    private javax.swing.JComboBox<String> comboProductos;
    private javax.swing.JLabel lbNombreProducto;
    private javax.swing.JLabel lbTitulo;
    // End of variables declaration//GEN-END:variables

    public String objectToString(Object o) {
        String st;
        st = (String) o;
        return st;
    }
}

