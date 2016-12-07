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
    private final AccesoDatosMateriaPrima accesoDatos;

    public SupervisorInventarioMateriaPrima() {
        accesoDatos = new AccesoDatosMateriaPrima();
    }
    
    public void AgregarAInventario(String nombre,int cantidadAgregada){
        List<MateriaPrima> lista=getListMateriaPrimaPorNombre(nombre);
        int suma=0;
        for(MateriaPrima nuevaMateriaPrima:lista){
            if(nuevaMateriaPrima.getNombre().equals(nombre)){
                suma=nuevaMateriaPrima.getCantidad()+cantidadAgregada;
                nuevaMateriaPrima.setCantidad(suma);
                editarMateriaPrima(nuevaMateriaPrima);
            }
        }
    }
    
    public void QuitarDelInventario(String nombre,int cantidadAgregada){
        List<MateriaPrima> lista=getListaMateriaPrima();
        int resta=0;
        for(MateriaPrima nuevaMateriaPrima:lista){
            if(nuevaMateriaPrima.getNombre().equals(nombre)){
                resta=nuevaMateriaPrima.getCantidad()-cantidadAgregada;
                nuevaMateriaPrima.setCantidad(resta);
                editarMateriaPrima(nuevaMateriaPrima);
            }
        }
    }
    
    public void RegistrarNuevoMaterial(MateriaPrima nuevaMateriaPrima){
        nuevaMateriaPrima.setCantidad(0);
        agregarMateriaPrima(nuevaMateriaPrima);
    }
    
    public List<MateriaPrima> ObtenerListadoMateriaPrima(){
        return getListaMateriaPrima();
    }
    
    public void DejarDeUtilizarMateriaPrima(String nombre){
        List<MateriaPrima> lista=getListaMateriaPrima();
        for(MateriaPrima materiaPrima:lista){
            if(materiaPrima.getNombre().equals(nombre)){
                borrarMateriaPrima(materiaPrima);
            }
        }
    }
    
    private void agregarMateriaPrima(MateriaPrima materiaPrima){
        accesoDatos.insertar(materiaPrima);
    }
    
    private void editarMateriaPrima(MateriaPrima materiaPrima){
        accesoDatos.sobrescribir(materiaPrima);
    }
    
    private void borrarMateriaPrima(MateriaPrima materiaPrima){
        accesoDatos.borrar(materiaPrima);
    }
    
    private List<MateriaPrima> getListaMateriaPrima(){
        return accesoDatos.getListaTodos();
    }
    
    private List<MateriaPrima> getListMateriaPrimaPorNombre(String nombre){
        return accesoDatos.getPorNombre(nombre);
    }
}
