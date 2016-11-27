/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosGrupoProds;
import Negocio.Entidades.ProdsVendidos;
import java.util.List;

/**
 *
 * @author DEMON
 */
public class AdminGrupoProd {
    private final AccesoDatosGrupoProds datosGrupoProds;
    
    public AdminGrupoProd(){
        datosGrupoProds = new AccesoDatosGrupoProds();
    }
    
public void AgregarGrupoProd(ProdsVendidos grupoProds){
        datosGrupoProds.insertar(grupoProds);
    }
    
    public void EditarGrupoProd(ProdsVendidos grupoProds){
        datosGrupoProds.sobrescribir(grupoProds);
    }
    
    public void BorrarGrupoProd(ProdsVendidos grupoProds){
        datosGrupoProds.borrar(grupoProds);
    }
    
    public ProdsVendidos getGrupoProdPorID(int id) {
        return datosGrupoProds.getPorID(id);
    }
    
    public List<ProdsVendidos> getListaGrupoProds() {
        return datosGrupoProds.getListaTodos();
    }
}