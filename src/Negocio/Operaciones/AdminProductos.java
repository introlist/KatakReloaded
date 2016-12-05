/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosProductos;
import Negocio.Entidades.Producto;
import java.util.ArrayList;
import java.util.List;
/********************************************************************** 
 
    CLASE: {@link AdminProductos}
    
    AUTOR: Roberto Gil Flores

 **********************************************************************/
public class AdminProductos {
    private final AccesoDatosProductos accesoDatosProductos;
    
    public AdminProductos(){
        accesoDatosProductos = new AccesoDatosProductos();
    }
    
    public void AgregarProductos(Producto producto){
        accesoDatosProductos.insertar(producto);
    }
    
    public void EditarProductos(Producto producto){
        accesoDatosProductos.sobrescribir(producto);
    }
    
    public void BorrarProductos(Producto producto){
        accesoDatosProductos.borrar(producto);
    }
    
    public List<Producto> getListaProductosPorNombre(String nombreProducto) {
        return accesoDatosProductos.getPorNombre(nombreProducto);
    }
    
    public List<Producto> getListaProductosDisponibles(){
        return accesoDatosProductos.getPorDisponibilidad(true);
    }
    
    public List<Producto> getListaProductosNoDisponibles(){
        return accesoDatosProductos.getPorDisponibilidad(false);
    }
            
            
    public Producto getProductosPorNombre(String nombreProducto){
        List<Producto> resultados;
        resultados = getListaProductosPorNombre(nombreProducto);
        return resultados.get(0);
    }
    
    public List<Producto> getListaProductos() {
        return accesoDatosProductos.getListaTodos();
    }
        
    public List<String> getListaNombresProductos(List<Producto> listaProductos) {
        List listaNombresProductos = new ArrayList();
        for(Producto producto : listaProductos){
            listaNombresProductos.add(producto.getNombre());
        }
        return listaNombresProductos;
    }
    
    public List<String> getNombresProductosDisponibles(){
        return getListaNombresProductos(accesoDatosProductos.getPorDisponibilidad(true));
    }
    
    public List<String> getNombresTodosProductos() {
        return getListaNombresProductos(accesoDatosProductos.getListaTodos());
    }

    private boolean verificarNombreProductoNuevo(Producto producto) {
        List<Producto> coincidencias;
        coincidencias = getListaProductosPorNombre(producto.getNombre());
        return coincidencias.size()>0;
    }
}
