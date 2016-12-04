/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import Negocio.Entidades.MateriaPrima;
import Negocio.Entidades.MateriaPrimaExistente;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Bernardo Espinoza
 */
public class SupervisorMateriaPrima {
    private AdminMateriaPrima materiasPrimas;
    private AdminMateriaPrimaExistente existencia;

    public SupervisorMateriaPrima() {
        materiasPrimas = new AdminMateriaPrima();
        existencia = new AdminMateriaPrimaExistente();
    }
    
    public void AgregarAInventario(MateriaPrima materiaPrima,int cantidad){
        List<MateriaPrimaExistente> lista=existencia.obtenerLista();
        int suma=0;
        for(MateriaPrimaExistente x:lista){
            if(x.getMateriaPrima()==materiaPrima){
                suma=x.getCantidad()+cantidad;
                x.setCantidad(suma);
                existencia.EditarMateriaPrimaExistente(x);
            }
        }
    }
    
    public void QuitarDelInventario(MateriaPrima materiaPrima,int cantidad){
        List<MateriaPrimaExistente> lista=existencia.obtenerLista();
        int resta=0;
        for(MateriaPrimaExistente x:lista){
            if(x.getMateriaPrima()==materiaPrima){
                resta=x.getCantidad()-cantidad;
                x.setCantidad(resta);
                existencia.EditarMateriaPrimaExistente(x);
            }
        }
    }
    
    public void GestionarNuevoMaterial(MateriaPrima materiaPrima){
        materiasPrimas.agregarMateriaPrima(materiaPrima);
        MateriaPrimaExistente matPrimaExist=new MateriaPrimaExistente(materiaPrima, 0);
        existencia.AgregarMateriaPrimaExistente(matPrimaExist);
    }
}
