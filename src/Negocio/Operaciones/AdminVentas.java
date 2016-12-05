/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Negocio.Operaciones;

import DatosPersistentes.AccesoDatosVentas;
import Negocio.Entidades.Venta;
import java.util.List;

/********************************************************************** 
 
    CLASE: {@link AdminVentas}
    
    AUTOR: Mario Lopez Duran

 **********************************************************************/
public class AdminVentas {
    
    public final AccesoDatosVentas datosVenta;

    public AdminVentas() {
        this.datosVenta = new AccesoDatosVentas();
    }
    
    public void agregarVentaRegistro(Venta venta){
        datosVenta.insertar(venta);
    }
    
    public void modificarVentaRegistro(Venta venta){
        datosVenta.sobrescribir(venta);
    }
    
    public void eliminarVentaRegistro(Venta venta){
        datosVenta.borrar(venta);
    }
    
    public List<Venta> getTodasVentas(){
        return datosVenta.getListaTodos();
    }
    
}
