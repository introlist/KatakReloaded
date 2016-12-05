/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import java.awt.event.ActionListener;
import java.util.Enumeration;
import javax.swing.AbstractButton;
import javax.swing.JPanel;

/**
 *
 * @author Bernardo Espinoza
 */
public class PanelNuevaMateriaPrima extends JPanel{
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JLabel LabelMedida;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JRadioButton RbGramos;
    private javax.swing.JRadioButton RbKilogramos;
    private javax.swing.JRadioButton RbUnidades;
    private javax.swing.ButtonGroup GrupoBotones;

    public PanelNuevaMateriaPrima() {
        InicializarComponentes();
    }

    private void InicializarComponentes() {
        GrupoBotones = new javax.swing.ButtonGroup();
        LabelNombre = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        LabelMedida = new javax.swing.JLabel();
        RbUnidades = new javax.swing.JRadioButton();
        RbGramos = new javax.swing.JRadioButton();
        RbKilogramos = new javax.swing.JRadioButton();
        BotonGuardar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Agregar nueva materia prima", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        LabelNombre.setText("Nombre");

        LabelMedida.setText("Unidad de medida");

        GrupoBotones.add(RbUnidades);
        RbUnidades.setText("Unidades");

        GrupoBotones.add(RbGramos);
        RbGramos.setText("Gramos");

        GrupoBotones.add(RbKilogramos);
        RbKilogramos.setText("Kilogramos");

        BotonGuardar.setText("Guardar");

        BotonRegresar.setText("Regresar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(BotonGuardar)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(BotonRegresar))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(LabelNombre)
                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                        .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(LabelMedida)
                                                        .addGap(18, 18, 18)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                .addComponent(RbKilogramos)
                                                                .addComponent(RbUnidades)
                                                                .addComponent(RbGramos))))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(LabelNombre)
                                .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(LabelMedida)
                                .addComponent(RbUnidades))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RbGramos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(RbKilogramos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(BotonGuardar)
                                .addComponent(BotonRegresar))
                        .addContainerGap())
        );
    }
    
    public String getCampoNombre(){
        return CampoNombre.getText();
    }
    
    public String getBotonSeleccionado(){
        for (Enumeration<AbstractButton> botones = GrupoBotones.getElements(); botones.hasMoreElements();) {
            AbstractButton button = botones.nextElement();

            if (button.isSelected()) {
                return button.getText();
            }
        }
        return null;
    }
    
    public void setListenerBotonGuardar(ActionListener listener){
        BotonGuardar.addActionListener(listener);
    }
    
    public void setListenerBotonRegresar(ActionListener listener){
        BotonRegresar.addActionListener(listener);
    }
}
