/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Entidades.Cliente;
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
public class VistaClientes extends javax.swing.JFrame {
    private JPanel panelBase;
    private PanelPrincipalCliente panelPrincipal;
    private PanelAgregarEditarCliente panelAgregarEditar;
    private CardLayout cardLayout;
    private AdminClientes administrador;
    private boolean modoEdicion;
    /**
     * Creates new form vistaCliente
     */
    public VistaClientes() {
        administrador=new AdminClientes();
        InicializarPaneles();
        pack();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        InicializarEventos();
        modoEdicion=false;
    }
    
    private void InicializarEventos(){
        InicializarEventoBotonAgregar();
        
        InicializarEventoBotonEditar();
        
        InicializarEventoBotonBorrar();
        
        InicializarEventoBotonRegresarMenu();
        
        InicializarEventoBotonGuardar();
        
        InicializarEventoBotonRegresar();
    }

    private void InicializarEventoBotonRegresar() {
        panelAgregarEditar.setBotonRegresarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelBase,"1");
                panelPrincipal.ActualizarTabla(administrador.getListaClientes());
                modoEdicion=false;
            }
        });
    }

    private void InicializarEventoBotonGuardar() {
        panelAgregarEditar.setBotonGuardarListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelAgregarEditar.camposValidados()){
                    Cliente nuevoCliente=new Cliente(panelAgregarEditar.getCampoNombre(),
                            panelAgregarEditar.getCampoDireccion(),
                            panelAgregarEditar.getCampoTelefono(),
                            panelAgregarEditar.getCampoEMail());
                    if(modoEdicion){
                        administrador.editarCliente(nuevoCliente);
                    }else{
                        administrador.agregarCliente(nuevoCliente);
                    }
                }
                else{
                    JOptionPane.showMessageDialog(null, "Llene los campos requeridos");
                }
            }
        });
    }

    private void InicializarEventoBotonRegresarMenu() {
        panelPrincipal.setListenerBotonRegresarMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                VistaMenuPrincipal menuPrincipal=new VistaMenuPrincipal();
                menuPrincipal.setVisible(true);
            }
        });
    }

    private void InicializarEventoBotonBorrar() {
        panelPrincipal.setListenerBotonBorrar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelPrincipal.seSeleccionoFila()){
                    Cliente nuevoCliente=new Cliente(panelPrincipal.getValorEnFilaSeleccionada(0),
                            panelPrincipal.getValorEnFilaSeleccionada(1),
                            panelPrincipal.getValorEnFilaSeleccionada(2),
                            panelPrincipal.getValorEnFilaSeleccionada(3));
                    
                    administrador.eliminarCliente(nuevoCliente);
                    panelPrincipal.ActualizarTabla(administrador.getListaClientes());
                }
                else{
                    JOptionPane.showMessageDialog(null, "Selecciona un elemento");
                }
            }
        });
    }

    private void InicializarEventoBotonEditar() {
        panelPrincipal.setListenerBotonEditar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelPrincipal.seSeleccionoFila()){
                    modoEdicion=true;
                    panelAgregarEditar.setCampoNombre(panelPrincipal.getValorEnFilaSeleccionada(0));
                    panelAgregarEditar.setCampoDireccion(panelPrincipal.getValorEnFilaSeleccionada(1));
                    panelAgregarEditar.setCampoTelefono(panelPrincipal.getValorEnFilaSeleccionada(2));
                    panelAgregarEditar.setCampoEMail(panelPrincipal.getValorEnFilaSeleccionada(3));
                    cardLayout.show(panelBase, "2");
                    pack();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Selecciona un elemento");
                }
            }
        });
    }

    private void InicializarEventoBotonAgregar() {
        panelPrincipal.setListenerBotonAgregar(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                panelAgregarEditar.setCampoNombre("");
                panelAgregarEditar.setCampoDireccion("");
                panelAgregarEditar.setCampoTelefono("");
                panelAgregarEditar.setCampoEMail("");
                cardLayout.show(panelBase, "2");
            }
        });
    }
    
    private void InicializarPaneles(){
        panelBase=new JPanel();  
        cardLayout=new CardLayout();
        panelBase.setLayout(cardLayout);
                      
        panelPrincipal=new PanelPrincipalCliente();
        panelAgregarEditar=new PanelAgregarEditarCliente();
        
        panelBase.add(panelPrincipal,"1");
        panelBase.add(panelAgregarEditar,"2");
        
        cardLayout.show(panelBase, "1");
        
        add(panelBase);
        panelPrincipal.ActualizarTabla(administrador.getListaClientes());
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
