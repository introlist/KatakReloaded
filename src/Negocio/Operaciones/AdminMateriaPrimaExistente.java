/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosMateriaPrimaExist;
import Negocio.Entidades.MateriaPrimaExistente;
import java.util.List;

/**
 *
 * @author Bernardo Espinoza
 */
public class AdminMateriaPrimaExistente {
    private final AccesoDatosMateriaPrimaExist accesoDatos; 

    public AdminMateriaPrimaExistente() {
        accesoDatos = new AccesoDatosMateriaPrimaExist();
    }
    
    public void AgregarMateriaPrimaExistente(MateriaPrimaExistente matPrimaExist){
        accesoDatos.insertar(matPrimaExist);
    }
    
    public void EditarMateriaPrimaExistente(MateriaPrimaExistente matPrimaExist){
        accesoDatos.sobrescribir(matPrimaExist);
    }
    
    public void BorrarMateriaPrimaExistente(MateriaPrimaExistente matPrimaExist){
        accesoDatos.borrar(matPrimaExist);
    }
    
    public List<MateriaPrimaExistente> obtenerLista(){
        return accesoDatos.getListaTodos();
    }
}
