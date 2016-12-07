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
 * @author Mario Lopez
 */
public class AdminProductosExistentes {
    private final AccesoDatosProductosExistentes datosProductosExistentes;

    public AdminProductosExistentes() {
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
    
}
