/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.MateriaPrima;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Bernardo Espinoza
 */
public class SupervisorInventarioMateriaPrima {
    private AdminMateriaPrima adminMateriaPrima;

    public SupervisorInventarioMateriaPrima() {
        adminMateriaPrima = new AdminMateriaPrima();
    }
    
    public void AgregarAInventario(String nombre,int cantidadAgregada){
        List<MateriaPrima> lista=adminMateriaPrima.getListMateriaPrimaPorNombre(nombre);
        int suma=0;
        for(MateriaPrima nuevaMateriaPrima:lista){
            if(nuevaMateriaPrima.getNombre()==nombre){
                suma=nuevaMateriaPrima.getCantidad()+cantidadAgregada;
                nuevaMateriaPrima.setCantidad(suma);
                adminMateriaPrima.editarMateriaPrima(nuevaMateriaPrima);
            }
        }
    }
    
    public void QuitarDelInventario(String nombre,int cantidadAgregada){
        List<MateriaPrima> lista=adminMateriaPrima.getListMateriaPrimaPorNombre(nombre);
        int resta=0;
        for(MateriaPrima nuevaMateriaPrima:lista){
            if(nuevaMateriaPrima.getNombre()==nombre){
                resta=nuevaMateriaPrima.getCantidad()+cantidadAgregada;
                nuevaMateriaPrima.setCantidad(resta);
                adminMateriaPrima.editarMateriaPrima(nuevaMateriaPrima);
            }
        }
    }
    
    public void GestionarNuevoMaterial(MateriaPrima nuevaMateriaPrima){
        nuevaMateriaPrima.setCantidad(0);
        adminMateriaPrima.agregarMateriaPrima(nuevaMateriaPrima);
    }
    
    public List<MateriaPrima> ObtenerListadoMateriaPrima(){
        return adminMateriaPrima.getListaMateriaPrima();
    }
}
