/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosProductosVendidos;
import Negocio.Entidades.ProductosVendidos;
import java.util.List;

/********************************************************************** 
 
    CLASE: {@link AdminProductosVendidos}
    
    AUTOR: Roberto Gil Flores

 **********************************************************************/
public class AdminProductosVendidos {
    private final AccesoDatosProductosVendidos datosProductosVendidos;
    
    public AdminProductosVendidos(){
        datosProductosVendidos = new AccesoDatosProductosVendidos();
    }
    
    public void AgregarProductosVendidos(ProductosVendidos productosVendidos){
        datosProductosVendidos.insertar(productosVendidos);
    }
    
    public void EditarProductosVendidos(ProductosVendidos productosVendidos){
        datosProductosVendidos.sobrescribir(productosVendidos);
    }
    
    public void BorrarProductosVendidos(ProductosVendidos productosVendidos){
        datosProductosVendidos.borrar(productosVendidos);
    }
    
    public ProductosVendidos getProductosVendidosPorID(int id) {
        return datosProductosVendidos.getPorID(id);
    }
    
    public List<ProductosVendidos> getListaProductosVendidos() {
        return datosProductosVendidos.getListaTodos();
    }
}