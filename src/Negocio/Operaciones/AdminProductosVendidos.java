/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosGrupoProds;
import Negocio.Entidades.ProductosVendidos;
import java.util.List;

/**
 *
 * @author DEMON
 */
public class AdminProductosVendidos {
    private final AccesoDatosGrupoProds datosGrupoProds;
    
    public AdminProductosVendidos(){
        datosGrupoProds = new AccesoDatosGrupoProds();
    }
    
public void AgregarGrupoProd(ProductosVendidos grupoProds){
        datosGrupoProds.insertar(grupoProds);
    }
    
    public void EditarGrupoProd(ProductosVendidos grupoProds){
        datosGrupoProds.sobrescribir(grupoProds);
    }
    
    public void BorrarGrupoProd(ProductosVendidos grupoProds){
        datosGrupoProds.borrar(grupoProds);
    }
    
    public ProductosVendidos getGrupoProdPorID(int id) {
        return datosGrupoProds.getPorID(id);
    }
    
    public List<ProductosVendidos> getListaGrupoProds() {
        return datosGrupoProds.getListaTodos();
    }
}