/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import Negocio.Entidades.Cliente;
import Negocio.Entidades.Enums.UnidadMedida;
import Negocio.Entidades.MateriaPrima;
import Negocio.Entidades.ProductosExistentes;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Bernardo Espinoza
 */
public class PanelInventario extends JPanel{
    private javax.swing.JButton BotonAñadirMateria;
    private javax.swing.JButton BotonAñadirProductos;
    private javax.swing.JButton BotonNuevaMateria;
    private javax.swing.JButton BotonNuevoProductos;
    private javax.swing.JButton BotonSustraerMateria;
    private javax.swing.JButton BotonSustraerProducto;
    private javax.swing.JLabel LabelMaterias;
    private javax.swing.JLabel LabelProductos;
    private javax.swing.JTable TablaMateriaPrima;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;

    public PanelInventario() {
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMateriaPrima = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        LabelMaterias = new javax.swing.JLabel();
        LabelProductos = new javax.swing.JLabel();
        BotonAñadirMateria = new javax.swing.JButton();
        BotonSustraerMateria = new javax.swing.JButton();
        BotonNuevaMateria = new javax.swing.JButton();
        BotonAñadirProductos = new javax.swing.JButton();
        BotonSustraerProducto = new javax.swing.JButton();
        BotonNuevoProductos = new javax.swing.JButton();


        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        TablaMateriaPrima.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaMateriaPrima);

        TablaProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Cantidad"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaProductos);

        LabelMaterias.setText("Materias Primas");

        LabelProductos.setText("Productos");

        BotonAñadirMateria.setText("Añadir");

        BotonSustraerMateria.setText("Sustraer");

        BotonNuevaMateria.setText("Nuevo");

        BotonAñadirProductos.setText("Añadir");

        BotonSustraerProducto.setText("Sustraer");

        BotonNuevoProductos.setText("Nuevo");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(LabelMaterias)
                            .addComponent(LabelProductos)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonAñadirMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonSustraerMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonNuevaMateria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonAñadirProductos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonSustraerProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BotonNuevoProductos)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(LabelMaterias)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAñadirMateria)
                    .addComponent(BotonSustraerMateria)
                    .addComponent(BotonNuevaMateria))
                .addGap(35, 35, 35)
                .addComponent(LabelProductos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAñadirProductos)
                    .addComponent(BotonSustraerProducto)
                    .addComponent(BotonNuevoProductos))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }
    
//--------------------------Metodos de agregar ActionListeners------------------
    public void agregarListenerBtnAñadirMat(ActionListener listener){
        BotonAñadirMateria.addActionListener(listener);
    }
    
    public void agregarListenerBtnAñadirProd(ActionListener listener){
        BotonAñadirProductos.addActionListener(listener);
    }
    
    public void agregarListenerBtnNuevaMat(ActionListener listener){
        BotonNuevaMateria.addActionListener(listener);
    }
    
    public void agregarListenerBtnNuevoProd(ActionListener listener){
        BotonNuevoProductos.addActionListener(listener);
    }
    
    public void agregarListenerBtnSustraerMat(ActionListener listener){
        BotonSustraerMateria.addActionListener(listener);
    }
    
    public void agregarListenerBtnSustraerProd(ActionListener listener){
        BotonSustraerProducto.addActionListener(listener);
    }
    
//---------------------------Metodos de la tabla de Materias Primas-------------     
    
    private TableModel obtenerTableModelMateria(){
        return TablaMateriaPrima.getModel();
    }
    
    private int obtenerFilaSelecTablaMateria(){
        return TablaMateriaPrima.getSelectedRow();
    }       
    
    public String obtenerValorFilaSelecMateria(int columna){
        return obtenerTableModelMateria().getValueAt(obtenerFilaSelecTablaMateria(), columna).toString();
    }
    
    public boolean seSeleccionoFilaTablaMateria(){
        int NINGUNA_FILA_SELECCIONADA=-1;
        
        return (obtenerFilaSelecTablaMateria() !=NINGUNA_FILA_SELECCIONADA);
    }
    
    public void ActualizarTablaMateria(List<MateriaPrima> listaMateriaPrima){
        DefaultTableModel modelo=(DefaultTableModel)obtenerTableModelMateria();
        modelo.setRowCount(0);
        for(MateriaPrima materiaPrima:listaMateriaPrima){
            modelo.addRow(new Object[]{materiaPrima.getNombre(),
                                       materiaPrima.getCantidad()+
                                       materiaPrima.getUnidadMedida()
                                               .getNombreUnidadMedida()}
                         );
        }
    }
    
//-----------------------------Metodos de la tabla de Productos----------------
    private TableModel obtenerTableModelProducto(){
        return TablaProductos.getModel();
    }
    
    private int obtenerFilaSelecTablaProducto(){
        return TablaProductos.getSelectedRow();
    }       
    
    public String obtenerValorFilaSelecProducto(int columna){
        return obtenerTableModelProducto().getValueAt(obtenerFilaSelecTablaProducto(), columna).toString();
    }
    
    public boolean seSeleccionoFilaTablaProducto(){
        int NINGUNA_FILA_SELECCIONADA=-1;
        
        return (obtenerFilaSelecTablaProducto() !=NINGUNA_FILA_SELECCIONADA);
    }
    
    public void ActualizarTablaProducto(List<ProductosExistentes> listaProdExist){
        DefaultTableModel modelo=(DefaultTableModel)obtenerTableModelProducto();
        modelo.setRowCount(0);
        for(ProductosExistentes prodExist:listaProdExist){
            modelo.addRow(new Object[]{prodExist.getProductoExistente().getNombre(),
                                       prodExist.getCantidadExistente()}
                         );
        }
    }    
}
