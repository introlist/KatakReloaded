/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Negocio.Entidades.Enums.UnidadMedida;
import Negocio.Entidades.MateriaPrima;
import Negocio.Entidades.Producto;
import Negocio.Operaciones.SupervisorInventarioMateriaPrima;
import Negocio.Operaciones.SupervisorInventarioProductos;
import Vista.Paneles.PanelInventario;
import Vista.Paneles.PanelNuevaMateriaPrima;
import Vista.Paneles.PanelNuevoProducto;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Action;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Mario
 */
public class vistaInventario extends javax.swing.JFrame {
    private JPanel panelBase;
    private PanelInventario panelInv;
    private PanelNuevaMateriaPrima panelNuevaMat;
    private PanelNuevoProducto panelNuevoProd;
    private CardLayout cardLayout;
    private SupervisorInventarioMateriaPrima supervisorMatPrima;
    private SupervisorInventarioProductos supervisorProds;

    /**
     * Creates new form vistaInventario
     */
    public vistaInventario() {
        supervisorMatPrima=new SupervisorInventarioMateriaPrima();
        supervisorProds=new SupervisorInventarioProductos();
        
        InicializarPaneles();
        
        pack();
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        
        InicializarEventos();
    }
    
    private void InicializarPaneles(){
        panelBase=new JPanel();
        cardLayout=new CardLayout();
        panelBase.setLayout(cardLayout);
        
        panelInv=new PanelInventario();
        panelNuevaMat=new PanelNuevaMateriaPrima();
        panelNuevoProd=new PanelNuevoProducto();
        
        panelBase.add(panelInv,"1");
        panelBase.add(panelNuevaMat,"2");
        panelBase.add(panelNuevoProd,"3");
        
        cardLayout.show(panelBase,"1");
        
        add(panelBase);
        ActualizarTablas();
    }

    private void ActualizarTablas() {
        panelInv.ActualizarTablaMateriasP(supervisorMatPrima.getListadoMateriaPrima());
        panelInv.ActualizarTablaProductos(supervisorProds.getListaProductosDisponibles());
    }
    
    private void InicializarEventos(){
        InicializarEventoBotonAñadirMateriaPrima();
        InicializarEventoBotonAñadirProducto();
        InicializarEventoBotonEliminarMateriaPrima();
        InicializarEventoBotonEliminarProducto();
        InicializarEventoBotonGuardarMateriaPrima();
        InicializarEventoBotonGuardarProducto();
        InicializarEventoBotonNuevaMateriaPrima();
        InicializarEventoBotonNuevoProducto();
        InicializarEventoBotonRegresarDeMateriaPrimaNueva();
        InicializarEventoBotonRegresarDeProductoNuevo();
        InicializarEventoBotonSustraerMateriaPrima();
        InicializarEventoBotonSustraerProducto();
        InicializarEventoBotonRegresarMenu();
    }
    
    private void InicializarEventoBotonRegresarMenu(){
        panelInv.setListenerBotonRegresarMenu(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                MenuPrincipal menuPrincipal=new MenuPrincipal();
                menuPrincipal.setVisible(true);
                
            }
        });
    }
    
    private void InicializarEventoBotonAñadirMateriaPrima(){
        panelInv.setListenerBotonAñadirMateria(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelInv.seSeleccFilaTablaMateriasP()){
                    supervisorMatPrima.agregarCantidadAInventario(
                            panelInv.getValorEnFilaSeleccTablaMateriasP(0),
                            Integer.parseInt(panelInv.getCampoAñadirMateria())
                    );
                    ActualizarTablas();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            }
            
        });
    }
    
    private void InicializarEventoBotonAñadirProducto(){
        panelInv.setListenerBotonAñadirProducto(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelInv.seSeleccFilaTablaProductos()){
                    supervisorProds.agregarCantidadAInventario(
                            panelInv.getValorEnFilaSeleccTablaProductos(0),
                            Integer.parseInt(panelInv.getCampoAñadirProducto())
                    );
                    ActualizarTablas();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            }
        });
    }
    
    private void InicializarEventoBotonNuevaMateriaPrima(){
        panelInv.setListenerBotonNuevaMateria(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelBase, "2");
            }
        });
    }
    
    private void InicializarEventoBotonNuevoProducto(){
        panelInv.setListenerBotonNuevoProducto(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelBase, "3");
            }
        });
    }
    
    private void InicializarEventoBotonSustraerMateriaPrima(){
        panelInv.setListenerBotonSustraerMateria(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelInv.seSeleccFilaTablaMateriasP()){
                    supervisorMatPrima.quitarCantidadDelInventario(
                            panelInv.getValorEnFilaSeleccTablaMateriasP(0),
                            Integer.parseInt(panelInv.getCampoSustraerMateria())
                    );
                    ActualizarTablas();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            }
        });
    }
    
    private void InicializarEventoBotonSustraerProducto(){
        panelInv.setListenerBotonSustraerProducto(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelInv.seSeleccFilaTablaProductos()){
                    supervisorProds.quitarCantidadDelInventario(
                            panelInv.getValorEnFilaSeleccTablaProductos(0),
                            Integer.parseInt(panelInv.getCampoSustraerProducto())
                    );
                    ActualizarTablas();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            }
        });
    }
    
    private void InicializarEventoBotonEliminarMateriaPrima(){
        panelInv.setListenerBotonEliminarMateria(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelInv.seSeleccFilaTablaMateriasP()){
                    supervisorMatPrima.borrarMateriaPrima(
                            panelInv.getValorEnFilaSeleccTablaMateriasP(0)
                    );
                    ActualizarTablas();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            }
        });
    }
    
    private void InicializarEventoBotonEliminarProducto(){
        panelInv.setListenerBotonEliminarProducto(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(panelInv.seSeleccFilaTablaProductos()){
                    supervisorProds.quitarDisponibilidadProducto(
                            panelInv.getValorEnFilaSeleccTablaProductos(0)
                    );
                    ActualizarTablas();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Seleccione una fila");
                }
            }
        });
    }
    
    private void InicializarEventoBotonGuardarMateriaPrima(){
        panelNuevaMat.setListenerBotonGuardar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                MateriaPrima nuevaMateriaPrima=new MateriaPrima(
                        panelNuevaMat.getCampoNombre(),
                        panelNuevaMat.getBotonSeleccionado()
                );
                supervisorMatPrima.registrarNuevoMaterial(nuevaMateriaPrima);
            }
        });
    }
    
    private void InicializarEventoBotonGuardarProducto(){
        panelNuevoProd.setListenerBotonGuardar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Producto nuevoProducto=new Producto(
                        panelNuevoProd.getCampoNombre(),
                        Integer.parseInt(panelNuevoProd.getCampoPrecio())
                );
                supervisorProds.registrarNuevoProducto(nuevoProducto);
            }
        });
    }
    
    private void InicializarEventoBotonRegresarDeMateriaPrimaNueva(){
        panelNuevaMat.setListenerBotonRegresar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelBase, "1");
                ActualizarTablas();
            }
        });
    }
    
    private void InicializarEventoBotonRegresarDeProductoNuevo(){
        panelNuevoProd.setListenerBotonRegresar(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cardLayout.show(panelBase, "1");
                ActualizarTablas();
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 61, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 63, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new vistaInventario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
