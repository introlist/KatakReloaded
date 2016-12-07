/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosProductosExistentes;
import Negocio.Entidades.Producto;
import Negocio.Entidades.ProductosExistentes;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Mario
 */
public class SupervisorInventarioProductos {
    private AdminProductos adminProductos;
    private AdminProductosExistentes adminProductosExistentes;

    public SupervisorInventarioProductos() {
        adminProductos = new AdminProductos();
        adminProductosExistentes = new AdminProductosExistentes();
    }
    
    
    
    public void agregarCantidadAInventario(String nombre,int cantidadAgregada){
        List<ProductosExistentes> lista=adminProductosExistentes.getListaProductosExistentes();
        int cantidadExistente=0;
        for(ProductosExistentes nuevoProductoExistente:lista){
            if(nuevoProductoExistente.getProducto().getNombre().equals(nombre)){
                cantidadExistente=nuevoProductoExistente.getCantidadExistente()+cantidadAgregada;
                nuevoProductoExistente.setCantidadExistente(cantidadExistente);
                adminProductosExistentes.EditarProductosExistentes(nuevoProductoExistente);
            }
        }
    }
    
    public void quitarCantidadDelInventario(String nombre,int cantidadQuitada){
        List<ProductosExistentes> lista=adminProductosExistentes.getListaProductosExistentes();
        int cantidadExistente=0;
        for(ProductosExistentes nuevoProductoExistente:lista){
            if(nuevoProductoExistente.getProducto().getNombre().equals(nombre)){
                cantidadExistente=nuevoProductoExistente.getCantidadExistente()-cantidadQuitada;
                nuevoProductoExistente.setCantidadExistente(cantidadExistente);
                adminProductosExistentes.EditarProductosExistentes(nuevoProductoExistente);
            }
        }
    }
    
    public void registrarNuevoProducto(Producto nuevoProducto){
        adminProductos.AgregarProductos(nuevoProducto);
        ProductosExistentes nuevoProductosExistentes=new ProductosExistentes(nuevoProducto, 0);
        adminProductosExistentes.AgregarProductosExistentes(nuevoProductosExistentes);
    }
    
    public List<ProductosExistentes> getListaProductosDisponibles(){
        List<ProductosExistentes> prodsDisponibles=new ArrayList<>();
        List<ProductosExistentes> lista=adminProductosExistentes.getListaProductosExistentes();
        for(ProductosExistentes nuevoProductosExistentes:lista){
            if(nuevoProductosExistentes.getProducto().esDisponible()){
                prodsDisponibles.add(nuevoProductosExistentes);
            }
        }
        return prodsDisponibles;
    }
    
    public void quitarDisponibilidadProducto(String nombre){
        List<ProductosExistentes> lista=adminProductosExistentes.getListaProductosExistentes();
        for(ProductosExistentes productosExistentes:lista){
            if(productosExistentes.getProducto().getNombre().equals(nombre)){
               Producto producto = productosExistentes.getProducto();
               producto.setEsDisponible(false);
               adminProductos.EditarProductos(producto);
            }
        }
    }
    
}
