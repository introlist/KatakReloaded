/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista.Tablas;

import Negocio.Entidades.ProductosVendidos;
import java.util.Arrays;

/**
 *
 * @author DEMON
 */
public class ModeloTablaProductosVendidos extends ModeloTabla<ProductosVendidos>{
    private static final int INDICE_NOMBRE_PROD = 0;
    private static final int INDICE_CANTIDAD_GRUPO = 1;
    private static final int INDICE_COSTO_GRUPO = 2;
    
    private static final String[] TITULOS_COLUMNAS =
    {
        "Nombre Producto",
        "Cantidad",
        "Costo"
    };
    
    public ModeloTablaProductosVendidos() {
        super(Arrays.asList(TITULOS_COLUMNAS));
        setClaseFila(ProductosVendidos.class);
        setModeloEditable(false);
    }
    
    @Override
    public Object getValueAt(int indiceFila, int indiceColumna) {
        ProductosVendidos productosVendidos = getFila(indiceFila);
        
        switch(indiceColumna) {
            case INDICE_NOMBRE_PROD:
                return productosVendidos.getNombreProducto();
            case INDICE_CANTIDAD_GRUPO:
                return productosVendidos.getCantidad();
            case INDICE_COSTO_GRUPO:
                return productosVendidos.getCostoTotal();
            default:
                return null;
        }
    }  
}

