/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author Bernardo Espinoza
 */
public class PanelAgregarEditarCliente extends javax.swing.JPanel{
    private javax.swing.JButton BotonGuardar;
    private javax.swing.JButton BotonRegresar;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoEMail;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JTextField CampoTelefono;
    private javax.swing.JLabel LabelDireccion;
    private javax.swing.JLabel LabelEMail;
    private javax.swing.JLabel LabelNombre;
    private javax.swing.JLabel LabelObligatorios;
    private javax.swing.JLabel LabelTelefono;

    public PanelAgregarEditarCliente() {
        InicializarComponentes();
    }

    private void InicializarComponentes() {
        LabelNombre = new javax.swing.JLabel();
        CampoNombre = new javax.swing.JTextField();
        LabelDireccion = new javax.swing.JLabel();
        CampoDireccion = new javax.swing.JTextField();
        LabelTelefono = new javax.swing.JLabel();
        CampoTelefono = new javax.swing.JTextField();
        LabelEMail = new javax.swing.JLabel();
        CampoEMail = new javax.swing.JTextField();
        LabelObligatorios = new javax.swing.JLabel();
        BotonGuardar = new javax.swing.JButton();
        BotonRegresar = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Cliente", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        LabelNombre.setText("Nombre*");

        LabelDireccion.setText("Dirección*");

        LabelTelefono.setText("Telefono *");

        LabelEMail.setText("E-mail");

        LabelObligatorios.setText("Obligatorios*");

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
                                                        .addComponent(LabelTelefono)
                                                        .addComponent(LabelEMail)
                                                        .addComponent(LabelDireccion)
                                                        .addComponent(LabelNombre))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(CampoNombre)
                                                        .addComponent(CampoDireccion)
                                                        .addComponent(CampoTelefono)
                                                        .addComponent(CampoEMail)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addGap(0, 201, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(LabelObligatorios, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(BotonGuardar)
                                                                .addGap(11, 11, 11)
                                                                .addComponent(BotonRegresar)))))
                                .addContainerGap())
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
                                        .addComponent(LabelDireccion)
                                        .addComponent(CampoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LabelTelefono)
                                        .addComponent(CampoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(LabelEMail)
                                        .addComponent(CampoEMail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(LabelObligatorios)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(BotonGuardar)
                                        .addComponent(BotonRegresar))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }

    public void setBotonRegresarListener(ActionListener listener){
        BotonRegresar.addActionListener(listener);
    }
    
    public void setBotonGuardarListener(ActionListener listener){
        BotonGuardar.addActionListener(listener);
    }
    
    public String getCampoNombre(){
        return CampoNombre.getText();
    }
    
    public String getCampoDireccion(){
        return CampoDireccion.getText();
    }
    
    public String getCampoTelefono(){
        return CampoTelefono.getText();
    }
    
    public String getCampoEMail(){
        return CampoEMail.getText();
    }
    
    public void setCampoDireccion(String direccion){
        CampoDireccion.setText(direccion);
    }
    
    public void setCampoNombre(String nombre){
        CampoNombre.setText(nombre);
    }
    
    public void setCampoTelefono(String telefono){
        CampoTelefono.setText(telefono);
    }
    
    public void setCampoEMail(String mail){
        CampoEMail.setText(mail);
    }
    
    public boolean camposValidados(){
        ajustarCampos();
        return (
                !getCampoNombre().equals("") || 
                !getCampoDireccion().equals("") || 
                !getCampoTelefono().equals("")
                );
    }

    private void ajustarCampos() {
        setCampoNombre(getCampoNombre().trim());
        setCampoDireccion(getCampoDireccion().trim());
        setCampoTelefono(getCampoTelefono().trim());
        setCampoEMail(getCampoEMail().trim());
    }
}
