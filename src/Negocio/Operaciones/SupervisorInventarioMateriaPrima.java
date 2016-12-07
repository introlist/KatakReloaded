/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosMateriaPrima;
import Negocio.Entidades.MateriaPrima;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Bernardo Espinoza
 */
public class SupervisorInventarioMateriaPrima {
    private AdminMateriasPrimas adminMateriasPrimas;

    public SupervisorInventarioMateriaPrima() {
        adminMateriasPrimas=new AdminMateriasPrimas();
    }
    
    public void agregarCantidadAInventario(String nombre,int cantidadAgregada){
        List<MateriaPrima> lista=adminMateriasPrimas.getListMateriaPrimaPorNombre(nombre);
        int suma=0;
        for(MateriaPrima nuevaMateriaPrima:lista){
            if(nuevaMateriaPrima.getNombre().equals(nombre)){
                suma=nuevaMateriaPrima.getCantidad()+cantidadAgregada;
                nuevaMateriaPrima.setCantidad(suma);
                adminMateriasPrimas.editarMateriaPrima(nuevaMateriaPrima);
            }
        }
    }
    
    public void quitarCantidadDelInventario(String nombre,int cantidadAgregada){
        List<MateriaPrima> lista=adminMateriasPrimas.getListaMateriaPrima();
        int resta=0;
        for(MateriaPrima nuevaMateriaPrima:lista){
            if(nuevaMateriaPrima.getNombre().equals(nombre)){
                resta=nuevaMateriaPrima.getCantidad()-cantidadAgregada;
                nuevaMateriaPrima.setCantidad(resta);
                adminMateriasPrimas.editarMateriaPrima(nuevaMateriaPrima);
            }
        }
    }
    
    public void registrarNuevoMaterial(MateriaPrima nuevaMateriaPrima){
        nuevaMateriaPrima.setCantidad(0);
        adminMateriasPrimas.agregarMateriaPrima(nuevaMateriaPrima);
    }
    
    public List<MateriaPrima> getListadoMateriaPrima(){
        return adminMateriasPrimas.getListaMateriaPrima();
    }
    
    public void borrarMateriaPrima(String nombre){
        List<MateriaPrima> lista=adminMateriasPrimas.getListaMateriaPrima();
        for(MateriaPrima materiaPrima:lista){
            if(materiaPrima.getNombre().equals(nombre)){
                adminMateriasPrimas.borrarMateriaPrima(materiaPrima);
            }
        }
    }        
}
