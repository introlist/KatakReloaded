/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import Negocio.Entidades.Pedido;
import java.util.Arrays;

/**
 *
 * @author DEMON
 */
public class ModeloTablaPedidos extends ModeloTabla<Pedido> {
    public static final int INDICE_NOMBRE_COMPRADOR=0;
    public static final int INDICE_FECHA_ENTREGA=1;
    public static final int INDICE_DIRECCION=2;
    public static final int INDICE_TELEFONO=3;
    public static final int INDICE_COSTO_TOTAL=4;
    public static final int INDICE_FECHA_CREACION=5;
    
    private static final String[] TITULOS_COLUMNAS ={
        "Comprador",
        "Fecha de Entrega",
        "Direccion",
        "Telefono",
        "Costo total",
        "Fecha Creacion"
    };

    public ModeloTablaPedidos() {
        super(Arrays.asList(TITULOS_COLUMNAS));
        setClaseFila(Pedido.class);
        setModeloEditable(false);
    }

    @Override
    public Object getValueAt(int indiceFila, int indiceColumna) {
        Pedido pedido=getFila(indiceFila);
        
        switch(indiceColumna){
            case INDICE_NOMBRE_COMPRADOR:
                return pedido.getNombreComprador();
            case INDICE_FECHA_ENTREGA:
                return pedido.getFechaEntrega();
            case INDICE_DIRECCION:
                return pedido.getDireccion();
            case INDICE_TELEFONO:
                return pedido.getTelefono();
            case INDICE_COSTO_TOTAL:
                return pedido.getCostoTotal();
            case INDICE_FECHA_CREACION:
                return pedido.getFechaEntrega();
            default:
                return null;
        }

    }
    
}
