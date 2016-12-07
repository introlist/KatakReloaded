/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import java.awt.event.ActionListener;
import javax.swing.JPanel;

/**
 *
 * @author Bernardo Espinoza
 */
public class PanelNuevoProducto extends JPanel {
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoPrecio;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelPrecio;

    public PanelNuevoProducto() {
        InicializarComponentes();
    }
    
    private void InicializarComponentes(){
        LabelNombre = new javax.swing.JLabel();
        LabelPrecio = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        CampoPrecio = new javax.swing.JTextField();
        BotonGuardar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Añadir nuevo producto", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        LabelNombre.setText("Nombre");

        LabelPrecio.setText("Precio unitario");

        BotonGuardar.setText("Guardar");

        BotonRegresar.setText("Regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(LabelNombre)
                            .addComponent(LabelPrecio))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoNombre)
                            .addComponent(CampoPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 135, Short.MAX_VALUE)
                        .addComponent(BotonRegresar)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelNombre)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelPrecio)
                    .addComponent(CampoPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonGuardar)
                    .addComponent(BotonRegresar))
                .addContainerGap())
        );
    }
    
    public void setListenerBotonGuardar(ActionListener listener){
        BotonGuardar.addActionListener(listener);
    }
    
    public void setListenerBotonRegresar(ActionListener listener){
        BotonRegresar.addActionListener(listener);
    }
    
    public String getCampoNombre(){
        return CampoNombre.getText();
    }
    
    public String getCampoPrecio(){
        return CampoPrecio.getText();
    }
}
