/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Paneles;

import javax.swing.JButton;

/**
 *
 * @author Bernardo Espinoza
 */
public class PanelPrincipalPedido extends javax.swing.JPanel {
    private javax.swing.JButton BotonAgregar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton BotonRegresarMenu;
    private javax.swing.JTable TablaPedidos;
    private javax.swing.JScrollPane ScrollPanePedidos;

    public PanelPrincipalPedido() {
        ScrollPanePedidos = new javax.swing.JScrollPane();
        TablaPedidos = new javax.swing.JTable();
        BotonAgregar = new javax.swing.JButton();
        BotonEditar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonRegresarMenu = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Listado de Pedidos", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.ABOVE_TOP));

        TablaPedidos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Direccion", "Fecha", "Costo Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        ScrollPanePedidos.setViewportView(TablaPedidos);

        BotonAgregar.setText("Agregar");

        BotonEditar.setText("Editar");

        BotonCancelar.setText("Cancelar");

        BotonRegresarMenu.setText("Regressar al Menu Principal");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(this);
        setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ScrollPanePedidos)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(BotonAgregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(BotonCancelar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(BotonRegresarMenu)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ScrollPanePedidos, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BotonAgregar)
                    .addComponent(BotonEditar)
                    .addComponent(BotonCancelar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(BotonRegresarMenu)
                .addContainerGap())
        );
    }

    public JButton getBotonAgregar() {
        return BotonAgregar;
    }
}
