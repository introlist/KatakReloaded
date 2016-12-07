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
import java.awt.LayoutManager;
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
    private javax.swing.JButton BotonAñadirProducto;
    private javax.swing.JButton BotonEliminarMateria;
    private javax.swing.JButton BotonEliminarProducto;
    private javax.swing.JButton BotonNuevaMateria;
    private javax.swing.JButton BotonNuevoProducto;
    private javax.swing.JButton BotonRegresarMenu;
    private javax.swing.JButton BotonSustraerMateria;
    private javax.swing.JButton BotonSustraerProducto;
    private javax.swing.JTextField CampoAñadirMateria;
    private javax.swing.JTextField CampoAñadirProducto;
    private javax.swing.JTextField CampoSustraerMateria;
    private javax.swing.JTextField CampoSustraerProducto;
    private javax.swing.JLabel LabelMateriasPrimas;
    private javax.swing.JLabel LabelProductos;
    private javax.swing.JTable TablaMateriasPrimas;
    private javax.swing.JTable TablaProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;

    public PanelInventario() {
        InicializarComponentes();
    }
    
    private void InicializarComponentes(){
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaMateriasPrimas = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaProductos = new javax.swing.JTable();
        LabelMateriasPrimas = new javax.swing.JLabel();
        LabelProductos = new javax.swing.JLabel();
        BotonAñadirProducto = new javax.swing.JButton();
        BotonSustraerProducto = new javax.swing.JButton();
        BotonNuevoProducto = new javax.swing.JButton();
        BotonEliminarProducto = new javax.swing.JButton();
        CampoAñadirProducto = new javax.swing.JTextField();
        CampoSustraerProducto = new javax.swing.JTextField();
        BotonAñadirMateria = new javax.swing.JButton();
        CampoAñadirMateria = new javax.swing.JTextField();
        BotonSustraerMateria = new javax.swing.JButton();
        CampoSustraerMateria = new javax.swing.JTextField();
        BotonNuevaMateria = new javax.swing.JButton();
        BotonEliminarMateria = new javax.swing.JButton();
        BotonRegresarMenu = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Inventario", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        TablaMateriasPrimas.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TablaMateriasPrimas);

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

        LabelMateriasPrimas.setText("Materias Primas");

        LabelProductos.setText("Productos");

        BotonAñadirProducto.setText("Añadir Cantidad");

        BotonSustraerProducto.setText("Sustraer Cantidad");

        BotonNuevoProducto.setText("Nuevo Producto");

        BotonEliminarProducto.setText("Eliminar Producto");

        BotonAñadirMateria.setText("Añadir Cantidad");

        BotonSustraerMateria.setText("Sustraer Cantidad");

        BotonNuevaMateria.setText("Nueva Materia Prima");

        BotonEliminarMateria.setText("Eliminar Materia Prima");

        BotonRegresarMenu.setText("Regresar al Menu Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelMateriasPrimas)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonNuevaMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminarMateria))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(LabelProductos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonNuevoProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonEliminarProducto))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonAñadirProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSustraerProducto)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoSustraerProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(BotonAñadirMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoAñadirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonSustraerMateria)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CampoSustraerMateria, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BotonRegresarMenu, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BotonNuevaMateria)
                        .addComponent(BotonEliminarMateria))
                    .addComponent(LabelMateriasPrimas))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAñadirMateria)
                    .addComponent(BotonSustraerMateria)
                    .addComponent(CampoAñadirMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoSustraerMateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelProductos)
                    .addComponent(BotonNuevoProducto)
                    .addComponent(BotonEliminarProducto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAñadirProducto)
                    .addComponent(BotonSustraerProducto)
                    .addComponent(CampoAñadirProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CampoSustraerProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(BotonRegresarMenu)
                .addContainerGap())
        );
    }
    
//---------------------Metodos de ActionListener-------------------------------    
    
    public void setListenerBotonRegresarMenu(ActionListener listener){
        BotonRegresarMenu.addActionListener(listener);
    }
    
    public void setListenerBotonAñadirMateria(ActionListener listener){
        BotonAñadirMateria.addActionListener(listener);
    }
    
    public void setListenerBotonAñadirProducto(ActionListener listener){
        BotonAñadirProducto.addActionListener(listener);
    }
    
    public void setListenerBotonEliminarMateria(ActionListener listener){
        BotonEliminarMateria.addActionListener(listener);
    }
    
    public void setListenerBotonEliminarProducto(ActionListener listener){
        BotonEliminarProducto.addActionListener(listener);
    }
    
    public void setListenerBotonNuevaMateria(ActionListener listener){
        BotonNuevaMateria.addActionListener(listener);
    }

    public void setListenerBotonNuevoProducto(ActionListener listener){
        BotonNuevoProducto.addActionListener(listener);
    }
    
    public void setListenerBotonSustraerMateria(ActionListener listener){
        BotonSustraerMateria.addActionListener(listener);
    }
    
    public void setListenerBotonSustraerProducto(ActionListener listener){
        BotonSustraerProducto.addActionListener(listener);
    }
    
//----------------------Metodos tabla Materia Prima----------------------------    
    
    private TableModel getTableModelTablaMateriasP(){
        return TablaMateriasPrimas.getModel();
    }
    
    private int getFilaSeleccTablaMateriasP(){
        return TablaMateriasPrimas.getSelectedRow();
    }
    
    public String getValorEnFilaSeleccTablaMateriasP(int columna){
        return getTableModelTablaMateriasP().getValueAt(getFilaSeleccTablaMateriasP(),columna).toString();
    }
    
    public boolean seSeleccFilaTablaMateriasP(){
        int NINGUNA_FILA_SELECCIONADA=-1;
        
        return (getFilaSeleccTablaMateriasP() !=NINGUNA_FILA_SELECCIONADA);
    }
    
    public void ActualizarTablaMateriasP(List<MateriaPrima> materiales){
        DefaultTableModel modelo=(DefaultTableModel)getTableModelTablaMateriasP();
        modelo.setRowCount(0);
        for(MateriaPrima materiaPrima:materiales){
            modelo.addRow(new Object[]{materiaPrima.getNombre(),
                                       materiaPrima.getCantidad()+" "+
                                       materiaPrima.getUnidadMedida()
                                               .getNombreUnidadMedida()}
                         );
        }
    }
    
//------------------------Metodos de la tabla Productos-------------------------
    private TableModel getTableModelTablaProductos(){
        return TablaProductos.getModel();
    }
    
    private int getFilaSeleccTablaProductos(){
        return TablaProductos.getSelectedRow();
    }
    
    public String getValorEnFilaSeleccTablaProductos(int columna){
        return getTableModelTablaProductos().getValueAt(getFilaSeleccTablaProductos(), columna).toString();
    }
    
    public boolean seSeleccFilaTablaProductos(){
        int NINGUNA_FILA_SELECCIONADA=-1;
        
        return (getFilaSeleccTablaProductos() !=NINGUNA_FILA_SELECCIONADA);
    }
    
    public void ActualizarTablaProductos(List<ProductosExistentes> productosExist){
        DefaultTableModel modelo=(DefaultTableModel)getTableModelTablaProductos();
        modelo.setRowCount(0);
        for(ProductosExistentes producto:productosExist){
            modelo.addRow(new Object[]{producto.getProducto().getNombre(),
                                       producto.getCantidadExistente()}
                         );
        }
    }
//-----------------------------Metodos de get campo----------------------------

    public String getCampoAñadirMateria(){
        return CampoAñadirMateria.getText();
    }
    
    public String getCampoAñadirProducto(){
        return CampoAñadirProducto.getText();
    }
    
    public String getCampoSustraerMateria(){
        return CampoSustraerMateria.getText();
    }
    
    public String getCampoSustraerProducto(){
        return CampoSustraerProducto.getText();
    }
}
