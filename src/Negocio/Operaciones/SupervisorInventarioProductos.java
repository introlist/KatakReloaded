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
    private AdminProductos adminProd;
    private final AccesoDatosProductosExistentes datosProductosExistentes;

    public SupervisorInventarioProductos() {
        datosProductosExistentes = new AccesoDatosProductosExistentes();
        adminProd = new AdminProductos();
    }
    
    private void AgregarProductosExistentes(ProductosExistentes productosExistentes){
        datosProductosExistentes.insertar(productosExistentes);
    }
    
    private void EditarProductosExistentes(ProductosExistentes productosExistentes){
        datosProductosExistentes.sobrescribir(productosExistentes);
    }
    
    private void BorrarProductosExistentes(ProductosExistentes productosExistentes){
        datosProductosExistentes.borrar(productosExistentes);
    }
    
    private ProductosExistentes getProductosExistentesPorID(int id) {
        return datosProductosExistentes.getPorID(id);
    }
    
    private List<ProductosExistentes> getListaProductosExistentes() {
        return datosProductosExistentes.getListaTodos();
    }
    
    public void AgregarAInventario(String nombre,int cantidadAgregada){
        List<ProductosExistentes> lista=getListaProductosExistentes();
        int cantidadExistente=0;
        for(ProductosExistentes nuevoProductoExistente:lista){
            if(nuevoProductoExistente.getProductoExistente().getNombre().equals(nombre)){
                cantidadExistente=nuevoProductoExistente.getCantidadExistente()+cantidadAgregada;
                nuevoProductoExistente.setCantidadExistente(cantidadExistente);
                EditarProductosExistentes(nuevoProductoExistente);
            }
        }
    }
    
    public void QuitarDelInventario(String nombre,int cantidadQuitada){
        List<ProductosExistentes> lista=getListaProductosExistentes();
        int cantidadExistente=0;
        for(ProductosExistentes nuevoProductoExistente:lista){
            if(nuevoProductoExistente.getProductoExistente().getNombre().equals(nombre)){
                cantidadExistente=nuevoProductoExistente.getCantidadExistente()-cantidadQuitada;
                nuevoProductoExistente.setCantidadExistente(cantidadExistente);
                EditarProductosExistentes(nuevoProductoExistente);
            }
        }
    }
    
    public void GestionarNuevoProducto(Producto nuevoProducto){
        adminProd.AgregarProductos(nuevoProducto);
        ProductosExistentes nuevoProductosExistentes=new ProductosExistentes(nuevoProducto, 0);
        AgregarProductosExistentes(nuevoProductosExistentes);
    }
    
    public List<ProductosExistentes> getListaProductosDisponibles(){
        List<ProductosExistentes> prodsDisponibles=new ArrayList<>();
        List<ProductosExistentes> lista=getListaProductosExistentes();
        for(ProductosExistentes nuevoProductosExistentes:lista){
            if(nuevoProductosExistentes.getProductoExistente().esDisponible()){
                prodsDisponibles.add(nuevoProductosExistentes);
            }
        }
        return prodsDisponibles;
    }
    
    public void DejarDeUtilizarProducto(String nombre){
        List<ProductosExistentes> lista=getListaProductosExistentes();
        for(ProductosExistentes nuevoProductoExistente:lista){
            if(nuevoProductoExistente.getProductoExistente().getNombre().equals(nombre)){
                nuevoProductoExistente.getProductoExistente().setEsDisponible(false);
                EditarProductosExistentes(nuevoProductoExistente);
            }
        }
    }
    
}
