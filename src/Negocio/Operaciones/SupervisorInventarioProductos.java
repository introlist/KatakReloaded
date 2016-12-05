/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosProductosExistentes;
import Negocio.Entidades.ProductosExistentes;
import java.util.List;

/**
 *
 * @author Mario
 */
public class SupervisorInventarioProductos {
    private final AccesoDatosProductosExistentes datosProductosExistentes;

    public SupervisorInventarioProductos() {
        datosProductosExistentes = new AccesoDatosProductosExistentes();
    }
    
    public void AgregarProductosExistentes(ProductosExistentes productosExistentes){
        datosProductosExistentes.insertar(productosExistentes);
    }
    
    public void EditarProductosExistentes(ProductosExistentes productosExistentes){
        datosProductosExistentes.sobrescribir(productosExistentes);
    }
    
    public void BorrarProductosExistentes(ProductosExistentes productosExistentes){
        datosProductosExistentes.borrar(productosExistentes);
    }
    
    public ProductosExistentes getProductosExistentesPorID(int id) {
        return datosProductosExistentes.getPorID(id);
    }
    
    public List<ProductosExistentes> getListaProductosExistentes() {
        return datosProductosExistentes.getListaTodos();
    }
    
    public void AgregarCantidadInventario(ProductosExistentes productoExistente,int cantidadAgregada){
        List<ProductosExistentes> lista=getListaProductosExistentes();
        int cantidadExistente=0;
        for(ProductosExistentes nuevoProductoExistente:lista){
            if(nuevoProductoExistente==productoExistente){
                cantidadExistente=nuevoProductoExistente.getCantidadExistente()+cantidadAgregada;
                nuevoProductoExistente.setCantidadExistente(cantidadExistente);
                EditarProductosExistentes(nuevoProductoExistente);
            }
        }
    }
    
    public void QuitarCantidadInventario(ProductosExistentes productoExistente,int cantidadQuitada){
        List<ProductosExistentes> lista=getListaProductosExistentes();
        int cantidadExistente=0;
        for(ProductosExistentes nuevoProductoExistente:lista){
            if(nuevoProductoExistente==productoExistente){
                cantidadExistente=nuevoProductoExistente.getCantidadExistente()-cantidadQuitada;
                nuevoProductoExistente.setCantidadExistente(cantidadExistente);
                EditarProductosExistentes(nuevoProductoExistente);
            }
        }
    }
    
}
