/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Operaciones.AdminClientes;
import Vista.Paneles.PanelAgregarEditarCliente;
import Vista.Paneles.PanelPrincipalCliente;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Bernardo Espinoza
 */
public class vistaClientes extends javax.swing.JFrame {
    private JPanel panelBase;
    private PanelPrincipalCliente panelPrincipal;
    private PanelAgregarEditarCliente panelAgregarEditar;
    private CardLayout cardLayout;
    private AdminClientes administrador;
    private boolean modoEdicion;
    /**
     * Creates new form vistaCliente
     */
    public vistaClientes() {
        //initComponents();
        administrador=new AdminClientes();
        panelBase=new JPanel();  
        cardLayout=new CardLayout();
        panelBase.setLayout(cardLayout);
                      
        panelPrincipal=new PanelPrincipalCliente();
        panelAgregarEditar=new PanelAgregarEditarCliente();
        
        panelBase.add(panelPrincipal,"1");
        panelBase.add(panelAgregarEditar,"2");
        
        cardLayout.show(panelBase, "1");
        
        add(panelBase);
//        ActualizarTabla();
        pack();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        añadirActionListeners();
        modoEdicion=false;
    }
    
    private void añadirActionListeners(){
        panelPrincipal.agregarBotonAgregarListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelAgregarEditar.llenarCampoNombre("");
                panelAgregarEditar.llenarCampoDireccion("");
                panelAgregarEditar.llenarCampoTelefono("");
                panelAgregarEditar.llenarCampoEMail("");
                cardLayout.show(panelBase, "2");
            }
        });
        
        panelPrincipal.agregarBotonEditarListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelPrincipal.seSeleccionoFila()){
                    modoEdicion=true;
                    panelAgregarEditar.llenarCampoNombre(panelPrincipal.obtenerValorEnFilaSeleccionada(0));
                    panelAgregarEditar.llenarCampoDireccion(panelPrincipal.obtenerValorEnFilaSeleccionada(1));
                    panelAgregarEditar.llenarCampoTelefono(panelPrincipal.obtenerValorEnFilaSeleccionada(2));
                    panelAgregarEditar.llenarCampoEMail(panelPrincipal.obtenerValorEnFilaSeleccionada(3));
                    cardLayout.show(panelBase, "2");
                }
                else{
                    JOptionPane.showMessageDialog(null, "Selecciona un elemento");
                }
            }
        });
        
        panelPrincipal.agregatBotonBorrarListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelPrincipal.seSeleccionoFila()){
                    String[] datos={panelPrincipal.obtenerValorEnFilaSeleccionada(0),
                                    panelPrincipal.obtenerValorEnFilaSeleccionada(1),
                                    panelPrincipal.obtenerValorEnFilaSeleccionada(2),
                                    panelPrincipal.obtenerValorEnFilaSeleccionada(3)};
                    
                    administrador.eliminarCliente(datos);
                }
                else{
                    JOptionPane.showMessageDialog(null, "Selecciona un elemento");
                }
            }
        });
        
        panelPrincipal.agregarBotonRegresarMenuListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuPrincipal menuPrincipal=new MenuPrincipal();
                menuPrincipal.setVisible(true);
            }
        });
        
        panelAgregarEditar.agregarBotonGuardarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] datos={
                        panelAgregarEditar.obtenerCampoNombre(), 
                        panelAgregarEditar.obtenerCampoDireccion(), 
                        panelAgregarEditar.obtenerCampoTelefono(),
                        panelAgregarEditar.obtenerCampoEMail()};
                if(modoEdicion){
                    administrador.editarCliente(datos);
                }else{
                    administrador.agregarCliente(datos);
                }
            }
        });
        
        panelAgregarEditar.agregarBotonRegresarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelBase,"1");
//                ActualizarTabla();
                modoEdicion=false;
            }
        });
    }
 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 477, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 294, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
