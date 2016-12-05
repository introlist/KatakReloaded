/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Entidades.Pedido;
import Negocio.Operaciones.AdminPedidos;
import Vista.Tablas.ModeloTablaPedidos;
import java.awt.Font;
import java.util.List;
import javax.swing.JOptionPane;


/********************************************************************** 
 
    CLASE: {@link VistaPedidos}
    
    AUTOR: Roberto Gil Flores

 **********************************************************************/
public class VistaPedidos extends javax.swing.JFrame {
    
    AdminPedidos adminPedidos = new AdminPedidos();
    ModeloTablaPedidos modeloTablaPedidosPendientes = new ModeloTablaPedidos();
    ModeloTablaPedidos modeloTablaPedidosCompletados = new ModeloTablaPedidos();
    
    

    public VistaPedidos() {
        initComponents();
        rellenarTablaPendientes();
        rellenarTablaCompletados();
        labelEstatus.setFont(new Font("Serif", Font.PLAIN, 14));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        panelPedidosCompletados = new javax.swing.JPanel();
        scrollPedidosCompletados = new javax.swing.JScrollPane();
        tablePedidosCompletados = new javax.swing.JTable();
        panelPedidosPendientes = new javax.swing.JPanel();
        scrollPedidosPendientes = new javax.swing.JScrollPane();
        tablePedidosPendientes = new javax.swing.JTable();
        botonCancelar = new javax.swing.JButton();
        botonCompletarPedido = new javax.swing.JButton();
        botonAgregarPedido = new javax.swing.JButton();
        labelEstatus = new javax.swing.JLabel();
        botonRegresar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Administrador de Pedidos");

        panelPedidosCompletados.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos Completados"));

        tablePedidosCompletados.setModel(new Vista.Tablas.ModeloTablaPedidos());
        scrollPedidosCompletados.setViewportView(tablePedidosCompletados);

        javax.swing.GroupLayout panelPedidosCompletadosLayout = new javax.swing.GroupLayout(panelPedidosCompletados);
        panelPedidosCompletados.setLayout(panelPedidosCompletadosLayout);
        panelPedidosCompletadosLayout.setHorizontalGroup(
            panelPedidosCompletadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosCompletadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrollPedidosCompletados, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPedidosCompletadosLayout.setVerticalGroup(
            panelPedidosCompletadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPedidosCompletadosLayout.createSequentialGroup()
                .addComponent(scrollPedidosCompletados, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        panelPedidosPendientes.setBorder(javax.swing.BorderFactory.createTitledBorder("Pedidos Pendientes"));

        tablePedidosPendientes.setModel(new Vista.Tablas.ModeloTablaPedidos());
        scrollPedidosPendientes.setViewportView(tablePedidosPendientes);

        botonCancelar.setText("Cancelar Pedido");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });

        botonCompletarPedido.setText("Completar Pedido");
        botonCompletarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompletarPedidoActionPerformed(evt);
            }
        });

        botonAgregarPedido.setText("Nuevo Pedido");
        botonAgregarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAgregarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPedidosPendientesLayout = new javax.swing.GroupLayout(panelPedidosPendientes);
        panelPedidosPendientes.setLayout(panelPedidosPendientesLayout);
        panelPedidosPendientesLayout.setHorizontalGroup(
            panelPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosPendientesLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPedidosPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 731, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPedidosPendientesLayout.createSequentialGroup()
                        .addGap(0, 420, Short.MAX_VALUE)
                        .addComponent(botonAgregarPedido)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonCompletarPedido)))
                .addContainerGap())
        );
        panelPedidosPendientesLayout.setVerticalGroup(
            panelPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPedidosPendientesLayout.createSequentialGroup()
                .addComponent(scrollPedidosPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPedidosPendientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonCancelar)
                    .addComponent(botonCompletarPedido)
                    .addComponent(botonAgregarPedido)))
        );

        botonRegresar.setText("Regresar");
        botonRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonRegresarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelPedidosCompletados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(labelEstatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(panelPedidosPendientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                .addContainerGap(302, Short.MAX_VALUE)
                .addComponent(panelPedidosCompletados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botonRegresar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(labelEstatus)
                .addGap(48, 48, 48))
            .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(panelPrincipalLayout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(panelPedidosPendientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(318, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        getPedidoPendienteSeleccionado();
        cancelarPedidoPendiente();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonCompletarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompletarPedidoActionPerformed
        getPedidoPendienteSeleccionado();
        completarPedidoPendiente();
    }//GEN-LAST:event_botonCompletarPedidoActionPerformed

    private void botonRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonRegresarActionPerformed
        this.setVisible(true);
        this.dispose();
        MenuPrincipal menuPrincipal = new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }//GEN-LAST:event_botonRegresarActionPerformed

    private void botonAgregarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAgregarPedidoActionPerformed
       this.setVisible(false);
       this.dispose();
       RegistradorPedidos registradorPedidos = new RegistradorPedidos();
       registradorPedidos.setVisible(true);
    }//GEN-LAST:event_botonAgregarPedidoActionPerformed


    private void actualizarTablaPendientes(){
        vaciarTablaPedidosPendientes();
        rellenarTablaPendientes();
    }
    
    private void actualizarTablaCompletados(){
        vaciarTablaPedidosCompletados();
        rellenarTablaCompletados();
    }
    
    private void rellenarTablaPendientes() {
        getModeloTablaPedidosPendientes().agregarVariasFilas(getListaPedidosPendientes());    
    }

    private void rellenarTablaCompletados() {
        getModeloTablaPedidosCompletados().agregarVariasFilas(getListaPedidosCompletados());
    }
    
    private void vaciarTablaPedidosPendientes(){
         ModeloTablaPedidos tablaPedidosPendientes 
                = getModeloTablaPedidosPendientes();
        int rowCount = tablaPedidosPendientes.getRowCount();
        for (int i = rowCount - 1; 0 <= i; i--) {
            tablaPedidosPendientes.removerFila(i);
        }   
    }
    
    private void vaciarTablaPedidosCompletados(){
         ModeloTablaPedidos tablaPedidosCompletados 
                = getModeloTablaPedidosCompletados();
        int rowCount = tablaPedidosCompletados.getRowCount();
        for (int i = rowCount - 1; 0 <= i; i--) {
            tablaPedidosCompletados.removerFila(i);
        }   
    }
    
    private ModeloTablaPedidos getModeloTablaPedidosPendientes() {
        return (ModeloTablaPedidos) tablePedidosPendientes.getModel();
    }

    private ModeloTablaPedidos getModeloTablaPedidosCompletados() {
        return (ModeloTablaPedidos) tablePedidosCompletados.getModel();
    }
    
    private void vaciarLabelStatus() {
        labelEstatus.setFont(new Font("Serif", Font.PLAIN, 14));
        labelEstatus.setText("");
    }
    
    private List<Pedido> getListaPedidosPendientes(){
        return adminPedidos.getPedidosPendientes();
    }
    
    private List<Pedido> getListaPedidosCompletados(){
        return adminPedidos.getPedidosCompletados();
    }
    
    private boolean seSeleccionoFilaVaciaPendientes() {
        int INDICE_NINGUNA_FILA = -1;
        
        return (getFilaSeleccionadaPendientes() == INDICE_NINGUNA_FILA);    }

    private int getFilaSeleccionadaPendientes() {
        return tablePedidosPendientes.getSelectedRow();
    }
    
     private Pedido getPedidoPendienteSeleccionado() {
        if(!seSeleccionoFilaVaciaPendientes()){
            int filaSeleccionada = getFilaSeleccionadaPendientes();
            Pedido productosSeleccionados = 
                    getModeloTablaPedidosPendientes().getFila(
                            filaSeleccionada
                    );
            vaciarLabelStatus();
            return productosSeleccionados;
        }else{
            mostrarErrorLabelStatus("No se selecciono una fila");
            return null;
        }    
    }
 
    private void mostrarErrorLabelStatus(String input) {
        labelEstatus.setFont(new Font("Serif", Font.BOLD, 14));
        labelEstatus.setText(input);
    }

    private void cancelarPedidoPendiente() {
        int botonConfirmacion = JOptionPane.YES_NO_OPTION;
        int resultadoConfirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Esta seguro que quiere eliminar este pedido permanentemente?",
                "Confirmación",
                botonConfirmacion
        );
        
        
        if(resultadoConfirmacion == 0) {
          adminPedidos.eliminarPedidoRegistro(getPedidoPendienteSeleccionado());
          actualizarTablaPendientes();
          actualizarTablaCompletados();
          vaciarLabelStatus();
        } else {
          labelEstatus.setText("No se realizaron cambios");
        } 
    }

    private void completarPedidoPendiente() {
        int botonConfirmacion = JOptionPane.YES_NO_OPTION;
        int resultadoConfirmacion = JOptionPane.showConfirmDialog(
                this,
                "¿Esta seguro que quiere completar este pedido permanentemente?",
                "Confirmación",
                botonConfirmacion
        );
        if(resultadoConfirmacion == 0) {
          Pedido pedidoModificado = getPedidoPendienteSeleccionado();
          pedidoModificado.setEsPendiente(false);
          adminPedidos.modificarPedidoRegistro(pedidoModificado);
          actualizarTablaPendientes();
          actualizarTablaCompletados();
          vaciarLabelStatus();
        } else {
          labelEstatus.setText("No se realizaron cambios");
        } 
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAgregarPedido;
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonCompletarPedido;
    private javax.swing.JButton botonRegresar;
    private javax.swing.JLabel labelEstatus;
    private javax.swing.JPanel panelPedidosCompletados;
    private javax.swing.JPanel panelPedidosPendientes;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JScrollPane scrollPedidosCompletados;
    private javax.swing.JScrollPane scrollPedidosPendientes;
    private javax.swing.JTable tablePedidosCompletados;
    private javax.swing.JTable tablePedidosPendientes;
    // End of variables declaration//GEN-END:variables

}
    

    

