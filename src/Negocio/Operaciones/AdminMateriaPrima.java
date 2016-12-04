/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosMateriaPrima;
import Negocio.Entidades.MateriaPrima;
import java.util.List;

/**
 *
 * @author Bernardo Espinoza
 */
public class AdminMateriaPrima {
    private final AccesoDatosMateriaPrima accesoDatos;

    public AdminMateriaPrima() {
        accesoDatos = new AccesoDatosMateriaPrima();
    }
    
    public void agregarMateriaPrima(MateriaPrima materiaPrima){
        accesoDatos.insertar(materiaPrima);
    }
    
    public void editarMateriaPrima(MateriaPrima materiaPrima){
        accesoDatos.sobrescribir(materiaPrima);
    }
    
    public void borrarMateriaPrima(MateriaPrima materiaPrima){
        accesoDatos.borrar(materiaPrima);
    }
    
    public List<MateriaPrima> getListaMateriaPrima(){
        return accesoDatos.getListaTodos();
    }
    
    public List<MateriaPrima> getListMateriaPrimaPorNombre(String nombre){
        return accesoDatos.getPorNombre(nombre);
    }
    
}
