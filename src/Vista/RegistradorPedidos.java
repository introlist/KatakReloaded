/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Operaciones.VendedorMenudeo;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import Vista.Tablas.ModeloTablaProductosVendidos;
import Negocio.Entidades.ProductosVendidos;
import Negocio.Entidades.Producto;
import Negocio.Operaciones.AdminProductos;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author DEMON
 */
public class RegistradorPedidos extends javax.swing.JFrame {
    VendedorMenudeo vendedorMenudeo = new VendedorMenudeo();
    AdminProductos adminProd = new AdminProductos();
    List<String> nombresProdsDisp = adminProd.getNombresProductosDisponibles();
    List<ProductosVendidos> prodsVendidosActuales = new ArrayList<>();
    /**
     * Creates new form registradorPedidos
     */
    public RegistradorPedidos() {
        initComponents();
        rellenarListaGrupoProd(prodsVendidosActuales);
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

        PanelComprador = new javax.swing.JPanel();
        LabelComprador = new javax.swing.JLabel();
        CampoComprador = new javax.swing.JTextField();
        LabelDireccion = new javax.swing.JLabel();
        CampoDireccion = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        LabelCampos = new javax.swing.JLabel();
        LabelFecha = new javax.swing.JLabel();
        comboFecha = new datechooser.beans.DateChooserCombo();
        LabelHora = new javax.swing.JLabel();
        CampoHora = new javax.swing.JTextField();
        PanelGruposProds = new javax.swing.JPanel();
        ScrollGruposProd = new javax.swing.JScrollPane();
        TablaGruposProd = new javax.swing.JTable();
        ComboProds = new javax.swing.JComboBox<String>();
        LabelProducto = new javax.swing.JLabel();
        LabelCantidad = new javax.swing.JLabel();
        CampoCantidad = new javax.swing.JTextField();
        BotonAgregar = new javax.swing.JButton();
        BotonEliminar = new javax.swing.JButton();
        CampoCostoTotal = new javax.swing.JTextField();
        LabelTotal = new javax.swing.JLabel();
        BotonRegistrar = new javax.swing.JToggleButton();
        BotonCancelar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar un Pedido");

        LabelComprador.setText("Comprador *");

        LabelDireccion.setText("Dirección *");

        LabelTelefono.setText("Telefono");

        LabelCampos.setText("* Campos obligatorios");

        LabelFecha.setText("Fecha *");

        LabelHora.setText("Hora *");

        javax.swing.GroupLayout PanelCompradorLayout = new javax.swing.GroupLayout(PanelComprador);
        PanelComprador.setLayout(PanelCompradorLayout);
        PanelCompradorLayout.setHorizontalGroup(
            PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCompradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PanelCompradorLayout.createSequentialGroup()
                        .addComponent(LabelComprador)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(CampoComprador))
                    .addGroup(PanelCompradorLayout.createSequentialGroup()
                        .addComponent(LabelDireccion)
                        .addGap(14, 14, 14)
                        .addComponent(CampoDireccion))
                    .addGroup(PanelCompradorLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(LabelCampos)
                        .addContainerGap())
                    .addGroup(PanelCompradorLayout.createSequentialGroup()
                        .addGroup(PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelFecha)
                            .addComponent(LabelTelefono))
                        .addGap(24, 24, 24)
                        .addGroup(PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(PanelCompradorLayout.createSequentialGroup()
                                .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(LabelHora)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoHora, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(CampoTelefono)))))
        );
        PanelCompradorLayout.setVerticalGroup(
            PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCompradorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelComprador)
                    .addComponent(CampoComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelDireccion)
                    .addComponent(CampoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelTelefono)
                    .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(PanelCompradorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LabelFecha)
                    .addComponent(comboFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoHora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelHora))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addComponent(LabelCampos)
                .addContainerGap())
        );

        PanelGruposProds.setBorder(javax.swing.BorderFactory.createTitledBorder("Productos Seleccionados"));

        TablaGruposProd.setModel(new Vista.Tablas.ModeloTablaProductosVendidos());
        ScrollGruposProd.setViewportView(TablaGruposProd);

        ComboProds.setModel(new DefaultComboBoxModel(nombresProdsDisp.toArray()));

        LabelProducto.setText("Producto:");

        LabelCantidad.setText("Cantidad:");

        CampoCantidad.setToolTipText("Ingrese la cantidad de productos");

        BotonAgregar.setText("Agregar");
        BotonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAgregarActionPerformed(evt);
            }
        });

        BotonEliminar.setText("Eliminar");
        BotonEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEliminarActionPerformed(evt);
            }
        });

        CampoCostoTotal.setDisabledTextColor(new java.awt.Color(51, 51, 51));
        CampoCostoTotal.setEnabled(false);
        CampoCostoTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoCostoTotalActionPerformed(evt);
            }
        });

        LabelTotal.setText("TOTAL:");

        javax.swing.GroupLayout PanelGruposProdsLayout = new javax.swing.GroupLayout(PanelGruposProds);
        PanelGruposProds.setLayout(PanelGruposProdsLayout);
        PanelGruposProdsLayout.setHorizontalGroup(
            PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollGruposProd)
                    .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                        .addComponent(LabelProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ComboProds, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(LabelCantidad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(BotonAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(BotonEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(LabelTotal)
                        .addGap(18, 18, 18)
                        .addComponent(CampoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        PanelGruposProdsLayout.setVerticalGroup(
            PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelGruposProdsLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollGruposProd, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboProds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelProducto)
                    .addComponent(LabelCantidad)
                    .addComponent(CampoCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(PanelGruposProdsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonEliminar)
                    .addComponent(CampoCostoTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelTotal)))
        );

        BotonRegistrar.setText("Registrar");
        BotonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonRegistrarActionPerformed(evt);
            }
        });

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(PanelComprador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(PanelGruposProds, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PanelComprador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelGruposProds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonRegistrar)
                    .addComponent(BotonCancelar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CampoCostoTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoCostoTotalActionPerformed
    }//GEN-LAST:event_CampoCostoTotalActionPerformed

    private void BotonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAgregarActionPerformed
        agregarNuevoGrupoProd(ComboProds.getSelectedItem().toString(),CampoCantidad.getText());
        actualizarListaGrupoProd();
        actualizarCostoTotal();
    }//GEN-LAST:event_BotonAgregarActionPerformed

    private void BotonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonRegistrarActionPerformed
        EnviarInputs();
        FinalizarRegistroPedido();
    }//GEN-LAST:event_BotonRegistrarActionPerformed

    private void BotonEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEliminarActionPerformed
        prodsVendidosActuales.remove(getGrupoProdSeleccionado());
        actualizarListaGrupoProd();
        actualizarCostoTotal();
    }//GEN-LAST:event_BotonEliminarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        FinalizarRegistroPedido();
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void agregarNuevoGrupoProd(String nombreProd, String inputCantidad) {
        prodsVendidosActuales.add(crearNuevoGrupoProd(nombreProd, inputCantidad));
    }
    
    private ProductosVendidos crearNuevoGrupoProd(
            String NombreProd, String inputCantidad
    ){
        Producto productoSeleccionado = adminProd.getProductosPorNombre(NombreProd);
                ProductosVendidos nuevoGrupoProductos = new ProductosVendidos(
                productoSeleccionado, 
                Integer.parseInt(inputCantidad)
        );
        return nuevoGrupoProductos;
    }

    private void actualizarListaGrupoProd() {
        vaciarListaGrupoProd();
        rellenarListaGrupoProd(prodsVendidosActuales);
    }

    private void vaciarListaGrupoProd() {
        ModeloTablaProductosVendidos mtgp = getModeloTablaGrupoProd();
        int rowCount = mtgp.getRowCount();
        for (int i = rowCount - 1; 0 <= i; i--) {
            mtgp.removerFila(i);
        }    
    }

    private void rellenarListaGrupoProd(List<ProductosVendidos> gruposProdActuales) {
        getModeloTablaGrupoProd().agregarVariasFilas(gruposProdActuales);
    }

    private ModeloTablaProductosVendidos getModeloTablaGrupoProd() {
        return (ModeloTablaProductosVendidos) TablaGruposProd.getModel();
    }
    
    private String getHora() {
        return CampoHora.getText();
    }
    
    private String getDireccion(){
        return CampoDireccion.getText();
    }
    
    private String getTelefono(){
        return CampoTelefono.getText();
    }
    
    private String getComprador(){
        return CampoComprador.getText();
    }
    
    private Date getFechaEntrega() {
        Calendar selectedDateChooserCalendar = comboFecha.getSelectedDate();
        
        return selectedDateChooserCalendar.getTime();
    }
    
    private void EnviarInputs() {
        vendedorMenudeo.registrarPedido(getComprador(), 
                getDireccion(), 
                getTelefono(), 
                getFechaEntrega(), 
                prodsVendidosActuales, 
                getHora()
        );
        
    }

    public List<ProductosVendidos> getGruposProdActuales() {
        return prodsVendidosActuales;
    }

    public void setGruposProdActuales(List<ProductosVendidos> prodsVendidosActuales) {
        this.prodsVendidosActuales = prodsVendidosActuales;
    }

    private boolean seSeleccionoFilaVacia() {
        int INDICE_NINGUNA_FILA = -1;
        
        return (getFilaSeleccionada() == INDICE_NINGUNA_FILA);    }

    private int getFilaSeleccionada() {
        return TablaGruposProd.getSelectedRow();
    }
    
    private void actualizarCostoTotal(){
        double costoTotalActual 
                = vendedorMenudeo.calcularCostoTotal(this.prodsVendidosActuales); 
        CampoCostoTotal.setText(String.valueOf(costoTotalActual));
    }



    private ProductosVendidos getGrupoProdSeleccionado() {
        if(!seSeleccionoFilaVacia()){
            int filaSeleccionada = getFilaSeleccionada();
            ProductosVendidos grupoSeleccionado = getModeloTablaGrupoProd().getFila(filaSeleccionada);
            return grupoSeleccionado;
        }else{
            System.err.println("No se selecciono una fila");
            return null;
        }    
    }

    private void FinalizarRegistroPedido() {
        this.setVisible(false);
        dispose();
        MenuPrincipal menuPrincipal=new MenuPrincipal();
        menuPrincipal.setVisible(true);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JToggleButton BotonCancelar;
    private javax.swing.JButton BotonEliminar;
    private javax.swing.JToggleButton BotonRegistrar;
    private javax.swing.JTextField CampoCantidad;
    private javax.swing.JTextField CampoComprador;
    private javax.swing.JTextField CampoCostoTotal;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoHora;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JComboBox<String> ComboProds;
    private javax.swing.JLabel LabelCampos;
    private javax.swing.JLabel LabelCantidad;
    private javax.swing.JLabel LabelComprador;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelFecha;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelProducto;
    private javax.swing.JLabel LabelTelefono;
    private javax.swing.JLabel LabelTotal;
    private javax.swing.JPanel PanelComprador;
    private javax.swing.JPanel PanelGruposProds;
    private javax.swing.JScrollPane ScrollGruposProd;
    private javax.swing.JTable TablaGruposProd;
    private datechooser.beans.DateChooserCombo comboFecha;
    // End of variables declaration//GEN-END:variables

}
